package pages;

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
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
	WebElement password;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtOldPassword")
	WebElement oldpass;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtNewPassword")
	WebElement newpass;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtCNewPassword")
	WebElement changepass;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnSubmitSetting")
	WebElement submit;

	
	public void change_password(String arg,String arg1,String arg2) throws InterruptedException
	{
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
		account.click();
		Thread.sleep(2000);
		setting.click();
		Thread.sleep(2000);
		password.click();
		Thread.sleep(2000);
		oldpass.sendKeys(arg);
		Thread.sleep(2000);
		newpass.sendKeys(arg1);
		Thread.sleep(2000);
		changepass.sendKeys(arg2);
		Thread.sleep(2000);
		submit.click();
	}
	
}


