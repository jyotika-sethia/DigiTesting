package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadImagePage;

public class UploadImageTest extends BaseClass{
	
	
	UploadImagePage image;
	LoginPage lp;
	
	@BeforeClass
	public void addFile()
	{
		lp=new LoginPage(driver);
		image=new UploadImagePage(driver);
	}

	@Test
	public void uploadImages() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(4000);
		image.selectImage();
		
	}
}
