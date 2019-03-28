package title;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage extends CommonAPI {

    public signinpage(){

        PageFactory.initElements (driver, this);
    }

    @FindBy (id = "login.email")
    WebElement Email;

    @FindBy (css = "#login\\2e password")
    WebElement Password;

    @FindBy (id = "//*[@id=\"signInForm\"]/footer/button")
    WebElement signButton;


    public WebElement EmailLink() {

        return EmailLink();
    }

    public WebElement password() {
        return password();

    }

    public WebElement SignInLink() {
        return signButton;

    }

    public void HomePageLinks(){
        driver.navigate ().back ();
        EmailLink().sendKeys ("ujjalkarmokar@gmail.com");
        password ().sendKeys ("Benaiah12");;


    }

}

