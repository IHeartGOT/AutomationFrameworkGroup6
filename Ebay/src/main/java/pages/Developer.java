package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Developer extends CommonAPI {

    public Developer(){ PageFactory.initElements (driver, this);

    }

    @FindBy (linkText ="Developers")
    WebElement develop;

    @FindBy (id ="sm-15536448431313328-1")
    WebElement signin;

    public WebElement Developer(){return develop;}

    public WebElement getBuyApi() {return signin;}


    public void DeveloperPage(){
        Developer ().click ();
        getBuyApi ().click ();

    }
}
