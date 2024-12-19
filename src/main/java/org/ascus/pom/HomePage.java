package org.ascus.pom;

import org.ascus.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends CommonPage {

    public HomePage(){
        super();
        PageFactory.initElements(DriverManager.getDriver(),this);
    }


    @FindBy(how = How.XPATH,xpath = "")
    private  WebElement getStarted;

    @FindBy(how = How.XPATH,xpath = "")
    private WebElement watchVideo;





}
