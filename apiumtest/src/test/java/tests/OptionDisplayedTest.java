package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.OptionDisplayedPage;

public class OptionDisplayedTest extends BaseClass{
	LoginPage login;
	OptionDisplayedPage od;
	
	@BeforeClass
	public void page()
	{
	 login = new LoginPage(driver);
	 od= new OptionDisplayedPage(driver);
	}
	
	@Test
	public void optionDisplay() throws InterruptedException {
		
		login.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		Thread.sleep(5000);
		od.selectAll();

		
	}

}
