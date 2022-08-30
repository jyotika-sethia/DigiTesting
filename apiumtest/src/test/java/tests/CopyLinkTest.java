package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.CopyLinkPage;
import pages.LoginPage;
import pages.ViewerTypePage;

public class CopyLinkTest extends BaseClass{
				

			LoginPage lp;
			CopyLinkPage clp;
			
			@BeforeTest
			public void addFile()
			{
				lp=new LoginPage(driver);

				clp= new CopyLinkPage(driver);
			}

			@Test
			public void copied_link() throws InterruptedException
			{
				lp.loginDetail("intern6", "testing2510935@gmail.com", "Gaurav@123");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clp.copy_link();
				String mess="Link copied successfully.";
				Assert.assertEquals(mess, clp.message());


				
			}

}
