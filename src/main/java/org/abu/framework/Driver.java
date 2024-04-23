package org.abu.framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private Driver() {
    }

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        return driver;
    }

    static void init() throws MalformedURLException {
        if (driver != null) return;

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appium:platformVersion", "13");
        cap.setCapability("appium:app", System.getProperty("user.dir") + "\\apps\\hitter_local.apk");
        cap.setCapability("appium:udid", "156018632900A1H");
        URL url = new URL("http://127.0.0.1:4723/");

        driver = new AndroidDriver(url, cap);
    }

    static void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
