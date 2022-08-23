package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateFolderPage;
import pages.LoginPage;
import pages.OptionDisplayPage;
import pages.OptionDisplayedPage;

public class OptionDisplayTest extends BaseClass{
	LoginPage login;
	OptionDisplayPage od;
	CreateFolderPage cf;
	
	@BeforeTest
	public void page()
	{
	 login = new LoginPage(driver);
	 od= new OptionDisplayPage(driver);
	 cf = new CreateFolderPage(driver);
	}
	
	
	
	
	
	@Test
	public void folder_select() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    login.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		
		cf.CFolder("Test12");
		
		od.quickacess();
		
		Assert.assertEquals(true, od.displayed());
		
		
	}

}
