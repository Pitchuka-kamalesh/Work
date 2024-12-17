package org.ascus;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;


public class AuthBidi {
    public static void main(String[] args)  {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        WebElement searchBar = driver.findElement(By.cssSelector("textarea[name='q']"));
        searchBar.sendKeys("cricketScore");
        searchBar.submit();
//        driver.navigate().refresh();

        try {
            CricketPage cricket = new CricketPage(driver);
            System.out.println(cricket.firstTeamScore());
            System.out.println(cricket.secondTeamScore());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            driver.quit();
        }finally {
            driver.quit();
        }



    }

}
