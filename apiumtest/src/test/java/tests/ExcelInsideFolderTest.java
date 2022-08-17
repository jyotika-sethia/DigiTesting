package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import pages.ExcelInsideFolderPage;
import pages.LoginPage;
import pages.UploadexcelPage;

public class ExcelInsideFolderTest extends BaseClass{
	
	LoginPage lp;
	UploadexcelPage ep;
	ExcelInsideFolderPage efp;
	
	@BeforeClass
	public void addFile()
	{
		lp=new LoginPage(driver);
		efp = new ExcelInsideFolderPage(driver);
		ep =new UploadexcelPage(driver);
	}

	@Test
	public void Uploadexcel() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		efp.folder();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ep.upexcel();
	}
}