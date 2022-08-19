package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateFolderPage;
import pages.LoginPage;
import pages.OptionDisplayedPage;

public class OptionDisplayedTest extends BaseClass{
	LoginPage login;
	OptionDisplayedPage od;
	CreateFolderPage cf;
	
	@BeforeTest
	public void page()
	{
	 login = new LoginPage(driver);
	 od= new OptionDisplayedPage(driver);
	 cf = new CreateFolderPage(driver);
	}
	
//	@Test(priority=1)
//	public void optionDisplay() throws InterruptedException {
//		
//		login.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
//		Thread.sleep(5000);
//		od.selectAll();
//		Assert.assertEquals(true, od.displayed());;

		
//	}
	@Test
	public void folder_selection() throws InterruptedException{
//		Thread.sleep(5000);
//		od.selectAll();
		login.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(2000);
		cf.CFolder("Test123");
		Thread.sleep(2000);
		od.selectAll();
		Thread.sleep(2000);
		Assert.assertEquals(true, od.displayed());;
		
		
	}

}
