package com.daniel.seleniumportfolio.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends  BasePage{
    private By newUserMessageLocator = By.xpath("//*[text()='New User Signup!']");
    private By signUpNameLocator = By.cssSelector("[data-qa='signup-name']");
    private By signUpEmailLocator = By.cssSelector("[data-qa='signup-email']");
    private By signUpButtonlLocator = By.cssSelector("[data-qa='signup-button']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNewUserMessageLocatorDisplay() {
        return  isDisplay(newUserMessageLocator);
    }

    public SignUpPage createNewUser(String username, String email){
        driver.findElement(signUpNameLocator).sendKeys(username);
        driver.findElement(signUpEmailLocator).sendKeys(email);
        driver.findElement(signUpButtonlLocator).click();
        return  new SignUpPage(driver);
    }

    public void enterSingUpEmail(String email){
        driver.findElement(signUpEmailLocator).sendKeys(email);
    }

    public void clickSignUpButton(){
        driver.findElement(signUpButtonlLocator).click();
    }

}
