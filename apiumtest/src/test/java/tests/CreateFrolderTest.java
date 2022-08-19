package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import pages.CreateFolderPage;
import pages.LoginPage;

public class CreateFrolderTest extends BaseClass {
	
	
	LoginPage lp;
	CreateFolderPage cp;
	
	@BeforeTest
	public void call()
	{
		lp=new LoginPage(driver);
		cp = new CreateFolderPage(driver);	}
	
	@Test
	public void folder() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(4000);
		cp.CFolder("photos");
	}
	
}
