package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class PriceChangePage {
	
	
	AppiumDriver driver;
	
	
	public PriceChangePage(AppiumDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="com.android.permissioncontroller:id/permission_deny_button")
	WebElement dontAllow;	

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnSkipIntroSlideOne")
	WebElement skip;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/create_new_account")
	WebElement create;

	@FindBy(how=How.XPATH, using ="//*[@text='Yearly']")
	WebElement yearlyTab;	

	
	@FindBy(how=How.XPATH, using="//*[@text='100 GB']")
	WebElement plan_A; 
	
	@FindBy(how=How.XPATH, using="//*[@text='500 GB']")
	WebElement plan_B;
	
	@FindBy(how=How.XPATH, using="//*[@text='1 TB']")
	WebElement plan_C;
	
	@FindBy(how=How.XPATH, using="//*[@text='2 TB']")
	WebElement plan_D;
	
	@FindBy(how=How.XPATH, using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]")
	WebElement discountprice;
	
	
	public void createAccDetail() throws InterruptedException
	{
	
//		dontAllow.click();
		System.out.println("1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		skip.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("2");
		create.click();
		
		System.out.println("3");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		yearlyTab.click();
		System.out.println("4");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)","");
	
	}
	
	public void planA() throws InterruptedException
	{
		Thread.sleep(3000);
		plan_A.click();
		
		
	}
	
	public void planB() throws InterruptedException
	{
		Thread.sleep(3000);
		plan_B.click();
		
	}
	
	public void planC() throws InterruptedException
	{
		Thread.sleep(3000);
		plan_C.click();
		
	}
	
	public void planD() throws InterruptedException
	{
		Thread.sleep(3000);
		plan_D.click();
		
	}
	
	public void display() throws InterruptedException
	{
		Thread.sleep(3000);
		discountprice.getText();
	}

	
	
}
