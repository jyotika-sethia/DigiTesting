package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class PriceChangePage {
	
	
	AppiumDriver driver;
	
	
	public PriceChangePage(AppiumDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="com.android.permissioncontroller:id/permission_deny_button")
	WebElement dontAllow;	

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnSkipIntroSlideOne")
	WebElement skip;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/create_new_account")
	WebElement create;

	@FindBy(how=How.XPATH, using ="	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")
	WebElement monthlyTab;
	
	@FindBy(how=How.XPATH, using ="	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[1]")
	WebElement yearlyTab;
	
	@FindBy(how=How.XPATH, using="	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View")
	WebElement display; 
	
	
	public void createAccDetail() throws InterruptedException
	{
	
//		dontAllow.click();
		System.out.println("1");
		Thread.sleep(2000);
		skip.click();
		Thread.sleep(1000);
		System.out.println("2");
		create.click();
		
		System.out.println("3");
		Thread.sleep(8000);
		yearlyTab.click();
//		monthlyTab.click();

		
		Thread.sleep(6000);
	
	}
	public void messageDisplayed() throws InterruptedException
	{
		Thread.sleep(4000);
		display.isDisplayed();
		System.out.println("The message is"+display.getText());
	}
	
	
}
