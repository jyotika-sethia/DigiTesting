package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ChangeColorBothPage;
import pages.ChangeFolderColorPage;
import pages.LoginPage;

public class ChangeColorBothTest extends BaseClass{
	LoginPage lp;
	ChangeFolderColorPage cfc;
	ChangeColorBothPage cc;

	@BeforeTest
	public void call()
	{
		lp=new LoginPage(driver);
		cfc=new ChangeFolderColorPage(driver);
		cc=new ChangeColorBothPage(driver);
	}
	
	@Test
	public void setFColor() throws InterruptedException
	{
		lp.loginDetail("intern6", "testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(4000);
		cfc.color();
		Thread.sleep(2000);
		cc.coloroption();
	}

}
