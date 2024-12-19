package org.ascus.utils;

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
    public CommonAction(){
        this.driver = DriverManager.getDriver();
        wait = new WebDriverWait( DriverManager.getDriver(), Duration.ofSeconds(20));
        javascriptExecutor = (JavascriptExecutor)  DriverManager.getDriver();
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
    public void scroll(String pixel){
        String script = "window.scrollBy(0,"+ pixel +")";
        javascriptExecutor.executeScript(script);
    }

}
