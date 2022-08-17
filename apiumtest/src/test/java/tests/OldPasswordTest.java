package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChangePasswordPage;
import pages.LoginPage;

public class OldPasswordTest extends BaseClass{

	LoginPage lp;
	ChangePasswordPage cp;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		cp=new ChangePasswordPage(driver);
	}
	
	
	@Test
	public void Old_Password() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Test@123");
		Thread.sleep(2000);
		cp.change_password("Test@123", "Gaurav@123", "Gaurav@123");
	}

}
