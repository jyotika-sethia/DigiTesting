package tests;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MultipleImagePage;

	public class MultipleImageTest  extends BaseClass{
		LoginPage lp;
		MultipleImagePage mi;
	
		@BeforeTest
		public void addFile()
		{
			lp=new LoginPage(driver);
			mi=new MultipleImagePage(driver);
		}

		@Test
		public void uploadImages() throws InterruptedException
		{
			System.out.println("1");
			lp.loginDetail("intern6","testing2510935@gmail.com","Gaurav@123");
			Thread.sleep(3000);
			mi.multiple();
//			System.out.println("go to select multple method");
//			image.selectMultiple();
		
		}

}
