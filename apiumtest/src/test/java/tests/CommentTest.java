package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CommentPage;
import pages.FileTagPage;
import pages.LoginPage;

public class CommentTest extends BaseClass{
	
	

	LoginPage lp;
	 CommentPage cp;
	
	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);
		
		cp =new  CommentPage(driver);
	}

	@Test
	public void file_Tag() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cp.comment("It is scenary");
		Assert.assertEquals(cp.messgae(),"It is scenary");

		
	}
}
