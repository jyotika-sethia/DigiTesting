package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class OptionDisplayedPage {
	
	AppiumDriver driver;
	
	
	public OptionDisplayedPage(AppiumDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(how=How.ID, using ="com.liqvd.digibox.test:id/ivSelectAll")
	WebElement selectAll;
	
	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/ivMultipleMoveFolder")
	WebElement move;
	
	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/ivDownlaodAll")
	WebElement download;

	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/ivDelete")
	WebElement delete;

	@FindBy(how=How.ID, using="com.liqvd.digibox.test:id/ivAssignAssetsUser")
	WebElement share;
	
	

	
	
	
	
	
	
	
	public void selectAll() throws InterruptedException
	{
		selectAll.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public boolean displayed() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		move.isEnabled();
		
		download.isEnabled();
		
		delete.isEnabled();
		
		return share.isEnabled();
	}
	

	

	
	

}
