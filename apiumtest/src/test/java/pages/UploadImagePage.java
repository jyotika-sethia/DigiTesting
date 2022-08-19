package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class UploadImagePage {
	AppiumDriver driver;
	
	public UploadImagePage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")
	WebElement add;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llUploadFileFolders")
	WebElement upFile;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.google.android.material.chip.Chip[1]")
	WebElement option1;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
	WebElement image;
	
//	public void selectImage()
//	{
//		WebElement select = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout"));
//		select.click();
//	}
	
	public void selectImage() throws InterruptedException
	{
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		upFile.click();
		Thread.sleep(3000);
		option1.click();
		Thread.sleep(2000);
		image.click();
	}
}
