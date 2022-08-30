package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SharePage;
import pages.ViewerTypePage;

public class ViewerTypeTest  extends BaseClass{
	
	

	LoginPage lp;
	ViewerTypePage vtp;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);

		vtp= new ViewerTypePage(driver);
	}

	@Test
	public void viewerOptiom() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		vtp.listoption();
		


		
	}

}
