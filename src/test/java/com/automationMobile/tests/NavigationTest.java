package com.automationMobile.tests;

import com.automationMobile.screens.GeneralScreen;
import com.automationMobile.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {
    GeneralScreen generalScreen;
    @Test
    public void navigationTest(){
        generalScreen = getGeneralScreen();
        generalScreen.clickOnItemMenu();
    }
}
