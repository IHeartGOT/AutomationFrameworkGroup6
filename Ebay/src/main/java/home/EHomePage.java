package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import reporting.TestLogger;

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

    @FindBy (linkText = "eBay Money Back Guarantee")
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




    public WebElement Community(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return community;}

    public WebElement Announcement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return announcement;}

    public WebElement Contact(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return contact;}

    public WebElement Policies(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return policies;}

    public WebElement Career(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return career;}

    public WebElement StubHub(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return stub;}

    public WebElement Stores(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return stores;}

    public WebElement MoneyBack(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return moneyback;}

    public WebElement EClassified(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return  classified;}

    public WebElement Returns(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return returns;}

    public WebElement Company(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return info;}

    public WebElement Inversting(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return invest;}

    public WebElement LoginLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return MyEbay;}

    public WebElement News(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return news;}

    public WebElement MotorLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return motor;}

    public WebElement ShoppingLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return shopping; }

    public WebElement SignInLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return signin;}

    public WebElement UserName() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return username; }

    public WebElement Password() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return password; }

    public WebElement SignButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return signButton; }

    public WebElement Sell() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return sell;}



        public void CompanyInfoPage(){
        Company ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Our Company - eBay Inc.");
    }

        public void ClassifiedsPage() {
        EClassified ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Home | eBay Classifieds Group");

    }

        public void HomePageLinks() {
            MotorLink ().click ();
            String title = driver.getTitle ();
            Assert.assertEquals (title, "eBay Motors: Auto Parts and Vehicles | eBay");
        }

        public void HomePageLinks2() {
            LoginLink ().click ();
            String title = driver.getTitle ();
            Assert.assertEquals (title, "Sign in or Register | eBay");

        }

        public void HomePageLinks3() {

            ShoppingLink ().click ();

        }
        public void SigninPage(){
            SignInLink ().click ();
            UserName ().sendKeys ("ProdipBhowmik");
            Password ().sendKeys ("123456");
            SignButton ().click ();
    }

        public void ReturnsPage(){
        Returns ().click ();
            String title = driver.getTitle ();
            Assert.assertEquals (title, "eBay Returns");

    }

        public void NewsPage(){
        News ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Our News - eBay Inc.");

    }

        public void InvestorsPage(){
        Inversting ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "eBay Inc. - Investor Relations");

    }
        public void MoneyBackPage(){
        MoneyBack ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Money Back Guarantee | eBay\n");

    }

        public void StorePage(){
        Stores ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Why Get an eBay Store");

    }

        public  void StubHubPage(){
        StubHub ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Buy sports, concert and theater tickets on StubHub!");

    }
        public void CareerPage(){
        Career ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Find Your Dream Job - eBay Inc. Careers");

    }
        public void PoliciesPage(){
        Policies ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Rules and policies | eBay");

    }
        public  void ContactPage(){
        Contact ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Sign in or Register | eBay");

    }
        public void AnnouncementPage(){
        Announcement ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Announcements - The eBay Community");

    }
        public void SellPage(){
        Sell ().click ();

    }
        public void CommunityPage(){
        Community ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Groups - The eBay Community");
        }



    }