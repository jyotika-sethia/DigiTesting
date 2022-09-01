package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class VerifyAtTopPage {
AppiumDriver driver;
	
	
	public VerifyAtTopPage(AppiumDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//*[@resource-id='com.liqvd.digibox.test:id/tvName'])[1]")
	WebElement folder_name;

	public String folder_name()
	{
		return folder_name.getText();
	}
}
