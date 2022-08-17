package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DeletefRecyclePage {
	AppiumDriver driver;
	
	public DeletefRecyclePage(AppiumDriver driver)
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
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivDelete")
	WebElement delete;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvContinue")
	WebElement confirm;
	
		public void deletefbin() throws InterruptedException
	{
		Thread.sleep(2000);
		menu.click();
		Thread.sleep(3000);
		bin.click();
		Thread.sleep(3000);
		option.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		confirm.click();
	}
	

}
