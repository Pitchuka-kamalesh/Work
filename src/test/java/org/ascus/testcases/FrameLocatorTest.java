package org.ascus.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement body = driver.findElement(By.cssSelector("body"));
        System.out.println(body.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement bodys = driver.findElement(By.cssSelector("body"));
        System.out.println(bodys.getText());
        driver.switchTo().defaultContent();
        driver.quit();





    }
}
