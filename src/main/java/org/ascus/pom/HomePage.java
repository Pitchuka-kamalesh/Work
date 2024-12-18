package org.ascus.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH,xpath = "//*[@id='reobiz-load']")
    private WebElement loadBar;

    @FindBy(how = How.XPATH,xpath = "")
    private  WebElement getStarted;

    @FindBy(how = How.XPATH,xpath = "")
    private WebElement watchVideo;

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


    public Boolean isLoadBarPresent(){
        return loadBar.isDisplayed();
    }

    public boolean isNarBarVisible(){
        return navBar.isDisplayed();
    }

    public void clickContactPage() {
        if (this.isLoadBarPresent()) {
            try {
                Thread.sleep(5000);
                navBarContactLink.click();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }else navBarContactLink.click();
    }

    public void clickHomePage(){
        if (this.isLoadBarPresent()) {
            try {
                Thread.sleep(5000);
                navBarHomeLink.click();;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }else navBarHomeLink.click();;

    }

    public void clickAboutPage(){
        if (this.isLoadBarPresent()) {
            try {
                Thread.sleep(5000);
                navBarAboutLink.click();;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }else navBarAboutLink.click();;

    }

}
