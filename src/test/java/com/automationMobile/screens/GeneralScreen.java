package com.automationMobile.screens;

import com.automationMobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import java.util.Arrays;
import java.util.List;

public class GeneralScreen extends BaseScreen {
    class MenuItems{
        WebElement btn;
        BaseScreen screen;
        MenuItems(WebElement btn, BaseScreen screen){
            this.btn = btn;
            this.screen = screen;
        }
    }
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Home\")")
    WebElement btnHome;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Webview\")")
    WebElement btnWebview;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Login\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Forms\")")
    WebElement btnForms;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Swipe\")")
    WebElement btnSwipe;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Drag\")")
    WebElement btnDrag;
    HomeScreen homePageScreen = new HomeScreen(driver);
    WebViewScreen webViewScreen = new WebViewScreen(driver);
    LoginScreen loginScreen = new LoginScreen(driver);
    FormsScreen formsScreen = new FormsScreen(driver);
    SwipeScreen swipeScreen = new SwipeScreen(driver);
    DragScreen dragScreen = new DragScreen(driver);
    List<MenuItems> menuItems = Arrays.asList(
            new GeneralScreen.MenuItems(btnHome, homePageScreen),
            new GeneralScreen.MenuItems(btnWebview, webViewScreen),
            new GeneralScreen.MenuItems(btnLogin, loginScreen),
            new GeneralScreen.MenuItems(btnForms, formsScreen),
            new GeneralScreen.MenuItems(btnSwipe, swipeScreen),
            new GeneralScreen.MenuItems(btnDrag, dragScreen)
    );

    public void clickOnItemMenu(){
        for (MenuItems menuItem : menuItems){
            menuItem.btn.click();
            softAssert.assertTrue(menuItem.screen.verifyScreen());
        }
        softAssert.assertAll();
    }

    public GeneralScreen(AndroidDriver driver) {
        super(driver);
    }
}
