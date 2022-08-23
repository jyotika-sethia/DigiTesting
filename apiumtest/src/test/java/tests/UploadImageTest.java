package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadImagePage;

public class UploadImageTest extends BaseClass{
	
	
	UploadImagePage image;
	LoginPage lp;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);
		image=new UploadImagePage(driver);
	}

	@Test
	public void uploadImages() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		image.selectImage();
		
	}
}
