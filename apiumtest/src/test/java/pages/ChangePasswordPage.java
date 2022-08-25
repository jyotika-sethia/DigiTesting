package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ChangePasswordPage {
	AppiumDriver driver;
	
	public ChangePasswordPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivProfile")
	WebElement profile;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llAccount")
	WebElement account;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llSetting")
	WebElement setting;
	
	@FindBy(how=How.XPATH,using="//*[@text='Settings']")
	WebElement password;

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/next")
	WebElement next;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtOldPassword")
	WebElement oldpass;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtNewPassword")
	WebElement newpass;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtCNewPassword")
	WebElement confirmpass;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnSubmitSetting")
	WebElement submit;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnASLogout")
	WebElement Login_Again;
	
	
	
	public void change_password(String arg,String arg1,String arg2) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		profile.click();
	
		account.click();
	
		setting.click();
	
		password.click();
	
		next.click();
	
		oldpass.sendKeys(arg);
	
		newpass.sendKeys(arg1);
	
		confirmpass.sendKeys(arg2);
	
		submit.click();
	}
	
	public void login_again()
	{
		Login_Again.click();
	}
	
}


