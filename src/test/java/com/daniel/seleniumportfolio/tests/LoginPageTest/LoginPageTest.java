package com.daniel.seleniumportfolio.tests.LoginPageTest;

import com.daniel.seleniumportfolio.tests.BasePageTest;
import com.daniel.seleniumportfolio.tests.HomePage;
import com.daniel.seleniumportfolio.tests.LoginPage;
import com.daniel.seleniumportfolio.tests.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePageTest {

    //3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    @Test
    public void testSignUp() {
        //3. Verify that home page is visible successfully
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        LoginPage loginPage = homePage.clickSignUpLoginButton();
        Assert.assertTrue(loginPage.isNewUserMessageLocatorDisplay());

        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        SignUpPage signUpPage = loginPage.createNewUser("Wakanda", "waki@email.com");
        Assert.assertTrue(signUpPage.isEnterAccountMessageLocatorDisplay());


    }
}
