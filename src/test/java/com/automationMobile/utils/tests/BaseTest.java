package com.automationMobile.utils.tests;

import java.net.MalformedURLException;
import java.net.URL;

import com.automationMobile.screens.GeneralScreen;
import com.automationMobile.screens.LoginScreen;
import com.automationMobile.screens.SwipeScreen;
import com.automationMobile.screens.WebViewScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
/*import org.testng.annotations.Test;
import pages.LoginScreen;
import pages.MainScreen;
import pages.SwipeScreen;*/
public class BaseTest {
    private AndroidDriver driver;
    @BeforeClass
    public void setUp() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setCapability("deviceName", "emulator-5554");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("platformName", "Android");
        options.setCapability("platformVersion", "11");
        options.setCapability("appPackage", "com.wdiodemoapp");
        options.setCapability("appActivity", ".MainActivity");
        options.setCapability("appVersion", "0");
        options.setCapability("app", "C:\\Users\\Daniel Cortez\\Desktop\\AndroidSrc\\Android-NativeDemoApp-0.4.0.apk");
        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
        }catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }

    public GeneralScreen getGeneralScreen(){return new GeneralScreen(driver);}
    public LoginScreen getLoginScreen(){return new LoginScreen(driver);}
    public SwipeScreen getSwipeScreen(){return new SwipeScreen(driver);}
    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}