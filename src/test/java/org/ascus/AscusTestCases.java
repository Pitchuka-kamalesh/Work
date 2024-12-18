package org.ascus;

import org.ascus.pom.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AscusTestCases {
    WebDriver driver;
    HomePage page;
    ContactPage contactPage;
    AboutPage aboutPage;
    CommonAction commonAction;
    @BeforeClass
    public void setUp(){
        driver = new EdgeDriver();
        driver.get("https://ascustech.in/");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        page = new HomePage(driver);
        contactPage = new ContactPage(driver);
        aboutPage = new AboutPage(driver);
        commonAction = new CommonAction(driver);

    }


    @Test(priority = 0)
    public void homePageHeadFooterNavBarDisplayed(){
        Assert.assertEquals(page.getURl(),"https://ascustech.in/","Home Page url is not match");
        Assert.assertTrue(page.isNarBarVisible(),"NavBar is not displayed in HomePage");
        Assert.assertTrue(page.isTopBarVisible(),"TopBar is not displayed in HomePage");
        Assert.assertTrue(page.isFooterVisible(),"Footer is not displayed in HomePage");
        commonAction.scroll();
        Assert.assertFalse(page.isTopBarDisplayed(),"TopBar is present when scroll");
        page.clickDiscovery();


    }

    @Test(priority = 1)
    public void goToAboutPageFromNavBar(){
        page.clickAboutPage();
        Assert.assertEquals(aboutPage.getURl(),"https://ascustech.in/about/","This is not About page");
        Assert.assertEquals(aboutPage.getTitle().trim().toLowerCase(),"about","Title miss match");
        Assert.assertTrue(aboutPage.isNarBarVisible(),"NavBar is not displayed in about page");
        Assert.assertTrue(aboutPage.isTopBarVisible(),"TopBar is not displayed in about page");
        Assert.assertTrue(aboutPage.isFooterVisible(),"Footer is not displayed in about page");
        aboutPage.clickDiscovery();
    }
    @Test
    public void goToContactPage(){
        page.clickContactPage();
        System.out.println(contactPage.getURl());
        Assert.assertTrue(aboutPage.isNarBarVisible(),"NavBar is not displayed in about page");
        Assert.assertTrue(aboutPage.isTopBarVisible(),"TopBar is not displayed in about page");
        Assert.assertTrue(contactPage.isFooterVisible(),"Footer is not present");
        contactPage.clickDiscovery();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
