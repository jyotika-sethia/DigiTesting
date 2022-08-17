package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MVInsideFolderPage;
import pages.MultipleVideoPage;

public class MVInsideFolderTest extends BaseClass{
	LoginPage lp;
	MVInsideFolderPage mvf;
	MultipleVideoPage mv;

	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);
		mvf=new MVInsideFolderPage(driver);
		mv=new MultipleVideoPage(driver);
	}

	@Test
	public void uploadVideo() throws InterruptedException
	{
		System.out.println("1");
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(3000);
		mvf.myfolder();
		Thread.sleep(2000);
		mv.multiple();

	
	}

}
