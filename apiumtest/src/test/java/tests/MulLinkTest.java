package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.CopyLinkPage;
import pages.LoginPage;
import pages.MulLinkPage;

public class MulLinkTest extends BaseClass{
	

LoginPage lp;
MulLinkPage mlp;

@BeforeTest
public void addFile()
{
	lp=new LoginPage(driver);

	mlp= new MulLinkPage(driver);
}

@Test
public void mulcopied_link() throws InterruptedException
{
	lp.loginDetail("testing2510935@gmail.com", "Gaurav@123");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	mlp.mul_select();
	mlp.get_link();
	Assert.assertTrue(true);



	
}

}
