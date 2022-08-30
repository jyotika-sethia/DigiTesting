package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.ChangePasswordPage;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseClass{

	LoginPage lp;
	LogoutPage lgp;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		lgp=new LogoutPage(driver);
	}
	
	@Test
	public void Change_Password() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		String text=lp.text();
		Assert.assertEquals("Welcome to DigiBoxx", "Home", text);
		
		lgp.logout();
		
	}	
}
