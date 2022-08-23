package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class AddTagPage {
	
	AppiumDriver driver;
	
	public AddTagPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/androidx.cardview.widget.CardView[1]")
	WebElement select;			 	
	
	
	@FindBy(how=How.ID,using ="com.liqvd.digibox.test:id/rlOverview")
	WebElement overview;
	
	@FindBy(how=How.ID,using ="com.liqvd.digibox.test:id/cardOverviewEdit")
	WebElement edit;
	
	@FindBy(how=How.ID,using ="com.liqvd.digibox.test:id/edtChipsOverview")
	WebElement tagname;
	
	@FindBy(how=How.ID,using ="com.liqvd.digibox.test:id/btnUpdateOverview")
	WebElement update;
	
	
	public void tagName(String arg)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		select.click();
		overview.click();
		edit.click();
		tagname.sendKeys(arg);
		update.click();
		
	}
	
	
	
	

}
