package org.ascus;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SampleTest {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("WebSocketUrl",true);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();



    }
}
