package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddTagPage;
import pages.LoginPage;
import pages.MovePage;

public class MoveTest  extends BaseClass{
	
	

	LoginPage lp;
	MovePage mp;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);

		mp= new MovePage(driver);
	}

	@Test
	public void uploadImages() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mp.moveFolder("folder11");
		mp.moveimage();

		
	}


}
