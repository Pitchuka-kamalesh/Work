package org.ascus.pom;

import org.ascus.utils.DriverManager;
import org.openqa.selenium.support.PageFactory;


public class ContactPage extends CommonPage {
    public ContactPage(){
        super();
        PageFactory.initElements(DriverManager.getDriver(),this);
    }



}
