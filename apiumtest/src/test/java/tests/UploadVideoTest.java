package tests;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadVideoPage;

public class UploadVideoTest extends BaseClass{
	

	LoginPage lp;
	UploadVideoPage video;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		video=new UploadVideoPage(driver);
	}

	@Test
	public void uploadVideo() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(4000);
		video.uploadVideo();

		}
}
