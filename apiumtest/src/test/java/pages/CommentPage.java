package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class CommentPage {
	
	
AppiumDriver driver;
	
	public CommentPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="(//*[@resource-id='com.liqvd.digibox.test:id/cvFolder'])[4]")
	WebElement select;			 	
	
	@FindBy(how=How.ID,using= "com.liqvd.digibox.test:id/rlComments")
	WebElement comment;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtWriteText")
	WebElement commenting;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/cardSend")
	WebElement send;
	
	@FindBy(how=How.XPATH,using="//*[@text='It is scenary']")
	WebElement message;
	
	public void comment(String arg)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		select.click();
		comment.click();
		commenting.sendKeys(arg);
		send.click();
	
	}
	
	public String messgae()
	{
		return message.getText();
	}

}
