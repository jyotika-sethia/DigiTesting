package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.ChangePasswordPage;
import pages.LoginPage;

public class ChangePasswordTest extends BaseClass{

	LoginPage lp;
	ChangePasswordPage cp;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		cp=new ChangePasswordPage(driver);
	}
	
	@Test
	public void Change_Password() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cp.change_password("Gaurav@123", "Test@123", "Test@123");
		cp.login_again();
		lp.loginAgainDetail("intern6", "testing2510935@gmail.com","Test@123");
		String new_passowrd="Test@123";
		Assert.assertEquals(new_passowrd, lp.password());
	}
	

	
}
