package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class Fashion extends CommonAPI {

    public Fashion(){
        PageFactory.initElements (driver, this);
    }
    @FindBy (css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(4) > a")
    WebElement fashion;

    public WebElement Fashion(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        return fashion;}

    public void FashionPage(){
        fashion.click ();
    }

    @FindBy (css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(4) > a")
    WebElement fashionP;

    @FindBy (css="#w1-w0-w0-toggle-button > span")
    WebElement women;

    public WebElement Fashion2(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        return fashionP;}
    public WebElement Women(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return women;}


    public void FashionPageLink(){
        Fashion2 ().click ();
        Women ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Fashion | eBay");
    }


}

