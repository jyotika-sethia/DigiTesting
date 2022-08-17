package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PdfInsideFolderPage;
import pages.UploadpdfPage;

public class PdfInsideFolderTest extends BaseClass{

	LoginPage lp;
	PdfInsideFolderPage pdf;
	UploadpdfPage pd;
	
	
	@BeforeClass
	public void call()
	{
		lp= new LoginPage(driver);
		pdf=new PdfInsideFolderPage(driver);
		pd=new UploadpdfPage(driver);
	}

	@Test
	public void pdfUpload() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(4000);
		pdf.myfolder();
		Thread.sleep(2000);
		pd.UploadPdf();
	}
}
