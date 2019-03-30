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


    @FindBy (linkText = "Company info")
    WebElement info;

    @FindBy (linkText = "News")
    WebElement news;

    @FindBy (linkText = "Investors")
    WebElement invest;

    @FindBy (linkText = "eBay Classifieds")
    WebElement classified;

    @FindBy (linkText = "eBay eBay Money Back Guarantee")
    WebElement moneyback;

    @FindBy (xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[5]/a")
    WebElement stores;

    @FindBy(xpath = "//a[contains(text(),'StubHub')]")
    WebElement stub;

    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    WebElement career;

    @FindBy(xpath = "//a[@class='thrd'][contains(text(),'Policies')]")
    WebElement policies;

    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    WebElement contact;

    @FindBy(xpath = "//a[@class='thrd'][contains(text(),'Announcements')]")
    WebElement announcement;

    @FindBy(xpath = "//a[contains(text(),'eBay Community')]")
    WebElement community;




    public WebElement Community(){return community;}

    public WebElement Announcement(){return announcement;}

    public WebElement Contact(){return contact;}

    public WebElement Policies(){return policies;}

    public WebElement Career(){ return career;}

    public WebElement StubHub(){return stub;}

    public WebElement Stores(){return stores;}

    public WebElement MoneyBack(){return moneyback;}

    public WebElement EClassified(){return  classified;}

    public WebElement Returns(){return returns;}

    public WebElement Company(){return info;}

    public WebElement Inversting(){return invest;}

    public WebElement LoginLink() { return MyEbay;}

    public WebElement News(){return news;}

    public WebElement MotorLink() { return motor;}

    public WebElement ShoppingLink() { return shopping; }

    public WebElement SignInLink() {return signin;}

    public WebElement UserName() {return username; }

    public WebElement Password() {return password; }

    public WebElement SignButton() {return signButton; }

    public WebElement Sell() { return sell;}



        public void CompanyInfoPage(){
        Company ().click ();
    }

        public void ClassifiedsPage(){
            EClassified ().click ();

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

        public void ReturnsPage(){
        Returns ().click ();

    }

        public void NewsPage(){
        News ().click ();

    }

        public void InvestorsPage(){
        Inversting ().click ();

    }
        public void MoneyBackPage(){
        MoneyBack ().click ();

    }

        public void StorePage(){
        Stores ().click ();

    }

        public  void StubHubPage(){
        StubHub ().click ();

    }
        public void CareerPage(){
            Career ().click ();

    }
        public void PoliciesPage(){
        Policies ().click ();

    }
        public  void ContactPage(){
        Contact ().click ();

    }
        public void AnnouncementPage(){
        Announcement ().click ();

    }
        public void SellPage(){
        Sell ().click ();

    }
        public void CommunityPage(){
        Community ().click ();
        }


    }