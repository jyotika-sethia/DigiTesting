package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class SpecificFilterPage {
AppiumDriver driver;
	
	public SpecificFilterPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivFilter")
	WebElement filter;
	
	@FindBy(how=How.XPATH,using="//*[@text='.png']")
	WebElement png;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnApply")
	WebElement apply;
	
	@FindBy(how=How.XPATH,using="//*[@text='39627...2.png']")
	WebElement find;
	
	public void applyFilter() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		filter.click();
		png.click();
		apply.click();


		
	}
	
	public void selected()
	{
		find.getText();
	}

}
