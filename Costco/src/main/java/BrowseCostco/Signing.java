package BrowseCostco;
import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Signing extends CommonAPI{
    @FindBy(xpath = "#LogonForm > fieldset > div:nth-child(5) > input")public static WebElement signInlink;
    @FindBy(css = "#LogonForm > fieldset > div:nth-child(1) > span")public static WebElement signInButton;
    @FindBy(css ="#logonId")public static WebElement userIdInputBar;
    @FindBy(css = "#logonPassword")public static WebElement passwordInputBar;
    @FindBy(xpath = "//a[contains (text(), 'register')]") public static WebElement registerLink;
    @FindBy(css = "#firstname")public static WebElement firstNameforRegister;
    @FindBy(css = "#lastname")public static WebElement lastNameforRegister;
    @FindBy(css = "#email")public static WebElement emailForRegister;
    @FindBy(xpath = "//input[@name= 'PASSWORD']")public static WebElement passwordForRegister;
    @FindBy(css = "#ppaFormSbtBtn")public static WebElement registerButton;



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


