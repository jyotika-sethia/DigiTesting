package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FileTagPage;
import pages.LoginPage;
import pages.UploadImagePage;

public class FileTagTest extends BaseClass{
	
	

	LoginPage lp;
	FileTagPage ft;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);
		
		ft =new FileTagPage(driver);
	}

	@Test
	public void file_Tag() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		image.selectImage();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ft.tag();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		String name=ft.tagName();
//		Assert.assertEquals("jpg",ft.tagName());
		Assert.assertEquals(ft.tagName(),"jpg");
		
	}

}
