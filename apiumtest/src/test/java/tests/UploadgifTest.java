package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import pages.UploadgifPage;

public class UploadgifTest extends BaseClass {
	
	LoginPage lp;
	UploadgifPage ugp;
	
	@BeforeClass
	public void addFile()
	{
		lp=new LoginPage(driver);
		ugp=new UploadgifPage(driver);
	}

	@Test
	public void uploadgif() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(4000);
		ugp.upGif();
		
	}

}
