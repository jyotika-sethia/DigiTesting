package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddTagPage;
import pages.LoginPage;
import pages.UploadImagePage;

public class AddTagTest extends BaseClass{
	
	

	LoginPage lp;
	AddTagPage at;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);

		at= new AddTagPage(driver);
	}

	@Test
	public void uploadImages() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		image.selectImage();
		at.tagName("scenary");
		
	}

}
