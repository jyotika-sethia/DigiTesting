package pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DeleteBothPage {
	
	AppiumDriver driver;
	
	public DeleteBothPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.CheckBox")
	WebElement folder;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivTypeView")
	WebElement kebab;
	
	@FindBy(how=How.XPATH,using="(//*[@resource-id='com.liqvd.digibox.test:id/ivMenu'])[4]")
	WebElement select;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/itemDeleteFolder")
	WebElement delete;

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvContinue")
	WebElement confirm;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
	WebElement option;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llRecycleBin")
	WebElement recycle;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvName")
	WebElement name;
	
	public void deleteFromKebab() throws InterruptedException
	{
		
		kebab.click();
//		Thread.sleep(3000);
	
		select.click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		delete.click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		confirm.click();
		
	}
	public void checkrecycle()
	{
	
		option.click();
		recycle.click();
		
		  
	}
	
	public void display()
	{
		String displayed = name.getTagName(); 	 	
	}
}
