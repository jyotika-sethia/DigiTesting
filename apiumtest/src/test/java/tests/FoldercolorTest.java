package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FoldercolorPage;
import pages.LoginPage;

public class FoldercolorTest extends BaseClass {
	LoginPage lp;
	FoldercolorPage fc;

	@BeforeClass
	public void call()
	{
		lp=new LoginPage(driver);
		fc=new FoldercolorPage(driver);
	}
	
	@Test
	public void setFColor() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(4000);
		fc.color();
	}
}
