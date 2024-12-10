package org.ascus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://wealthzonetech.com/ascustech");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
        System.out.println(driver.manage().timeouts().getPageLoadTimeout());
    }



    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
