package org.ascus.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;


public class ContactPage extends CommonPage {
    public ContactPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }



}
