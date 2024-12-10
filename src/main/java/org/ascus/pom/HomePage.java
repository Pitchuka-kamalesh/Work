package org.ascus.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,5),this);
    }

    @FindBy(how = How.XPATH,xpath = "")
    private  WebElement getStarted;

    @FindBy(how = How.XPATH,xpath = "")
    private WebElement watchVideo;




}
