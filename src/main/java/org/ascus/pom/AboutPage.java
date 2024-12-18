package org.ascus.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutPage extends CommonPage {
    public AboutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

}
