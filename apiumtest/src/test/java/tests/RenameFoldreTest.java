package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.LoginPage;
import pages.RenameFolderPage;

public class RenameFoldreTest extends BaseClass {
	LoginPage lp;
	RenameFolderPage rf;

	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		rf=new RenameFolderPage(driver);
	}
	
	@Test
	public void setFColor() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(6000);
		rf.renameFolder("Photoss");
	}


}
