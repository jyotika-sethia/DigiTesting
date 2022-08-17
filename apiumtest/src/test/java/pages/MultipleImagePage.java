package pages;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class MultipleImagePage {
	AppiumDriver driver;
	
	public MultipleImagePage(AppiumDriver driver)
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
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout")
	WebElement image;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout")
	WebElement image1;
	
	@FindBy(how=How.ID,using="com.google.android.documentsui:id/action_menu_select")
	WebElement select;

	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/com.google.android.material.chip.Chip[1]")
	WebElement imagetab;
	
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
//		System.out.println("select image1");
//		TouchActions action = new TouchActions(driver);
//		action.clickAndHold(image);
//		Thread.sleep(6000);
//		System.out.println("select image2");
//		TouchActions action1 = new TouchActions(driver);
//		action1.longPress(image1).perform();
//		Thread.sleep(4000);
//		
//		if(image.isSelected()&& image1.isSelected())
//		{
//			System.out.println("insideif");
//			Thread.sleep(4000);
//			select.click();
//
//			System.out.println("image selected");
//			
//		}
		System.out.println("image tab");
		imagetab.click();
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
