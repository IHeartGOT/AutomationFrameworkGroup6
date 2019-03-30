package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLinks extends CommonAPI {

    @Test
    public void TestTruckandTools(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.TruckandToolsPage ();
    }

    @Test
    public void TestPro(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.FortheProPage ();
    }

    @Test
    public void TestGiftsCards(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.GiftsCardsPage ();
    }

    @Test
    public void TesHelp(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.HelpPage ();
    }

    @Test
    public void TestShipping(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.ShippingPage ();
    }

    @Test
    public void TestCreditPage(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.CreditPage ();

    }

    @Test
    public void TestCorporate(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.CorporatePage ();
    }

    @Test
    public void TestFavorite(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.FavoritePage ();
    }

    @Test
    public void TestNews(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.NewsPage ();
    }

    @Test
    public void TestProtect(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.ProtectionPage ();
    }
}
