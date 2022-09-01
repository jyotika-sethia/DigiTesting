package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class FolderDetailsPage {
AppiumDriver driver;
	
	public FolderDetailsPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//android.widget.ImageView[@content-desc=\"kabab menu\"])[1]")
	WebElement option;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/itemDetailsFolder")
	WebElement details;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvMyFolderNameDetails")
	WebElement foldername;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvMyFolderTypeDetails")
	WebElement type;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvMyFolderSizeDetails")
	WebElement size;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvMyFolderCreatedDetails")
	WebElement created;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvMyFolderPathDetails")
	WebElement path;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvMyFolderNumberOfFilesDetails")
	WebElement file_count;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvMyFolderNumberOfFoldersDetails")
	WebElement folder_count;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvMyFolderNumberOfFoldersDetails")
	WebElement acess;
	
	
	
	public void details() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		option.click();
		details.click();

	}
	
	public String get_name()
	{
		return foldername.getText();
	}
	
	public String get_type()
	{
		return type.getText();
	}
	
	public String get_path()
	{
		return path.getText();
	}
	
	public String get_size()
	{
		return size.getText();
	}
	
	public String get_created()
	{
		return created.getText();
	}
	
	public String get_file()
	{
		return file_count.getText();
	}
	
	public String get_folder()
	{
		return folder_count.getText();
	}
	
}