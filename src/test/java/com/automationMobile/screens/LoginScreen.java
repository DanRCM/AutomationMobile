package com.automationMobile.screens;

import com.automationMobile.utils.emailsGenerator.EmailGenerator;
import com.automationMobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login / Sign up Form\")")
    private WebElement title;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Login\")")
    private WebElement btnLoginMenu;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"input-email\")")
    private WebElement inputEmail;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"input-password\")")
    private WebElement inputPsw;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"input-repeat-password\")")
    private WebElement inputRepeatPsw;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"button-SIGN UP\")")
    private WebElement btnSignUp;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You successfully signed up!\")")
    private WebElement signedUpMsg;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    private WebElement btnOk;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    private WebElement btnOkLogin;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"button-sign-up-container\")")
    private WebElement btnSignUpScreen;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"button-login-container\")")
    private WebElement btnLoginScreen;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"button-LOGIN\").childSelector(new UiSelector().text(\"LOGIN\"))")
    private WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You are logged in!\")")
    private WebElement trueLogin;
    private EmailGenerator emailGenerator;
    private String email;
    @Override
    public Boolean verifyScreen() {
        return isElementDisplayed(title);
    }
    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
    public EmailGenerator getEmailGenerator(){
        return new EmailGenerator();
    }
    public void signUpScreenConfirm(){
        btnLoginMenu.click();
        softAssert.assertTrue(isElementDisplayed(title));
        softAssert.assertTrue(isElementDisplayed(btnSignUpScreen));
        btnSignUpScreen.click();
        softAssert.assertTrue(isElementDisplayed(btnSignUp));
        softAssert.assertAll();
    }
    public void register(){
        emailGenerator = getEmailGenerator();
        this.email = emailGenerator.generateEmail();
        softAssert.assertTrue(isElementDisplayed(inputEmail));
        softAssert.assertTrue(isElementDisplayed(inputPsw));
        softAssert.assertTrue(isElementDisplayed(inputRepeatPsw));
        inputEmail.sendKeys(email);
        inputPsw.sendKeys("PswTest123456");
        inputRepeatPsw.sendKeys("PswTest123456");
        btnSignUp.click();
        softAssert.assertTrue(isElementDisplayed(signedUpMsg));
        System.out.println("It has been succesfully registered " + email.split("@")[0]);
        btnOk.click();
    }
    public void userLogin(){
        softAssert.assertTrue(isElementDisplayed(btnLoginScreen));
        btnLoginScreen.click();

        softAssert.assertTrue(isElementDisplayed(inputEmail));
        softAssert.assertTrue(isElementDisplayed(inputPsw));

        inputEmail.sendKeys(email);
        inputPsw.sendKeys("PswTest123456");
        btnLogin.click();

        softAssert.assertTrue(isElementDisplayed(trueLogin));
        btnOkLogin.click();
        softAssert.assertAll();
    }
}
