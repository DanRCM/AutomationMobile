package com.automationMobile.tests;

import com.automationMobile.screens.SwipeScreen;
import com.automationMobile.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {
    SwipeScreen swipeScreen;
    @Test()
    public void TestSwipe(){
        swipeScreen = getSwipeScreen();
        swipeScreen.BtnSwipeConfirmation();
        swipeScreen.swipeRight();
        swipeScreen.swipeLeft();
    }
}
