package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ChangeFolderColorPage {
AppiumDriver driver;
	

	public ChangeFolderColorPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[1]")
	WebElement option;			  	

	
	@FindBy(how=How.ID,using ="com.liqvd.digibox.test:id/textView10")
	WebElement cchange;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.View")
	WebElement choosecolor;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnApply")
	WebElement apply;
	
	public void color() throws InterruptedException
	{
		Thread.sleep(2000);
		option.click();
		Thread.sleep(2000);
		cchange.click();
		choosecolor.click();
		apply.click();
		
	}

}
