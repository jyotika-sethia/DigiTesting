package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubFolderPage;

public class SubFolderTest extends BaseClass {
	LoginPage lp;
	SubFolderPage sf;
	
	@BeforeClass
	public void call()
	{
		lp= new LoginPage(driver);
		sf= new SubFolderPage(driver);
	}

	@Test
	public void createSubFolder() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(6000);
		sf.createSFolder("sub-photo");
	}
}
