package com.automationexercise.pageobjects.SignUpPageTest;

import com.automationexercise.pageobjects.BasePageTest;
import com.automationexercise.pageobjects.HomePage;
import com.automationexercise.pageobjects.SignUpLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

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
