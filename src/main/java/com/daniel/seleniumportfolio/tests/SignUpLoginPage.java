package com.daniel.seleniumportfolio.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpLoginPage  extends  BasePage{
    private By newUserMessageLocator = By.xpath("//*[text()='New User Signup!']");
    private By signUpNameLocator = By.cssSelector("[data-qa='signup-name']");
    private By signUpEmailLocator = By.cssSelector("[data-qa='signup-email']");
    private By signUpButtonlLocator = By.cssSelector("[data-qa='signup-button']");

    public SignUpLoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNewUserMessageLocatorDisplay() {
        return  isDisplay(newUserMessageLocator);
    }

    public void enterSignUpUsername(String username){
        driver.findElement(signUpNameLocator).sendKeys(username);
    }


    public void enterSingUpEmail(String email){
        driver.findElement(signUpEmailLocator).sendKeys(email);
    }

    public void clickSignUpButton(){
        driver.findElement(signUpButtonlLocator).click();
    }

}
