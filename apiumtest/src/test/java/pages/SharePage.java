package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class SharePage {
	AppiumDriver driver;
	
	public SharePage(AppiumDriver driver)
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
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvSuccessTitle")
	WebElement title;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnOkAssignDialog")
	WebElement ok;
	
	public void share(String args)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		kebab.click();
		shareopt.click();
		enteremail.click();
		enteremail.sendKeys(args);
		submit.click();
	}
	
	public String message()
	{
		return title.getText();
	}
	

	

}
