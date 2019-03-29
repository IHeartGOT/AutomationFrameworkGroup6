package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLinks extends CommonAPI {

    public HomePageLinks(){
        PageFactory.initElements (driver, this);
    }

    @FindBy (linkText = "Truck & Tool Rental")
    WebElement truckntool;

    @FindBy(linkText = "For the Pro")
    WebElement forthepro;

    @FindBy (linkText = "Gift Cards")
    WebElement gc;

    @FindBy (linkText = "Credit Services")
    WebElement cs;


    public WebElement Truckandtool(){ return truckntool;}

    public WebElement ForthePro1(){ return  forthepro;}

    public WebElement GiftCards(){return gc;}

    public WebElement CreditServ(){return cs;}




    public void TruckandTools(){
        truckntool.click ();
    }

    public void FortheProPage(){
        ForthePro1 ().click ();
    }

    public void  GiftsCardsPage(){
        GiftCards ().click ();
    }
    public void CreditPage(){
        CreditServ ().click ();
    }
}
