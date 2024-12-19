package org.ascus.testcases;

import org.ascus.utils.CommonAction;
import org.ascus.pom.*;
import org.ascus.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AscusTestCases extends BaseTest {
    HomePage page;
    ContactPage contactPage;
    AboutPage aboutPage;
    CommonAction commonAction;

    @BeforeClass
    public void loadPages(){
        page = new HomePage();
        contactPage = new ContactPage();
        aboutPage = new AboutPage();
        commonAction = new CommonAction();

    }


    @Test(priority = 0)
    public void homePageHeadFooterNavBarDisplayed(){
        Assert.assertEquals(page.getURl(),"https://ascustech.in/","Home Page url is not match");
        Assert.assertTrue(page.isNarBarVisible(),"NavBar is not displayed in HomePage");
        Assert.assertTrue(page.isTopBarVisible(),"TopBar is not displayed in HomePage");
        Assert.assertTrue(page.isFooterVisible(),"Footer is not displayed in HomePage");
        commonAction.scroll("600");
        Assert.assertFalse(page.isTopBarDisplayed(),"TopBar is present when scroll");


    }

    @Test(priority = 1)
    public void goToAboutPageFromNavBar(){
        page.clickAboutPage();
        Assert.assertEquals(aboutPage.getURl(),"https://ascustech.in/about/","This is not About page");
        Assert.assertEquals(aboutPage.getTitle().trim().toLowerCase(),"about","Title miss match");
        Assert.assertTrue(aboutPage.isNarBarVisible(),"NavBar is not displayed in about page");
        Assert.assertTrue(aboutPage.isTopBarVisible(),"TopBar is not displayed in about page");
        Assert.assertTrue(aboutPage.isFooterVisible(),"Footer is not displayed in about page");

    }
    @Test(priority = 2)
    public void goToContactPage(){
        page.clickContactPage();
        System.out.println(contactPage.getURl());
        Assert.assertTrue(aboutPage.isNarBarVisible(),"NavBar is not displayed in about page");
        Assert.assertTrue(aboutPage.isTopBarVisible(),"TopBar is not displayed in about page");
        Assert.assertTrue(contactPage.isFooterVisible(),"Footer is not present");
        contactPage.clickDiscovery();
    }


}
