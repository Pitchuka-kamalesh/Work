package org.ascus;

import org.ascus.pom.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class AscusTestCases {
    WebDriver driver;
    HomePage homepage;
    CommonPage page;
    @BeforeClass
    public void setUp(){
        driver = new EdgeDriver();
        driver.get("https://ascustech.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        page = new CommonPage(driver);

    }

    @Test(priority = 0)
    public void homePageHeadFooterNavBarDisplayed(){
        Assert.assertEquals(page.getURl(),"https://ascustech.in/","Home Page url is not match");
        Assert.assertTrue(page.isNarBarVisible(),"NavBar is not displayed in HomePage");
        Assert.assertTrue(page.isTopBarVisible(),"TopBar is not displayed in HomePage");
        Assert.assertTrue(page.isFooterDisplayed(),"Footer is not displayed in HomePage");


    }

    @Test(priority = 1)
    public void goToAboutPageFromNavBar(){
        page.clickAboutPage();
        Assert.assertEquals(page.getURl(),"https://ascustech.in/about/","This is not About page");
        Assert.assertEquals(page.getTitle().trim().toLowerCase(),"about","Title miss match");
        Assert.assertTrue(page.isNarBarVisible(),"NavBar is not displayed in about page");
        Assert.assertTrue(page.isTopBarVisible(),"TopBar is not displayed in about page");
        Assert.assertTrue(page.isFooterDisplayed(),"Footer is not displayed in about page");
    }





    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
