package com.orange.mobile.Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public AndroidDriver driver;

    public void setUp() throws MalformedURLException {
        try{
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","Pixel_6a");
            capabilities.setCapability("platformName","ANDROID");
            capabilities.setCapability("platformVersion","15");
            capabilities.setCapability("appPackage","com.android.chrome");
            capabilities.setCapability("appActivity","com.google.android.apps.chrome.IntentDispatcher");
            capabilities.setCapability("automationName","UIAutomator2");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void tearDown(){
        driver.quit();
    }
}
