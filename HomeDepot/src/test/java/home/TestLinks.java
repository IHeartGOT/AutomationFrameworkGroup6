package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLinks extends CommonAPI {

    @Test
    public void TestTruckandTools(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.TruckandTools ();
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
    public void TesCreditPage(){
        HomePageLinks homePageLinks = PageFactory.initElements (driver, HomePageLinks.class);
        homePageLinks.CreditPage ();
    }
}
