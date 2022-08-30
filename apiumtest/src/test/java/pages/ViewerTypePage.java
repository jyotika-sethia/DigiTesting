package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ViewerTypePage {
AppiumDriver driver;
	
	public ViewerTypePage(AppiumDriver driver)
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
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnViewerType")
	WebElement viewer;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvViewerAssignDialogLayout")
	WebElement commentlist;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvCommenterAssignDialog")
	WebElement viewerlist;

	public void listoption()
	{
		kebab.click();
		shareopt.click();
		enteremail.click();
		viewer.click();
		commentlist.click();
		viewer.click();
		viewerlist.click();
	}
	
	public void commentlist()
	{
		viewer.click();
		commentlist.getText();
	}
	
	public void viewerlist()
	{
		viewer.click();
		viewerlist.getText();
	}
}
