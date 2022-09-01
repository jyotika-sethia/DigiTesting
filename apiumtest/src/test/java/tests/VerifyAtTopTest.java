package tests;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateFolderPage;
import pages.LoginPage;
import pages.VerifyAtTopPage;

public class VerifyAtTopTest extends BaseClass {
	
	
	LoginPage lp;
	CreateFolderPage cp;
	VerifyAtTopPage vat;
	
	@BeforeTest
	public void call()
	{
		lp=new LoginPage(driver);
		cp = new CreateFolderPage(driver);	
		vat= new VerifyAtTopPage(driver);
	
	}
	@Test
	public void folder() throws InterruptedException
	{
		lp.loginDetail( "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(4000);
		cp.CFolder("folder11");
		String name ="folder11";
		String unexpected=vat.folder_name();
//		Assert.assertNotSame(unexpected,name,"Folder is at Top");
		Assert.assertEquals("Folder is not at the top page",name,unexpected);
		
	}

}
