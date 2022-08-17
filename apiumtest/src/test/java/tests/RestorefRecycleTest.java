package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.RestorefRecyclePage;
import pages.LoginPage;

public class RestorefRecycleTest extends BaseClass {
	
	LoginPage lp;
	RestorefRecyclePage rr;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		rr=new RestorefRecyclePage(driver);
	}
	
	@Test
	public void deleteFromRecycle() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(3000);
		rr.restore();
	}

}
