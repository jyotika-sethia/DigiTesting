package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UpdatePPPage;

public class ProfilePictureTest extends BaseClass {
	LoginPage lp;
	UpdatePPPage up;
	
	@BeforeClass
	public void set()
	{
		lp=new LoginPage(driver);
		up=new UpdatePPPage(driver);
	}
	
	@Test
	public void set_ProfileImage() throws InterruptedException
	{
		lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
		Thread.sleep(2000);
		up.setProfilePicture();
		
	}

}
