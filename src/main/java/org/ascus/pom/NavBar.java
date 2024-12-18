package org.ascus.pom;

import org.ascus.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class NavBar {
    WebDriver driver;
    CommonAction commonAction;
    public NavBar(WebDriver driver){
        this.driver = driver;
        commonAction = new CommonAction(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH,xpath = "//*[@id='reobiz-load']")
    private WebElement loadBar;

    @FindBy(how = How.XPATH,xpath = "//div[@class='menu-area menu_type_']")
    private WebElement navBar;

    @FindBy(how = How.XPATH,xpath = "//div[@class='col-cell header-logo']//img")
    private List<WebElement> navBarLogos;

    @FindBy(how = How.XPATH,xpath = "//div[@class='navbar-menu']//child::a[text()='Home']")
    private WebElement navBarHomeLink;

    @FindBy(how = How.XPATH,xpath = "//div[@class='navbar-menu']//child::a[text()='About']")
    private WebElement navBarAboutLink;

    @FindBy(how = How.XPATH,xpath = "//div[@class='navbar-menu']//child::a[text()='Contact']")
    private WebElement navBarContactLink;

    public boolean isNarBarVisible(){
        return navBar.isDisplayed();
    }

    public void clickAboutPage() throws InterruptedException {
        if(commonAction.loadingBar(loadBar) == true){
            Thread.sleep(5000);
            commonAction.safeClick(navBarAboutLink);
        }else {
            commonAction.safeClick(navBarAboutLink);
        }

    }

    public void clicContactPage(){
        navBarContactLink.click();
    }

    public void clickHomePage(){
        navBarHomeLink.click();
    }

}
