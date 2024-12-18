package org.ascus.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Footer {
    WebDriver driver;
    public Footer(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

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


    public boolean isFooterDisplayed(){
        return footer.isDisplayed();
    }
}
