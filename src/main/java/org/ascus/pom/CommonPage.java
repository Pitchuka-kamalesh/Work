package org.ascus.pom;

import org.ascus.utils.CommonAction;
import org.ascus.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonPage {
    WebDriver driver;
    CommonAction action;
    public CommonPage(){
        this.driver =  DriverManager.getDriver();
        PageFactory.initElements( DriverManager.getDriver(),this);
        action = new CommonAction();
    }

    @FindBy(how = How.XPATH,xpath = "//*[@id='reobiz-load']")
    private WebElement spinner;

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

    public boolean isTopBarVisible(){return action.isPresent(topBar);}
    public String getTitle(){return action.getText(pageTitle);}
    public String getURl(){return action.getUrl();}
    public boolean isLoadBarPresent(){return action.isPresent(spinner);}
    public boolean isNarBarVisible(){return action.isPresent(navBar);}
    public void clickContactPage() {action.safeClick(navBarContactLink);}
    public void clickHomePage(){action.safeClick(navBarHomeLink);}
    public void clickAboutPage(){action.safeClick(navBarAboutLink);}
    public boolean isFooterVisible(){return action.isPresent(footer);}
    public void clickDiscovery(){action.safeClick(footerDiscoverButton);}
    public boolean isTopBarDisplayed(){return topBar.isDisplayed();}
    public boolean isNavBarDisplayed(){return navBar.isDisplayed();}
    public boolean isFooterDisplayed(){return footer.isDisplayed();}

}
