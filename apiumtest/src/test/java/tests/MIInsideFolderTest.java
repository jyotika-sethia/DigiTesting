package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MIInsideFolderPage;
import pages.MultipleImagePage;

public class MIInsideFolderTest extends BaseClass{
	LoginPage lp;
	MIInsideFolderPage mif;
	MultipleImagePage mi;

	@BeforeTest
	public void addFile()
	{
		lp=new LoginPage(driver);
		mif=new MIInsideFolderPage(driver);
		mi=new MultipleImagePage(driver);
	}

	@Test
	public void uploadImages() throws InterruptedException
	{
		System.out.println("1");
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(2000);
		mif.folder();
		Thread.sleep(3000);
		mi.multiple();

	
	}
	

}
