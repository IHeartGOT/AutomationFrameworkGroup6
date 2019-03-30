package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class EHomePage extends CommonAPI {

    public EHomePage(){

        PageFactory.initElements (driver, this);
    }


    @FindBy (css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > a")
    WebElement motor;

    @FindBy (css = "#gh-eb-My > div > a.gh-eb-li-a")
    WebElement MyEbay;

    @FindBy (id ="gh-cart-i")
    WebElement shopping;

    @FindBy (css = "#gh-ug > a")
    WebElement signin;

    @FindBy (id = "userid")
    WebElement username;

    @FindBy (id = "pass")
    WebElement password;

    @FindBy (id = "sgnBt")
    WebElement signButton;

    @FindBy(className ="gh-p")
    WebElement sell;

    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[5]/a")
    WebElement returns;

    public WebElement Returns(){return returns;}

    public void ReturnsPage(){
        Returns ().click ();
    }

    @FindBy (linkText = "Company info")
    WebElement info;

    public WebElement Company(){return info;}

    public void CompanyInfoPage(){
        Company ().click ();
    }

    @FindBy (linkText = "News")
    WebElement news;

    public WebElement News(){return news;}

    public void NewsPage(){
        News ().click ();
    }

    @FindBy (linkText = "Investors")
    WebElement invest;

    public WebElement Inversting(){return invest;}


    public void InverstorsPage(){
        Inversting ().click ();
    }

    public WebElement MotorLink() {

        return motor;
    }

    public WebElement LoginLink() {
        return MyEbay;

    }

    public WebElement ShoppingLink() {
        return shopping;

    }

    public WebElement SignInLink() {
        return signin;

    }

    public WebElement UserName() {
        return username;

    }

    public WebElement Password() {
        return password;

    }

    public WebElement SignButton() {
        return signButton;

    }

    public WebElement SellPage() {
        return sell;
    }

        public void HomePageLinks(){
            MotorLink ().click ();
            String title = driver.getTitle ();
            LoginLink ().click ();
            driver.navigate ().back ();
            ShoppingLink ().click ();
            SignInLink ().click ();
            UserName ().sendKeys ("ProdipBhowmik");
            Password ().sendKeys ("123456");
            SignButton ();
            SellPage ();
            Assert.assertEquals (title, "eBay Motors: Auto Parts and Vehicles | eBay");
        }

    }