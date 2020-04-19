package appiumtests;

import java.net.MalformedURLException;
import org.testng.annotations.Test;
import com.commons.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageObjects.HomePage;

public class Qoo10AppTest {

	static BaseClass baseclass = new BaseClass();

	// This method opens the App in Device
	@Test(priority = 0)
	public void launchApp() throws MalformedURLException, InterruptedException {
		baseclass.setup();
		Thread.sleep(2000);
	}

	// This method navigates to the home page of the application
	@Test(priority = 1)
	public void navigateToHomePage() throws InterruptedException {

		HomePage hpage = new HomePage(baseclass.getDriver());
		hpage.clickGetStarted();
		Thread.sleep(2000);
	}

	// This method searches for an item and verifies the item in the displayed
	// results
	@Test(priority = 2)
	public void searchItem() throws InterruptedException {
		HomePage hpage = new HomePage(baseclass.getDriver());
		hpage.searchItem();
		Thread.sleep(2000);
	}

	// This method selects an item from Digital for eg:an inphone case cover and
	// adds to wishlist
	@Test(priority = 3)
	public void addItemTo_WishList() throws InterruptedException {
		HomePage hpage = new HomePage(baseclass.getDriver());
		hpage.clickMainDealsButton();
		Thread.sleep(1000);
		hpage.clickDigital();
		Thread.sleep(1000);
		hpage.clickcases();
		hpage.selectiPhone();
		Thread.sleep(1000);
		scrollandClick("Spigen iPhone 11 Pro Max Case iPhone 2019");
		Thread.sleep(1000);
		scrollandClick("Wish List");
		Thread.sleep(1000);
		hpage.addWishList();

	}

	// This method scrolls till the mentioned text is present and clicks on it
	public static void scrollandClick(String exactText) throws InterruptedException {
		((AndroidDriver<MobileElement>) baseclass.getDriver()).findElementByAndroidUIAutomator

		("new UiScrollable(new UiSelector().scrollable(true).instance(0))."
				+ "scrollIntoView(new UiSelector().textContains(\"" + exactText + "\").instance(0))").click();

		Thread.sleep(2000);

	}

}
