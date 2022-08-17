package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class UpdatePPPage {
AppiumDriver driver;
	
	public UpdatePPPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivProfile")
	WebElement profile;	

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/imgProfileImage")
	WebElement profileimage;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llGallery")
	WebElement gallery;

	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout[@content-desc=\"heart.jpg, 6.28 kB, May 31\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
	WebElement image;
	
	@FindBy(how=How.XPATH,using="//android.widget.LinearLayout[@content-desc=\"images.jpeg, 11.46 kB, May 31\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
	WebElement changeimage;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llSelect")
	WebElement select;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivRemoveIcon")
	WebElement delete;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnYes")
	WebElement yes;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/llCamera")
	WebElement camera;

	public void setProfilePicture() throws InterruptedException
	{
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
		profileimage.click();
		Thread.sleep(2000);
		gallery.click();
		Thread.sleep(2000);
		image.click();
		Thread.sleep(2000);
		select.click();
				
	}
	public void deleteProfileImage() throws InterruptedException
	{
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
		profileimage.click();
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
		yes.click();
	}
	
	public void updateProfileImage() throws InterruptedException
	{
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
		profileimage.click();
		Thread.sleep(2000);
		gallery.click();
		Thread.sleep(2000);
		changeimage.click();
		Thread.sleep(2000);
		select.click();
	}
	

}
