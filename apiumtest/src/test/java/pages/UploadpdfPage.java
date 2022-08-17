package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class UploadpdfPage {
	AppiumDriver driver;
	
	public UploadpdfPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")
	WebElement add;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llUploadFileFolders")
	WebElement upFile;
	
	@FindBy(how=How.XPATH,using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout")
	WebElement upPdf;		
	
	public void UploadPdf() throws InterruptedException
	{
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		upFile.click();
		Thread.sleep(2000);
		upPdf.click();
	}
}