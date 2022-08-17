package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MultipleImagePage;
import pages.MultipleVideoPage;

public class MultipleVideoTest extends BaseClass{
	LoginPage lp;
	MultipleVideoPage mv;

	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);
		mv=new MultipleVideoPage(driver);
	}

	@Test
	public void uploadVideo() throws InterruptedException
	{
		System.out.println("1");
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(3000);
		mv.multiple();

	
	}

}
