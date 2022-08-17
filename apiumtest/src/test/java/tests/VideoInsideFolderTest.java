package tests;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UploadVideoPage;
import pages.VideoInsideFolderPage;

public class VideoInsideFolderTest extends BaseClass {
	LoginPage lpg;
	VideoInsideFolderPage vp;
	UploadVideoPage video;
	
	
	@BeforeTest
	public void call()
	{
		lpg=new LoginPage(driver);
		vp=new VideoInsideFolderPage(driver);
		video=new UploadVideoPage(driver);
	}

	@Test
	public void uploadVideoInsideFolder() throws InterruptedException
	{
		
		System.out.println("1");
		lpg.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
//		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(4000);
		System.out.println("nextpage");
		vp.folder();
		Thread.sleep(2000);
		System.out.println("nextpage1");
		video.uploadVideo();

		}

}
