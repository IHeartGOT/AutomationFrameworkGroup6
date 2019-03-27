package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Developer extends CommonAPI {

    public Developer(){ PageFactory.initElements (driver, this);

    }

    @FindBy (linkText ="Developers")
    WebElement develop;

    @FindBy (css ="#main-menu > li:nth-child(2) > a")
    WebElement register;

    @FindBy (id = "w4-w1-registration-username")
    WebElement username;

    @FindBy (id = "w4-w1-w1-password")
    WebElement password;

    @FindBy(id="w4-w1-w1-8-64-characters")
    WebElement radio8;

    @FindBy (id = "w4-w1-registration-email")
    WebElement email;

    @FindBy (id = "w4-w1-registration-reenter-email")
    WebElement reemail;

    @FindBy (id = "w4-w1-w2-phone")
    WebElement phone;

    @FindBy(id="w4-w1-checkbox-user-agreement")
    WebElement checkbox;

    @FindBy(id="w4-w1-join-button")
    WebElement join;



    public WebElement Develop(){return develop;}

    public WebElement Regis() {return register;}

    public WebElement Usr() {return username;}

    public WebElement Pass() {return password;}

    public WebElement Rdio1(){return radio8;}

    public WebElement EmailAd(){return email;}

    public WebElement ReEmailAd(){return reemail;}

    public WebElement Tel(){return phone;}

    public WebElement rdio2(){return checkbox;}

    public WebElement JoinBtn(){return join;}



    public void DeveloperPage(){
        Develop ().click ();
        driver.manage().timeouts().pageLoadTimeout(200, SECONDS);
        Regis ().click ();
        Usr ().sendKeys ("prodip718");
        Pass ().sendKeys ("123456abc");
        Rdio1 ().click ();
        EmailAd ().sendKeys ("ptbhowmik@gmail.com");
        ReEmailAd ().sendKeys ("ptbhowmik@gmail.com");
        Tel ().sendKeys ("7184080480");
        rdio2 ().click ();
        JoinBtn ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "eBay Developers Program Registration | eBay");

    }
}
