package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class SelectAllCheckboxPage {
	
	AppiumDriver driver;
	
	public SelectAllCheckboxPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivSelectAll")
	WebElement select;
	
	
	public void selectAll() throws InterruptedException
	{
		System.out.println("select");
		select.click();
		
	}
	
	public void DeselectAll()
	{
		select.click();
	}

}
