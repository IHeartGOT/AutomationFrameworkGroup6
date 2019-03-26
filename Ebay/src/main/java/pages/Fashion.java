package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fashion extends CommonAPI {

    public Fashion(){
        PageFactory.initElements (driver, this);
    }
    @FindBy (css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(4) > a")
    WebElement fashion;

    public WebElement Fashion(){return fashion;}

    public void FashionPage(){
        fashion.click ();
    }

    @FindBy (css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(4) > a")
    WebElement fashionP;

    @FindBy (css="#w1-w0-w0-toggle-button > span")
    WebElement women;

    public WebElement Fashion2(){return fashionP;}
    public WebElement Women(){return women;}


    public void FashionPageLink(){
        Fashion2 ().click ();
        Women ().click ();
    }


}

