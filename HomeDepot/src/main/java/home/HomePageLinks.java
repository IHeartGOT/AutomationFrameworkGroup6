package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

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

    public WebElement getProtect(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return protect;}

    public WebElement getCorporate(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return corporate;}

    public WebElement getFavs(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return favs;}

    public WebElement getNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return news;}

    public WebElement getSh(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return sh;}

    public WebElement getHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return help;}

    public WebElement Truckandtool(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return truckntool;}

    public WebElement ForthePro1(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return  forthepro;}

    public WebElement GiftCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return gc;}

    public WebElement CreditServ(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return cs;}


    public void ProtectionPage(){
        getProtect ().click ();
    }

    public void FavoritePage2(){
        getFavs ().click ();
    }

    public void CorporatePage2(){
        getCorporate ().click ();
    }

    public void NewsPage2(){
        getNews ().click ();
    }

    public void ShippingPage2(){
        getSh ().click ();
    }

    public void HelpPage2(){
        getHelp ().click ();
    }

    public void TruckandToolsPage2(){
        Truckandtool ().click ();
    }

    public void FortheProPage2(){
        ForthePro1 ().click ();
    }

    public void  GiftsCardsPage2(){
        GiftCards ().click ();
    }

    public void CreditPage2(){
        CreditServ ().click ();
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
