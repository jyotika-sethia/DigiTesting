package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FilterPage;
import pages.LoginPage;
import pages.SpecificFilterPage;


public class SpecificFilterTest extends BaseClass {
	LoginPage lp;
	SpecificFilterPage sfp;
	
	
	@BeforeTest
	public void call()
	{
		lp=new LoginPage(driver);
		sfp=new SpecificFilterPage(driver);
	}

	@Test
	public void specififilter() throws InterruptedException 
	{
		lp.loginDetail("testing2510935@gmail.com","Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sfp.applyFilter();
		sfp.selected();
		Assert.assertTrue(true, "Filter not applied");
	}

}
