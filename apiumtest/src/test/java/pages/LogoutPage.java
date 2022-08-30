package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class LogoutPage {
	
	AppiumDriver driver;
	
	
	public LogoutPage(AppiumDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivProfile")
	WebElement profile;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llLogout")
	WebElement logout;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvYes")
	WebElement yes;
	
	
	public void logout()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		profile.click();
		logout.click();
		yes.click();
	}
	


}
