package org.ascus.pom;

import org.ascus.utils.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class AboutPage extends CommonPage {
    public AboutPage() {
        super();
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

}
