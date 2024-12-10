package org.ascus;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SampleTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://wealthzonetech.com/ascustech");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        WebElement topBar = driver.findElement(By.xpath("//div[@class='container-fluid  px-5 d-none d-lg-block fixed-top']"));
//        WebElement aboutUsLinkNavbar = driver.findElement(By.xpath("//a[text()='About Us']"));
//
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            js.executeScript("window.scrollBy(0,700)");
//            Assert.assertTrue(topBar.isDisplayed());
//            System.out.println("topBar is displayed");
//            WebElement startedLink = driver.findElement(By.linkText("Get Started"));
//            Assert.assertTrue(startedLink.equals(driver.switchTo().activeElement()));
//            System.out.println("started button is displayed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        finally {
//            System.out.println("exception cautched");
//            driver.quit();
//        }
        System.out.println("exception cautched out side finally");
//        driver.quit();
    }
}
