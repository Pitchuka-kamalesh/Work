package org.ascus.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TopBar {
    WebDriver driver;

    public TopBar(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,5),this);

    }


}
