package org.abu.utils;

public class AppiumParams {

    private AppiumParams(){
    }

    public static final String AUTOMATION_NAME;
    public static final String PLATFORM_NAME;
    public static final String PLATFORM_VERSION;
    public static final String APPLICATION_NAME;
    public static final String UDID;

    static {
        var props = PropertiesReader.getProperties(System.clearProperty("user.dir") + "\\src\\main\\resources\\config.properties");

        AUTOMATION_NAME = props.getProperty("appium.automationName");
        PLATFORM_NAME = props.getProperty("appium.platformName");
        PLATFORM_VERSION = props.getProperty("appium.platformVersion");
        APPLICATION_NAME = System.getProperty("user.dir") + "\\apps\\" + props.getProperty("appium.app");
        UDID = props.getProperty("appium.udid");
    }
}
