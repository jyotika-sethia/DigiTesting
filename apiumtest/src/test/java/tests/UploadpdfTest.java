package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadpdfPage;

public class UploadpdfTest extends BaseClass{
	LoginPage lp;
	UploadpdfPage pd;
	
	
	@BeforeClass
	public void call()
	{
		lp= new LoginPage(driver);
		pd=new UploadpdfPage(driver);
	}

	@Test
	public void pdfUpload() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(4000);
		pd.UploadPdf();
	}
}
