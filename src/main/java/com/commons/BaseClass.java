package com.commons;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	static AppiumDriver<MobileElement> driver;

	public void setdriver(AppiumDriver driver)

	{
		this.driver = driver;
	}

	public AppiumDriver<MobileElement> getDriver() {
		return this.driver;
	}

//This method intialises driver instance	
	public void setup() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "Honor 6X");
		caps.setCapability("udid", "A2QDU17616005352");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "net.giosis.shopping.sg");
		caps.setCapability("appActivity", "net.giosis.common.activitys.CommIntroActivity");
		caps.setCapability("noReset", "false");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		caps.setCapability("skipUnlock", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, caps);
		System.out.println("Qoo10 App started");

	}
	
	//This method closes the driver instances
	public void tearDown()
	{
		driver.quit();
	}

}
