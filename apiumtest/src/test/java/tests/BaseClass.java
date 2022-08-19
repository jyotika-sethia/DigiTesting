package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {

	
	 public static AppiumDriver driver;

	 
	@BeforeSuite
	public void setup() throws MalformedURLException, InterruptedException
	{
//		DesiredCapabilities cap = new DesiredCapabilities();
		
//		cap.setCapability("platformName","Android");
//		cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		//Both does the same.These are interface
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
//		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//		cap.setCapability(MobileCapabilityType.APP,"");
//		cap.setCapability(, null);
//		
//		File path=new File("C:\\Users\\sethi\\git\\DigiBoxx\\apiumtest\\src\\test\\resources\\digiboxx.apk");
//		
//		String path1 = System.getProperty("user.dir");
//		System.out.println(path1);//from where the project will start
//		System.out.println(path);//where u want to start
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\sethi\\OneDrive\\Desktop\\L2 project\\digiboxx.apk");
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability(CapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		
		cap.setCapability("appPackage", "com.liqvd.digibox.test");
		cap.setCapability("appActivity","com.liqvd.digibox.ui.MainActivityNew");
		
		cap.setCapability("autoGrantPermissions",true);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
//		cap.capabilities.setCapability("appWaitActivity", appWaitActivityVariable);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url,cap);
		Thread.sleep(4000);
		

//		DesiredCapabilities caps = new DesiredCapabilities();
//		MutableCapabilities caps = new MutableCapabilities();
//		caps.setCapability("platformName","Android");
//		caps.setCapability("appium:deviceName","Android GoogleAPI Emulator");
//		caps.setCapability("appium:deviceOrientation", "portrait");
//		caps.setCapability("appium:platformVersion","12.0");
//		caps.setCapability("appium:app", "storage:filename=digiboxx.apk");
//		URL url = new URL("https://oauth-jyotikachoraria-23078:2889598b-485e-4385-a119-ffdefb04e59b@ondemand.us-west-1.saucelabs.com:443/wd/hub");
//		driver = new AppiumDriver(url, caps);
//		Thread.sleep(2000);
		
		
	
	}
	

	
	
	
	@AfterSuite
	public void teardown()
	{
		
	}
}
