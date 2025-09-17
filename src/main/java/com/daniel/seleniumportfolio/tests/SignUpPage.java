package com.daniel.seleniumportfolio.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {
    private By enterAccountMessageLocator = By.xpath("//*[text()='Enter Account Information']");


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isEnterAccountMessageLocatorDisplay() {
        return  isDisplay(enterAccountMessageLocator);
    }
}
