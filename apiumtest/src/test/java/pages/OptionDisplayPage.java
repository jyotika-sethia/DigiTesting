package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class OptionDisplayPage {
	
	
	AppiumDriver driver;
	
	
	public OptionDisplayPage(AppiumDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	
	
	
	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/ivMultipleMoveFolder")
	WebElement move;
	
	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/ivDownlaodAll")
	WebElement download;

	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/ivDelete")
	WebElement delete;

	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/ivAssignAssetsUser")
	WebElement share;
	
								   
	@FindBy(how=How.XPATH, using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
	WebElement option;
	
	@FindBy(how=How.ID, using ="com.liqvd.digibox.test:id/llQuickAccess")
	WebElement quickacess;
	
	@FindBy(how=How.XPATH, using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.CheckBox")
	WebElement select;
	
	
	public void quickacess() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		option.click();
		quickacess.click();
		select.click();
	
	}
	
	
	public boolean displayed() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		move.isEnabled();
		
		download.isEnabled();
		
		delete.isEnabled();
		
		return share.isEnabled();
	}

}
