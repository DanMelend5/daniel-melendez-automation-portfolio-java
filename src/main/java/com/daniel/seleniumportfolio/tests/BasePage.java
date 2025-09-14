package com.daniel.seleniumportfolio.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    protected void navigate(String url) {
        driver.get(url);
    }

    public String getPageSource() {
        return driver.getPageSource();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    protected boolean isDisplay(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();  //IF the element is present throws true
        } catch (NoSuchElementException e) {   //the handles no such element Exception
            return false;
        }
    }

    protected WebElement waitForElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));  // uses a general locator
    }

    protected boolean waitForIsDisplay(By locator) { // handles a timeout exception
        try {
            waitForElement(locator);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    protected boolean waitForIsHidden(By locator) { // handles the element is not visible
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }

    }
}
