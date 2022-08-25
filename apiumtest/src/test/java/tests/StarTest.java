package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CommentPage;
import pages.LoginPage;
import pages.StarPage;

public class StarTest extends BaseClass{
	
	

	LoginPage lp;
	StarPage sp;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);
		
		sp =new  StarPage(driver);
	}

	@Test
	public void file_Tag() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sp.star_quickacess();
//		Thread.sleep(5000);
//		sp.star_shared();
//		Thread.sleep(5000);
//		sp.star_myboxx();

	}
}
