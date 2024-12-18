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
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public boolean loadingBar(WebElement element){
        return wait.until(ExpectedConditions.invisibilityOf(element));
    }
    public String getTitleText(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    public void safeClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
