package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SelectAllCheckboxPage;

public class DeselectAllCheckboxTest extends BaseClass {
	LoginPage lp;
	SelectAllCheckboxPage sc;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		sc=new SelectAllCheckboxPage(driver);
	}
	
	@Test
	public void select() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(8000);
		sc.selectAll();
		Thread.sleep(6000);
		sc.DeselectAll();
	}

}
