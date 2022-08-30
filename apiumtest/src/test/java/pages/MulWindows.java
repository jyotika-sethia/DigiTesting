package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MulWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sethi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		
		WebElement newWindow =driver.findElement(By.id("newTabBtn"));
		newWindow.click();
		
		WebElement display =driver.findElement(By.id("Header1_headerimg"));
		display.isDisplayed();
		Assert.assertTrue(true);
		
		driver.close();

	}

}
