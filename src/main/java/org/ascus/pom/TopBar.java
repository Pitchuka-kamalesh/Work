package org.ascus.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TopBar {
    WebDriver driver;

    public TopBar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(how = How.XPATH,xpath = "//div[@class ='toolbar-area ff  ']")
    private WebElement topBar;

    public boolean isTopBarVisible(){

        return topBar.isDisplayed();
    }

}
