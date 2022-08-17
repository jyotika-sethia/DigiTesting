package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class MultipleVideoPage {
AppiumDriver driver;
	
	public MultipleVideoPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")
	WebElement add;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llUploadFileFolders")
	WebElement upFile;
	
	@FindBy(how=How.ID,using="com.google.android.documentsui:id/action_menu_select")
	WebElement select;

	@FindBy(how=How.XPATH,using="	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.google.android.material.chip.Chip[3]")
	WebElement videotab;
	
	@FindBy(how=How.XPATH,using="//android.widget.ImageView[@content-desc=\"More options\"]")
	WebElement choose;

	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
	WebElement selectall;
	
	public void multiple() throws InterruptedException
	{
		Thread.sleep(3000);
		add.click();
		System.out.println("upload");
		Thread.sleep(3000);
		upFile.click();
		Thread.sleep(8000);

		videotab.click();
		Thread.sleep(2000);
		System.out.println("choose tab");
		choose.click();
		Thread.sleep(2000);
		System.out.println("selectall");
		selectall.click();
		Thread.sleep(2000);
		System.out.println("select");
		select.click();
		Thread.sleep(2000);
				
	}
	

}
