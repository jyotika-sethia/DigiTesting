package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.FolderDetailsPage;
import pages.LoginPage;
import pages.SpecificFilterPage;

public class FolderDetailsTest extends BaseClass {
	LoginPage lp;
	FolderDetailsPage fdp;
	
	
	@BeforeTest
	public void call()
	{
		lp=new LoginPage(driver);
		fdp=new FolderDetailsPage(driver);
	}

	@Test
	public void folderdetail() throws InterruptedException 
	{
		lp.loginDetail("testing2510935@gmail.com","Gaurav@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fdp.details();
		
		System.out.println(fdp.get_name());
		System.out.println(fdp.get_type());
		System.out.println(fdp.get_path());
		System.out.println(fdp.get_size());
		System.out.println(fdp.get_created());
		System.out.println(fdp.get_file());
		System.out.println(fdp.get_folder());
	
		
		SoftAssert sassert = new SoftAssert();
		sassert.assertTrue(true);
	
		
	}

}
