package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import tests.BaseClass;

public class LoginPage  {
	
	AppiumDriver driver;
	
	
	public LoginPage(AppiumDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="com.android.permissioncontroller:id/permission_allow_button")
	WebElement allow;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnNextIntroOne")
	WebElement clicknext1;	 	

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnNextIntroOne")
	WebElement clicknext2;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnNextIntroOne")
	WebElement start;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtDigiSpaceName")
	WebElement digi;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtEmail")
	WebElement email;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/edtPassword")
	WebElement password;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnSignIn")
	WebElement login;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/navigation_bar_item_large_label_view")
	WebElement home;


	public void loginDetail(String arg1,String arg2,String arg3) throws InterruptedException
	{	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		allow.click();
		Thread.sleep(4000);
		System.out.println("2");
		clicknext1.click();
		System.out.println("3");
		
		clicknext2.click();
		System.out.println("4");
		
		start.click();
		System.out.println("5");
		
		digi.sendKeys(arg1);
		System.out.println("6");
		
		email.sendKeys(arg2);
		
		password.sendKeys(arg3);
		
		login.click();

	}
	
	public  String password()
	{
		return password.getText();
	}
	
	public void loginAgainDetail(String arg1,String arg2,String arg3)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		digi.sendKeys(arg1);
	
		email.sendKeys(arg2);
		
		password.sendKeys(arg3);
		
		login.click();
	
	}
	
	public String text()
	{
		return home.getText();
	}
	
	}
