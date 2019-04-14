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

    @FindBy(xpath = "//*[@id=\"gh-p-3\"]/a")
    WebElement help;

    @FindBy(linkText = "Knowledge Base")
    WebElement knowledge;

    @FindBy(xpath = "//a[contains(text(),'Business sellers')]")
    WebElement business;

    @FindBy (linkText = "See all companies")
    WebElement companies;

    public WebElement getCompanies(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return companies;
    }

    public WebElement getBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return business;
    }

    public  WebElement getKnowledge(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return knowledge; }

    public WebElement HelpandContact(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return help;}

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


        public void MoneyBackPage5(){
        MoneyBack ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "eBay Money Back Guarantee | eBay");

        }

        public void CareerPage4(){
        Career ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
        }

        public void BusinessPage(){
        getBusiness ().click (); }

        public void KnowledgePage(){
        getKnowledge ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Commonly Asked Questions - The eBay Community");
        }

        public  void HelpPage(){
        HelpandContact ().click ();
        String title=driver.getTitle ();
        Assert.assertEquals (title, "eBay Customer Service" );
        }

        public void CareerPage3(){
        Career ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

        }

        public void CompanyInfoPage(){
        Company ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
        }

        public void PoliciesPage5(){
        Policies ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Rules and policies | eBay");

    }

        public void ClassifiedsPage() {
        EClassified ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public  void StubHubPage2(){
        StubHub ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

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
        public void StorePage2(){
        Stores ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Why Get an eBay Store");

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
        Assert.assertEquals (title, "Our News - eBay Inc");

    }
        public void PoliciesPage4(){
        Policies ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Rules and policies | eBay");

    }

        public void InvestorsPage(){
        Inversting ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void NewsPage5(){
        News ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Our News - eBay Inc");

    }
        public void MoneyBackPage(){
        MoneyBack ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "eBay Money Back Guarantee | eBay");

    }
        public void CareerPage5(){
        Career ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void StorePage(){
        Stores ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Why Get an eBay Store");

    }
        public  void StubHubPage3(){
        StubHub ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void InvestorsPage2(){
        Inversting ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void CommunityPage2(){
        Community ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
    }

        public void CareerPage(){
        Career ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Find Your Dream Job - eBay Inc. Careers");

    }
        public void MoneyBackPage2(){
        MoneyBack ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "eBay Money Back Guarantee | eBay");

    }
        public void StorePage3(){
        Stores ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Why Get an eBay Store");

        }
        public void InvestorsPage3(){
        Inversting ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void PoliciesPage(){
        Policies ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Rules and policies | eBay");

    }
        public  void StubHubPage(){
         StubHub ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public  void ContactPage(){
        Contact ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Sign in or Register | eBay");

    }
        public void InvestorsPage4(){
        Inversting ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void AnnouncementPage(){
        Announcement ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Announcements - The eBay Community");

    }
        public void NewsPage4(){
        News ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void StorePage4(){
        Stores ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Why Get an eBay Store");

    }
        public void SellPage2(){
        Sell ().click ();

    }
        public void InvestorsPage5(){
        Inversting ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void NewsPage3(){
        News ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void PoliciesPage2(){
        Policies ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Rules and policies | eBay");

    }
        public void CommunityPage(){
        Community ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
        }

        public void StorePage5(){
        Stores ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Why Get an eBay Store");

    }
    public void MoneyBackPage3(){
        MoneyBack ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "eBay Money Back Guarantee | eBay");

    }
        public void CareerPage2(){
        Career ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Find Your Dream Job - eBay Inc. Careers");

    }
        public void NewsPage2(){
        News ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
        public void MoneyBackPage4(){
        MoneyBack ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "eBay Money Back Guarantee | eBay");

    }
        public void PoliciesPage3(){
        Policies ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Rules and policies | eBay");

    }
    }