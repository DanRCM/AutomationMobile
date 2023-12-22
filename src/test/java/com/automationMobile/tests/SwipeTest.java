package com.automationMobile.tests;

import com.automationMobile.screens.SwipeScreen;
import com.automationMobile.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {
    private SwipeScreen swipeScreen;
    @Test
    public void swipePageTest(){
        swipeScreen = getSwipeScreen();
        swipeScreen.swipeMoveRight();
        swipeScreen.swipeMoveLeft();
    }
}
