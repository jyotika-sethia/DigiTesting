package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateFolderPage;
import pages.DeleteBothPage;
import pages.DeletefRecyclePage;
import pages.LoginPage;
import pages.UploadImagePage;

public class DeleteBothTest extends BaseClass {
	
	LoginPage lp;
	CreateFolderPage cp;
	DeleteBothPage dr;
	
	@BeforeTest
	public void call()
	{
		lp=new LoginPage(driver);
		cp = new CreateFolderPage(driver);
		dr=new DeleteBothPage(driver);
	}
	
	@Test
	public void deleteFromRecycle() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cp.CFolder("test123");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.deleteFromKebab();
		dr.checkrecycle();
		dr.display();
//		Assert.assertEquals("test1","The folder is deleted");
		
		
	}

}
