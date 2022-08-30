package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SharePage;
import pages.ShareSameUserPage;

public class ShareSameUserTest extends BaseClass{
	
	

	LoginPage lp;
	SharePage sp;
	ShareSameUserPage ssu;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);

		sp= new SharePage(driver);
		ssu= new ShareSameUserPage(driver);
	}

	@Test
	public void sharSame() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sp.share("mozark10251093@gmail.com");
		ssu.click_ok();
		ssu.sharesame("mozark10251093@gmail.com");
		String title="Folder has already shared to user mozark10251093@gmail.com";
		Assert.assertEquals(sp.message(), title,"It is already shared");


		
	}

}
