package org.ascus.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LocatorsTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().fullscreen();
        WebElement username = driver.findElement(By.xpath("//input[@name='username' and contains(@class,'oxd-input')]"));
        if(username.isDisplayed()){
            username.clear();
            username.sendKeys("Admin");
            System.out.println(username.getAttribute("value"));
        }
        WebElement password = driver.findElement(By.xpath("//input[@type='password' and contains(@class,'oxd-input')]"));
        if (password.isDisplayed()){
            password.clear();
            password.sendKeys("admin123");
            System.out.println(password.getAttribute("value"));
        }
        WebElement  loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        if(loginButton.isEnabled()){
            loginButton.click();
        }

        WebElement myInfoButton = driver.findElement(By.cssSelector("li>a[href='/web/index.php/pim/viewMyDetails']"));
        if (myInfoButton.isEnabled()){
            myInfoButton.click();
        }
        driver.manage().window().fullscreen();
        WebElement  dropDownNation = driver.findElement(By.xpath("//div[@class = 'oxd-input-group oxd-input-field-bottom-space' and contains(.,'Nationality')]/descendant::div[@class='oxd-select-text oxd-select-text--active']"));
        if (dropDownNation.isDisplayed()){
            System.out.println(dropDownNation.getText());
            dropDownNation.click();
        }

        WebElement dropDownMenu = driver.findElement(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
        if (dropDownMenu.isDisplayed()){
            List<WebElement> dropDownItems = driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div[@role='option']"));
            for(WebElement ele : dropDownItems){
                System.out.println(ele.getText());
                if (ele.getText().equalsIgnoreCase("indian")){
                    ele.click();
                    break;
                }else {
                    System.out.println("some thing went wrong");
                }
            }
        }

        WebElement profileMenu = driver.findElement(By.cssSelector("li[data-v-bdd6d943]"));
        if(profileMenu.isDisplayed()){
            profileMenu.click();
            WebElement logout = driver.findElement(By.cssSelector("ul[role='menu']>li>a[href*='logout']"));
            logout.click();
        }

        driver.quit();
    }
}
