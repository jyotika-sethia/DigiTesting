package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.PriceChangePage;

public class PriceChangeTest extends BaseClass{

	PriceChangePage pcp;
	
	
	@BeforeTest
	public void call()
	{
		pcp=new PriceChangePage(driver);
		
	}
	
	@Test()
	public void priceChange() throws InterruptedException
	{
		pcp.createAccDetail();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pcp.planA();
		Assert.assertEquals("Its 10% discount", "324/yr");
		Assert.assertEquals("324/yr", "pcp.display()");
		
		
	}
	
	
	
}
