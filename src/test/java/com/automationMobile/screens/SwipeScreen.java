package com.automationMobile.screens;

import com.automationMobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    private WebElement title;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Swipe\")")
    WebElement swipePageBtn;

    public void swipeMoveRight(){
        swipePageBtn.click();
        softAssert.assertTrue(isElementDisplayed(title));
        swipeRight(530,1553);
        softAssert.assertAll();
    }
    public void swipeMoveLeft(){
        swipePageBtn.click();
        softAssert.assertTrue(isElementDisplayed(title));
        swipeLeft(530,1553);
        softAssert.assertAll();
    }
    @Override
    public Boolean verifyScreen() {
        return isElementDisplayed(title);
    }
    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }
}
