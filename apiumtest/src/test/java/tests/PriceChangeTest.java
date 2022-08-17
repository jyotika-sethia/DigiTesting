package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.PriceChangePage;

public class PriceChangeTest extends BaseClass{

	PriceChangePage pcp;
	
	
	@BeforeClass
	public void call()
	{
		pcp=new PriceChangePage(driver);
		
	}
	
	@Test()
	public void priceChange() throws InterruptedException
	{
		pcp.createAccDetail();
		Thread.sleep(3000);
		System.out.println("5");
		pcp.messageDisplayed();
		
		
	}
	
	
	
}
