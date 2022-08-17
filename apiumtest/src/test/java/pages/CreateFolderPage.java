package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class CreateFolderPage {
	AppiumDriver driver;
	
	public CreateFolderPage(AppiumDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")
	WebElement add;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llCreateNewFolder")
	WebElement selectFolder;  
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtCreateFolderName")
	WebElement fname;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnCreateFolder")
	WebElement createfolder;
	
//	public void selectFolder()
//	{
//		WebElement select = driver.findElement(By.id("com.liqvd.digibox.test:id/llCreateNewFolder"));
//		select.click();
//	}
//	
//	public void folderName()
//	{
//		WebElement name = driver.findElement(By.id("com.liqvd.digibox.test:id/edtCreateFolderName"));
//		name.sendKeys("Images");
//	}
//	
//	public void createFolder()
//	{
//		WebElement select = driver.findElement(By.id("com.liqvd.digibox.test:id/btnCreateFolder"));
//		select.click();
//	}
	
	public void CFolder(String arg) throws InterruptedException
	{
		add.click();
		Thread.sleep(2000);
		selectFolder.click();
		Thread.sleep(2000);
		fname.sendKeys(arg);
		Thread.sleep(2000);
		createfolder.click();
	}

}
