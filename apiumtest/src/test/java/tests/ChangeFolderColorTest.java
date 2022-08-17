package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChangeFolderColorPage;
import pages.LoginPage;

public class ChangeFolderColorTest  extends BaseClass{
	LoginPage lp;
	ChangeFolderColorPage cfc;

	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		cfc=new ChangeFolderColorPage(driver);
	}
	
	@Test
	public void setFColor() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(4000);
		cfc.color();
	}


}
