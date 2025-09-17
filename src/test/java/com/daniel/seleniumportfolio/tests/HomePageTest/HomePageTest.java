package com.daniel.seleniumportfolio.tests.HomePageTest;

import com.daniel.seleniumportfolio.tests.BasePageTest;
import com.daniel.seleniumportfolio.tests.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BasePageTest {




    @Test
    public void testHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.getCurrentUrl();
        homePage.isAutomationExerciseCarouselDisplay();

        // Verify that home page is visible successfully
        Assert.assertTrue(homePage.isAutomationExerciseCarouselDisplay());
        Assert.assertEquals(homePage.getCurrentUrl(), "https://automationexercise.com/");
    }


}


