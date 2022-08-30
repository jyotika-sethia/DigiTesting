package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ShareSameUserPage {
	AppiumDriver driver;
	
	public ShareSameUserPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[2]")
	WebElement kebab;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/itemAssignUser")
	WebElement shareopt;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/etAssignUser")
	WebElement enteremail;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnSubmitAssign")
	WebElement submit;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/scrollViewSuccessDialog")
	WebElement title;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnOkAssignDialog")
	WebElement ok;
	
	public void click_ok()
	{
		ok.click();
	}
	
	public void sharesame(String args) throws InterruptedException
	{
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enteremail.click();
		enteremail.sendKeys(args);
		enteremail.click();
		Thread.sleep(3000);
		submit.click();
	}
	
	public String message()
	{
		return title.getText();
	}

}
