package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class RestorefRecyclePage {
	AppiumDriver driver;
	
	public RestorefRecyclePage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
	WebElement menu;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llRecycleBin")
	WebElement bin;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.CheckBox")
	WebElement option;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivRestoreAsset")
	WebElement restore;       	
//	xpath for restore =/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]

	public void restore() throws InterruptedException
	{
		Thread.sleep(2000);
		menu.click();
		Thread.sleep(4000);
		bin.click();
		Thread.sleep(2000);
		option.click();
		Thread.sleep(2000);
		restore.click();
		
	}

	
}
