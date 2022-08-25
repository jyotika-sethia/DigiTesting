package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class StarPage {

AppiumDriver driver;
	
	public StarPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
	WebElement menu;			 	
	
	@FindBy(how=How.ID,using= "com.liqvd.digibox.test:id/llQuickAccess")
	WebElement quickacess;
	
	@FindBy(how=How.ID,using= "com.liqvd.digibox.test:id/llShared")
	WebElement shared;
	
	@FindBy(how=How.XPATH,using= "(//android.widget.ImageView[@content-desc=\"star\"])[1]")
	WebElement star;
	
	@FindBy(how=How.XPATH,using= "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView")
	WebElement home;
	
	public void star_quickacess()
	{
		menu.click();
		quickacess.click();
		star.click();
	}
	
	public void star_shared()
	{
		star.click();
		menu.click();
		shared.click();
		star.click();
	}
	
	public void star_myboxx()
	{
		star.click();
		home.click();
		shared.click();
		star.click();
	}
	
	
	}
