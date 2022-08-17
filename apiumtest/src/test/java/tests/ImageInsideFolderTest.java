package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ImageInsideFolderPage;
import pages.LoginPage;
import pages.UploadImagePage;

public class ImageInsideFolderTest extends BaseClass{
	
	LoginPage lp;
	ImageInsideFolderPage ifp;
	UploadImagePage uip;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		ifp=new ImageInsideFolderPage(driver);
		uip=new UploadImagePage(driver);
	}
	
	
	@Test
	public void imageInsideFolder() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(6000);
		ifp.image();
		Thread.sleep(6000);

		uip.selectImage();
	}
	

}
