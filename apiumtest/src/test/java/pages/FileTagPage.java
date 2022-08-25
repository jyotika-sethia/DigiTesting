package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class FileTagPage {
	
AppiumDriver driver;
	
	public FileTagPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[4]")
	WebElement kebab;			 	
	
	@FindBy(how=How.ID,using= "com.liqvd.digibox.test:id/itemPreviewFile")
	WebElement preview;
	
	@FindBy(how=How.ID,using ="com.liqvd.digibox.test:id/rlOverview")
	WebElement overview;
	
	@FindBy(how=How.XPATH,using = "//*[@text='jpg']")
	WebElement tag;
	
	
	
	
	public void tag()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		kebab.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		preview.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		overview.click();
		
		
	}
	
	public String tagName()
	{
//		return tag.getTagName();
		return tag.getText();
	}
}
