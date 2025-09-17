package com.daniel.seleniumportfolio.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By automationExerciseCarousel = By.xpath("//div[@id='slider-carousel']");
    private By clickSignUpLoginButton = By.linkText("Signup / Login");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        super.navigate("https://automationexercise.com/");
    }

    public boolean isAutomationExerciseCarouselDisplay() {
            return  isDisplay(automationExerciseCarousel);
    }


    public LoginPage clickSignUpLoginButton() {
        driver.findElement(clickSignUpLoginButton).click();
        return new LoginPage(driver);
    }
}
