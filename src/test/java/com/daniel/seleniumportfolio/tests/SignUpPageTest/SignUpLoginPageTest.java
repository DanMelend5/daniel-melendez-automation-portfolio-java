package com.daniel.seleniumportfolio.tests.SignUpPageTest;

import com.daniel.seleniumportfolio.tests.BasePageTest;
import com.daniel.seleniumportfolio.tests.HomePage;
import org.testng.annotations.Test;

public class SignUpLoginPageTest extends BasePageTest {

    @Test
    public void testSignUp() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.clickSignUpLoginButton();

//        SignUpLoginPage signUpLoginPage = new SignUpLoginPage(driver);
//        signUpLoginPage.isNewUserMessageLocatorDisplay();
//        signUpLoginPage.enterSignUpUsername("Wakanda");
//        signUpLoginPage.enterSingUpEmail("waki123@email.com");
//        signUpLoginPage.clickSignUpButton();
//
//        //Assert.assertTrue(signUpLoginPage.isNewUserMessageLocatorDisplay());
//        //Assert.assertEquals(homePage.getCurrentUrl(), "https://automationexercise.com/login");
    }
}
