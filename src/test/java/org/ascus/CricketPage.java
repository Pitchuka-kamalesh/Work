package org.ascus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CricketPage {
    WebDriver driver;
    CricketPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS,css = ".ckt_live_status")
    private WebElement status ;

    @FindBy(how = How.CSS,css = "h2[class*='ckt_title']")
    private WebElement title;

    @FindBy(how = How.XPATH,xpath = "//div[@class = 'b_clearfix ckt_match_details'][1]")
    private WebElement firstTeam;

    @FindBy(how = How.XPATH,xpath = "//div[@class = 'b_clearfix ckt_match_details'][2]")
    private WebElement secondTeam;


    public String getMatchStatus(){
        return status.getText();
    }

    public boolean isTitlePresent(){
        return title.isDisplayed();
    }

    public String firstTeamScore(){
        return firstTeam.getText();
    }

    public String secondTeamScore(){
        return secondTeam.getText();
    }

}
