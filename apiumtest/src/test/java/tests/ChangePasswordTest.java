package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
		Thread.sleep(2000);
		cp.change_password("Gaurav@123", "Test@123", "Test@123");
	}
	

	
}
