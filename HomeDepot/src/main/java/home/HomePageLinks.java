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

    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Help')]")
    WebElement help;

    @FindBy(linkText = "Shipping & Delivery")
    WebElement sh;

    @FindBy(linkText = "Digital Newsroom")
    WebElement news;

    @FindBy(linkText ="Favorites")
    WebElement favs;

    @FindBy(linkText = "Corporate Information")
    WebElement corporate;

    @FindBy(linkText = "Protection Plans")
    WebElement protect;

    public WebElement getProtect(){return protect;}

    public WebElement getCorporate(){return corporate;}

    public WebElement getFavs(){return favs;}

    public WebElement getNews(){return news;}

    public WebElement getSh(){return sh;}

    public WebElement getHelp() { return help;}

    public WebElement Truckandtool(){ return truckntool;}

    public WebElement ForthePro1(){ return  forthepro;}

    public WebElement GiftCards(){return gc;}

    public WebElement CreditServ(){return cs;}


    public void ProtectionPage(){
        getProtect ().click ();
    }

    public void FavoritePage(){
        getFavs ().click ();
    }

    public void CorporatePage(){
        getCorporate ().click ();
    }


    public void NewsPage(){
        getNews ().click ();
    }

    public void ShippingPage(){
        getSh ().click ();
    }

    public void HelpPage(){
        getHelp ().click ();
    }

    public void TruckandToolsPage(){
        Truckandtool ().click ();
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
