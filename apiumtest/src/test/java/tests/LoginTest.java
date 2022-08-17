package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{
	LoginPage login;
	
	@BeforeTest
	public void page()
	{
	 login = new LoginPage(BaseClass.driver);
	}
	
	@Test
	public void login() throws InterruptedException {
		
		login.loginDetail("intern6", "testing2510935@gmail.com","Gaurav@123");
//		login.allowEntry();
//		login.clickNext1();
//		login.clickNext2();
//		login.clickStart();
//		login.enterDigiSpace();
//		login.enterEmail();
//		login.enterPassword();
//		login.clickLogin();
		
	}
	
	
	

}
