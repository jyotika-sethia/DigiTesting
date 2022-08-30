package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class MovePage {
	AppiumDriver driver;
	
	public MovePage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[1]")
	WebElement kebab;
	
	@FindBy(how=How.XPATH,using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[4]")
	WebElement ikebab;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/itemMoveFolder")
	WebElement moveto;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llMvCreateNewFolder")
	WebElement newfolder;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/etFolderName")
	WebElement name;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnMvCreateFolder")
	WebElement create;
	
//	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnMove")
//	WebElement move;
	
	@FindBy(how=How.XPATH,using="(//*[@resource-id='com.liqvd.digibox.test:id/clFolder'])[1]")
	WebElement iselect;
	
	@FindBy(how=How.XPATH,using="(//*[@resource-id='com.liqvd.digibox.test:id/clFolder'])[2]")
	WebElement select;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnMove")
	WebElement moveagain;
	
	public void moveFolder(String args)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		kebab.click();
		moveto.click();
		newfolder.click();
		name.sendKeys(args);
		create.click();
		select.click();
		moveagain.click();
	}
	
	public void moveimage()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ikebab.click();
		moveto.click();
		iselect.click();
		moveagain.click();
	}

}
