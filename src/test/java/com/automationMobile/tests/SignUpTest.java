package com.automationMobile.tests;

import com.automationMobile.screens.LoginScreen;
import com.automationMobile.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{
    private LoginScreen loginScreen;
    @Test
    public void SignUp(){
        loginScreen = getLoginScreen();
        loginScreen.signUpScreenConfirm();
        loginScreen.register();
    }
}
