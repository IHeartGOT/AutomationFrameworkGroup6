package BrowseNYL;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Signing extends CommonAPI{
    @FindBy(xpath = "/html/body/footer/div/div/div/div[1]/div/div[1]/div[2]/div/ul/li[1]/a")public static WebElement signInlink;
    @FindBy(css = "body > header > div > div.mobile-nav.dp-11.mb-12 > div > div.dp-3.mb-12.section-2")public static WebElement signInButton;
    @FindBy(css ="#vscUserName")public static WebElement userIdInputBar;
    @FindBy(css = "#vscPassword")public static WebElement passwordInputBar;
    @FindBy(xpath = "//*[@id=\"event56Registration\"]") public static WebElement registerLink;
    @FindBy(css = "#firstname")public static WebElement firstNameforRegister;
    @FindBy(css = "#lastname")public static WebElement lastNameforRegister;
    @FindBy(css = "#email")public static WebElement emailForRegister;
    @FindBy(xpath = "//input[@name= 'PASSWORD']")public static WebElement passwordForRegister;
    @FindBy(css = "#event56Registration")public static WebElement registerButton;



    public void signIn(){
        signInlink.click();
        userIdInputBar.sendKeys("prabet24@gmail.com");
        passwordInputBar.sendKeys("********");
        signInButton.click();
    }
    public void registerNewUser(){
        registerLink.click();
        firstNameforRegister.sendKeys("Lavie");
        lastNameforRegister.sendKeys("estunelutte");
        emailForRegister.sendKeys("prabet24@gmail.com");
        passwordForRegister.sendKeys("*******");
        registerButton.click();
    }

}