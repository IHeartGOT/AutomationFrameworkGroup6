package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreditCardApp extends CommonAPI {

    public CreditCardApp(){

        PageFactory.initElements (driver, this);
    }

    @FindBy (linkText = "Credit Services")
    WebElement cs;
    @FindBy (linkText = "Apply Now")
    WebElement apply;
    @FindBy (id = "apply_firstname")
    WebElement fn;
    @FindBy (id = "apply_lastname")
    WebElement ln;
    @FindBy (id = "apply_email")
    WebElement email;
    @FindBy (id = "apply_address")
    WebElement add;
    @FindBy (id = "apply_city")
    WebElement city;
    @FindBy (id = "apply_zipcode")
    WebElement zip;
    @FindBy (id = "apply_phone")
    WebElement ph;
    @FindBy (id = "apply_monthlymortgage")
    WebElement mtg;
    @FindBy (id = "apply_annualincome")
    WebElement income;
    @FindBy (id = "apply_ssn")
    WebElement ssn;
    @FindBy (id = "apply_dob")
    WebElement dob;
    @FindBy(id = "apply_tncCommon")
    WebElement rdio;
    @FindBy(id = "apply_emailDeliveryFlag")
    WebElement edel;
    @FindBy(id = "apply_submit")
    WebElement submit;
    @FindBy(className = "asvgTop")
    WebElement svg;

    public WebElement Credit(){ return cs;}
    public WebElement Application(){return apply;}
    public WebElement FName(){return fn;}
    public WebElement LName(){return ln;}
    public WebElement Email(){return email;}
    public WebElement Address(){return add;}
    public WebElement City1(){return city;}
    public WebElement ZipCode(){return zip;}
    public WebElement Phone(){return ph;}
    public WebElement Mortgage(){return mtg;}
    public WebElement Income(){return income;}
    public WebElement Social(){return ssn;}
    public WebElement Birth(){return dob;}
    public WebElement Agree(){return rdio;}
    public WebElement EmailAgree(){return edel;}
    public WebElement SubmitApp(){return submit;}
    public WebElement SVG(){return svg;};


    public void CreditCardAppPage(){
        cs.click ();
        Application ().click ();
        FName ().sendKeys ("John");
        LName ().sendKeys ("Smith");
        Email ().sendKeys ("johnsmith123456@gmail.com");
        Address ().sendKeys ("1234 Main Street");
        City1 ().sendKeys ("Woodhaven");
        Select s = new Select (driver.findElement (By.id ("apply_state")));
        s.selectByValue ("NY");
        ZipCode ().sendKeys ("11421");
        Phone ().sendKeys ("7185555555");
        Mortgage ().sendKeys ("2000");
        Select i = new Select (driver.findElement (By.id ("apply_residencestatus")));
        i.selectByValue ("O");
        Income ().sendKeys ("10000000");
        Social ().sendKeys ("123456789");
        Birth ().sendKeys ("11151980");
        Agree ().click ();
        EmailAgree ().click ();
        SubmitApp ().click ();
    }

}
