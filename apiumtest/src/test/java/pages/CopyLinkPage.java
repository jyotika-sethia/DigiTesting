package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class CopyLinkPage {
AppiumDriver driver;
	
	public CopyLinkPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[2]")
	WebElement kebab;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/itemCopyLink")
	WebElement copyopt;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnCopyShareableLink")
	WebElement copy;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvLinkCopiedSuccess")
	WebElement message;
	
	public void copy_link()
	{
		kebab.click();
		copyopt.click();
		copy.click();
	}
	
	public String message()
	{
		return message.getText();
	}

	

}
