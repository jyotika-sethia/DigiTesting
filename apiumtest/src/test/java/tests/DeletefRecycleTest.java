package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DeletefRecyclePage;
import pages.LoginPage;

public class DeletefRecycleTest extends BaseClass {
	
	LoginPage lp;
	DeletefRecyclePage dr;
	
	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		dr=new DeletefRecyclePage(driver);
	}
	
	@Test
	public void deleteFromRecycle() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(3000);
		dr.deletefbin();
	}
}
