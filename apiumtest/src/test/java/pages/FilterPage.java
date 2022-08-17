package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class FilterPage {
	AppiumDriver driver;
	
	public FilterPage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/ivFilter")
	WebElement filter;
	

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rbZtoA")
	WebElement name1;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rbAtoZ")
	WebElement name2;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rbDateToday")
	WebElement date1;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rbDateLast7Days")
	WebElement date2;
		
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rbDate30Days")
	WebElement date3;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rbDateAllDays")
	WebElement date4;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rbSize10to100")
	WebElement storage1;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rgSize101to1gb")
	WebElement storage2;
	
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rg1gbTo20gb")
	WebElement storage3;

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/rgSizeAll")
	WebElement storage4;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.CheckBox")
	WebElement type1;

	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.CheckBox")
	WebElement type2;

	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]/android.widget.CheckBox")
	WebElement tag1;

	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[2]/android.widget.CheckBox")
	WebElement tag2;
	
	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/btnApply")
	WebElement apply;

	@FindBy(how=How.ID,using="com.liqvd.digibox.test:id/tvClearAll")
	WebElement removefilter;
	
	public void applyFilter() throws InterruptedException
	{
		Thread.sleep(4000);
		filter.click();
		Thread.sleep(2000);
		name1.click();
		date3.click();
		storage2.click();
		type1.click();
//		tag1.click();
		apply.click();
	}
	
	public void removeFilter() throws InterruptedException
	{
		filter.click();
		Thread.sleep(2000);
		removefilter.click();
		Thread.sleep(2000);
		apply.click();
	}
}
