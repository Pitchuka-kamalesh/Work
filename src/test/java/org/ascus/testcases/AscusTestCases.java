package org.ascus.testcases;

import org.ascus.reports.ExtentReportManager;
import org.ascus.utils.CommonAction;
import org.ascus.pom.*;
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
    public void ValidateTopBar(){
        ExtentReportManager.logInfoDetails("Page is Loaded");
        Assert.assertEquals(page.getURl(),"https://ascustech.in/","Home Page url is not match");
        ExtentReportManager.logPassDetails("Home page url is valid");
        Assert.assertTrue(page.isNarBarVisible(),"NavBar is not displayed in HomePage");
        ExtentReportManager.logPassDetails("NavBar is visible");
        Assert.assertTrue(page.isTopBarVisible(),"TopBar is not displayed in HomePage");
        ExtentReportManager.logPassDetails("TopBar is visible");
        Assert.assertTrue(page.isFooterVisible(),"Footer is not displayed in HomePage");
        ExtentReportManager.logPassDetails("Footer is visible");
        commonAction.scroll("600");
        Assert.assertFalse(page.isTopBarDisplayed(),"TopBar is present when scroll");
        ExtentReportManager.logPassDetails("TopBar is not visible");
    }
    @Test(priority = 1)
    public void ValidateAboutPage(){
        ExtentReportManager.logInfoDetails("Page is Loaded");
        page.clickAboutPage();
        ExtentReportManager.logInfoDetails("Click on About in NavBar");
        Assert.assertEquals(aboutPage.getURl(),"https://ascustech.in/about/","This is not About page");
        ExtentReportManager.logPassDetails("About page url is valid");
        Assert.assertEquals(aboutPage.getTitle().trim().toLowerCase(),"about","Title miss match");
        ExtentReportManager.logPassDetails("About page Title is About");
        Assert.assertTrue(aboutPage.isNarBarVisible(),"NavBar is not displayed in HomePage");
        ExtentReportManager.logPassDetails("NavBar is visible");
        Assert.assertTrue(aboutPage.isTopBarVisible(),"TopBar is not displayed in HomePage");
        ExtentReportManager.logPassDetails("TopBar is visible");
        Assert.assertTrue(aboutPage.isFooterVisible(),"Footer is not displayed in HomePage");
        ExtentReportManager.logPassDetails("Footer is visible");
        commonAction.scroll("600");
        Assert.assertFalse(aboutPage.isTopBarDisplayed(),"TopBar is present when scroll");
        ExtentReportManager.logPassDetails("TopBar is not visible");
        commonAction.scroll("-600");
        Assert.assertTrue(aboutPage.isTopBarDisplayed(),"TopBar is not present when scroll");
        ExtentReportManager.logInfoDetails("Click on Home in NavBar");
        aboutPage.clickHomePage();
        Assert.assertEquals(aboutPage.getURl(),"https://ascustech.in/","Home Page url is not match");
        ExtentReportManager.logPassDetails("Home page url is valid");
    }
    @Test(priority = 2)
    public void ValidateContactPage() throws InterruptedException {
        ExtentReportManager.logInfoDetails("Page is Loaded");
        page.clickContactPage();
        ExtentReportManager.logInfoDetails("Click on About in NavBar");
        Assert.assertEquals(contactPage.getURl(),"https://ascustech.in/contact/","This is not contact page");
        ExtentReportManager.logPassDetails("About page url is valid");
        Assert.assertEquals(contactPage.getTitle().trim().toLowerCase(),"contact","Title miss match");
        ExtentReportManager.logPassDetails("About page Title is About");
        Assert.assertTrue(contactPage.isNarBarVisible(),"NavBar is not displayed in HomePage");
        ExtentReportManager.logPassDetails("NavBar is visible");
        Assert.assertTrue(contactPage.isTopBarVisible(),"TopBar is not displayed in HomePage");
        ExtentReportManager.logPassDetails("TopBar is visible");
        Assert.assertTrue(contactPage.isFooterVisible(),"Footer is not displayed in HomePage");
        ExtentReportManager.logPassDetails("Footer is visible");
        commonAction.scroll("600");
        boolean dis = contactPage.isTopBarDisplayed();
        Assert.assertFalse(dis,"TopBar is present when scroll");
        ExtentReportManager.logPassDetails("TopBar is not visible");
        commonAction.scroll("-600");
        Assert.assertTrue(contactPage.isTopBarDisplayed(),"TopBar is not present when scroll");
        ExtentReportManager.logInfoDetails("Click on Discover More in Footer");
        contactPage.clickDiscovery();
        Assert.assertEquals(aboutPage.getURl(),"https://ascustech.in/about/","This is not About page");
        ExtentReportManager.logPassDetails("About page url is valid");
        Assert.assertEquals(aboutPage.getTitle().trim().toLowerCase(),"about","Title miss match");
        ExtentReportManager.logPassDetails("About page Title is About");
        ExtentReportManager.logInfoDetails("Click on Home in NavBar");
        contactPage.clickHomePage();
        Assert.assertEquals(contactPage.getURl(),"https://ascustech.in/","Home Page url is not match");
        ExtentReportManager.logPassDetails("Home page url is valid");

    }


}
