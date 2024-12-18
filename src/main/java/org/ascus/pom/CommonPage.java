package org.ascus.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class CommonPage {
    WebDriver driver;
    public CommonPage(WebDriver driver){
        this.driver = driver;
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

    @FindBy(how = How.XPATH,xpath = "//h1[@class='page-title']")
    private WebElement pageTitle;

    @FindBy(how = How.XPATH,xpath = "//footer[@id='rs-footer']")
    private WebElement footer;

    @FindBy(how = How.XPATH,xpath = "//a[@class='footer-btn']")
    private WebElement footerDiscoverButton;

    @FindBy(how = How.XPATH,xpath = "//div[@class='post-img'][1]")
    private WebElement footerPostFresherLink;

    @FindBy(how = How.XPATH,xpath = "//div[@class='post-img'][2]")
    private WebElement footerBusinessDevelopmentLink;

    @FindBy(how = How.XPATH,xpath = "//div[@class='post-img'][3]")
    private WebElement footerHRManagerLink;

    @FindBy(how = How.XPATH,xpath = "//div[@class ='toolbar-area ff  ']")
    private WebElement topBar;

    public boolean isTopBarVisible(){

        return topBar.isDisplayed();
    }


    public String getTitle(){
        if (this.isLoadBarPresent()) {
            try {
                Thread.sleep(5000);
                return pageTitle.getText();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        return pageTitle.getText();
    }

    public String getURl(){
        return driver.getCurrentUrl();
    }

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

        }else navBarHomeLink.click();

    }
    public void clickAboutPage(){
        if (this.isLoadBarPresent()) {
            try {
                Thread.sleep(5000);
                navBarAboutLink.click();;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }else navBarAboutLink.click();

    }
    public boolean isFooterDisplayed(){
        return footer.isDisplayed();
    }

}
