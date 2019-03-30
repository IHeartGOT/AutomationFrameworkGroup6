package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class Registration extends CommonAPI{

    public Registration(){

        PageFactory.initElements (driver, this);

    }

    @FindBy (css = "#gh-ug-flex > a")
    WebElement registration;

    @FindBy (id= "firstname")
    WebElement firstname;

    @FindBy (id= "lastname")
    WebElement lastname;

    @FindBy (id= "email")
    WebElement email;

    @FindBy (id= "PASSWORD")
    WebElement password;



    public WebElement RegistrationPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return registration;}

    public WebElement FirstNameInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return firstname;}

    public WebElement LastNameInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return lastname;}

        public WebElement EmailInput() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return email;
    }
    public WebElement PasswordInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return password;}


    public void ResgistationPage(){

        RegistrationPage ().click ();
        String title = driver.getTitle ();
        FirstNameInput ().sendKeys ("prodip");
        LastNameInput ().sendKeys ("Bhowmik");
        EmailInput ().sendKeys ("ptbhowmik@gmail.com");
        PasswordInput ().sendKeys ("A12345b", Keys.ENTER);
        Assert.assertEquals (title, "Sign in or Register | eBay");
    }


}
