package com.automationMobile.screens;

import com.automationMobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {
    public DragScreen(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    private WebElement title;
    @Override
    public Boolean verifyScreen() {
        return isElementDisplayed(title);
    }
}
