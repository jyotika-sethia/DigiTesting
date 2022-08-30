package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MovePage;
import pages.SharePage;

public class ShareTest  extends BaseClass{
	
	

	LoginPage lp;
	SharePage sp;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);

		sp= new SharePage(driver);
	}

	@Test
	public void uploadImages() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sp.share("mozark10251093@gmail.com");
		String title="Asset(s) has been shared successfully";
		Assert.assertEquals(sp.message(), title);


		
	}

}
