package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        return registration;
    }

    public WebElement FirstNameInput() {
        return firstname;

    }
    public WebElement LastNameInput() {
        return lastname;

    }
    public WebElement EmailInput() {
        return email;
    }
    public WebElement PasswordInput() {
        return password;
    }


    public void ResgistationPage(){

        RegistrationPage ().click ();
        FirstNameInput ().sendKeys ("prodip");
        LastNameInput ().sendKeys ("Bhowmik");
        EmailInput ().sendKeys ("ptbhowmik@gmail.com");
        PasswordInput ().sendKeys ("A12345b", Keys.ENTER);
    }
}
