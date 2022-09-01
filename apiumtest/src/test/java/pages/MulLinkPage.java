package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class MulLinkPage {
AppiumDriver driver;
	
	public MulLinkPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//*[@resource-id='com.liqvd.digibox.test:id/checkBox2'])[2]")
	WebElement select1;
	
	@FindBy(how=How.XPATH,using="(//*[@resource-id='com.liqvd.digibox.test:id/checkBox2'])[3]")
	WebElement select2;
	
	@FindBy(how=How.XPATH,using="(//*[@resource-id='com.liqvd.digibox.test:id/checkBox2'])[1]")
	WebElement select3;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivAssignAssetsUser")
	WebElement shareopt;

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivCopyLink")
	WebElement copyopt;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnCopyShareableLink")
	WebElement copy;
	
	public void mul_select()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		select1.click();
		select2.click();
		select3.click();
		shareopt.click();
	}
	
	public void get_link()
	{
		copyopt.click();
		copy.click();
		
		
	}
	

}
