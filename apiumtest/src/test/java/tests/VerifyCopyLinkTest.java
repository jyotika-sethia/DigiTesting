package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateFolderPage;
import pages.LoginPage;
import pages.UploadImagePage;
import pages.VerifyCopyLinkPage;

public class VerifyCopyLinkTest extends BaseClass {
	
	
	LoginPage lp;
	UploadImagePage image;
	CreateFolderPage cp;
	VerifyCopyLinkPage vc;
	
	@BeforeTest
	public void call()
	{
		lp=new LoginPage(driver);
		image=new UploadImagePage(driver);
		cp = new CreateFolderPage(driver);
		vc= new VerifyCopyLinkPage(driver);
	}
	
	@Test
	public void folder() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cp.CFolder("Test");
//		image.selectImage();
		vc.copylink();
		
	}

}
