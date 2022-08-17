package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FilterPage;
import pages.LoginPage;

public class FilterTest extends BaseClass {
	LoginPage lp;
	FilterPage fp;
	
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		fp=new FilterPage(driver);
	}

	@Test
	public void filter() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(4000);
		fp.applyFilter();
	}
}
