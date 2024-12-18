package org.ascus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonAction {
    WebDriver driver;
    WebDriverWait wait;
    public CommonAction(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void safeClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
