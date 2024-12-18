package org.ascus;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonAction {
    WebDriver driver;
    Wait<WebDriver> wait;
    JavascriptExecutor javascriptExecutor;
    public CommonAction(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        javascriptExecutor = (JavascriptExecutor) driver;
    }
    public void safeClick(WebElement element){
        spinnerDisappear();
        WebElement safeElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        safeElement.click();
    }
    public void spinnerDisappear(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='reobiz-load']")));
    }
    public boolean isPresent(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
    public String getText(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void clearText(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
    }
    public void sendText(WebElement element,String value){
        clearText(element);
        element.sendKeys(value);
    }
    public void scroll(){
            javascriptExecutor.executeScript("window.scrollBy(0,600)");
    }

}
