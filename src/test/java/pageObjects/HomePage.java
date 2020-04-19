package pageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.commons.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {


	BaseClass baseclass=new BaseClass();

	public HomePage(AppiumDriver<MobileElement> appiumDriver) {
	
		PageFactory.initElements(new AppiumFieldDecorator(baseclass.getDriver()), this);
	}

		
    //Finding Elements
	
	@AndroidFindBy(id = "net.giosis.shopping.sg:id/btn_start_app") 
    private MobileElement getStartedLink;

	 
	@AndroidFindBy(id = "net.giosis.shopping.sg:id/top_button2")
	private MobileElement dailyDeals;

	@AndroidFindBy(id = "net.giosis.shopping.sg:id/main_deal_icon")
	private MobileElement mainDeals;

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Digital\")")
	private MobileElement digitalLink;

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Cases\")")
	private MobileElement casesOrCovers;

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"iPhone\")")
	private MobileElement iphone;

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Spigen iPhone 11 Pro Max Case\")")
	private MobileElement iphoneCase;

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Wish List\")")
	private MobileElement addToWishList;

	
	@AndroidFindBy(id = "net.giosis.shopping.sg:id/home_left_menu_button")
	private MobileElement leftMenu;

	
	@AndroidFindBy(id = "net.giosis.shopping.sg:id/search_input_edit")
	private MobileElement searchBox;

	@AndroidFindBy(id = "net.giosis.shopping.sg:id/search_button")
	private MobileElement searchButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Surgical Mask\")")
	private MobileElement maskItem;

	@AndroidFindBy(id = "net.giosis.shopping.sg:id/btnBack")
	private MobileElement backButton;
	

	public void clickGetStarted() {
		getStartedLink.click();
	}

	public void clickMainDealsButton() {
		mainDeals.click();
	}

	public void clickDigital() {
		digitalLink.click();
	}

	public void clickcases() {
		casesOrCovers.click();
	}

	public void selectiPhone() {
		iphone.click();

	}

	public void addWishList() throws InterruptedException {
		addToWishList.click();
		Thread.sleep(1000);

	}


	public void searchItem() throws InterruptedException {
		searchBox.click();
		searchBox.sendKeys("mask");
		Thread.sleep(2000);
	    searchButton.click();
		Thread.sleep(2000);
		maskItem.isDisplayed();
		backButton.click();

	}
	
	

}
