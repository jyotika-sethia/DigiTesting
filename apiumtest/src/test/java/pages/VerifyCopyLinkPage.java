package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class VerifyCopyLinkPage {
	
	AppiumDriver driver;
	
	public VerifyCopyLinkPage(AppiumDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivTypeView")
	WebElement kebab;  
	
	@FindBy(how=How.XPATH, using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[1]")
	WebElement selection;
	
//	@FindBy(how=How.XPATH,using ="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[4]")
//	WebElement option;

	
	//Cannot find this link	
	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/itemAssignUser")
	WebElement share;

	
	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/tvGetAPublicLink")
	WebElement shareable;
	
	@FindBy(how=How.XPATH, using="//*[@text='Copy']")
	WebElement copy;
	
//	@FindBy(how=How.XPATH, using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView")
//	WebElement copy;

	
		
	
	public void copylink()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		kebab.click();
		selection.click();
		share.click();
		shareable.click();
		copy.click();
	}	

}
