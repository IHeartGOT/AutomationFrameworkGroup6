package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLinks extends CommonAPI {

    @Test
    public void TestTruckandTools2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.TruckandToolsPage2 ();
    }

    @Test
    public void TestPro2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.FortheProPage2 ();
    }

    @Test
    public void TestGiftsCards2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.GiftsCardsPage2 ();
    }

    @Test
    public void TesHelp2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.HelpPage2 ();
    }

    @Test
    public void TestShipping2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.ShippingPage2 ();
    }

    @Test
    public void TestCreditPage2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.CreditPage2 ();

    }

    @Test
    public void TestCorporate2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.CorporatePage2 ();
    }

    @Test
    public void TestFavorite2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.FavoritePage2 ();
    }

    @Test
    public void TestNews2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.NewsPage2 ();
    }

    @Test
    public void TestProtect2(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.ProtectionPage ();
    }

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
