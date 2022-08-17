package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class RenameFolderPage {
	AppiumDriver driver;
	

	public RenameFolderPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[1]")
	WebElement option;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/itemRenameFolder")
	WebElement rename;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtReNameFolder")
	WebElement change;
	

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnReNameFolder")
	WebElement button;
	
	
	
	
	public void renameFolder(String arg)
	{
		option.click();
		rename.click();
		change.sendKeys(arg);
		button.click();
	}

}
