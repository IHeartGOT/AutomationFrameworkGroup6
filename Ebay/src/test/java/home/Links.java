package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Developer;
import pages.Fashion;
import pages.GiftsCards;
import pages.Registration;


public class Links extends CommonAPI {

    @Test
    public void TestHomeLinks(){
        String title = driver.getTitle();
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HomePageLinks ();

    }

    @Test
    public void TestRegister(){

        Registration registration= PageFactory.initElements (driver, Registration.class);
        registration.ResgistationPage ();
    }

    @Test
    public void BuyGiftCards(){
        GiftsCards giftsCards = PageFactory.initElements (driver, GiftsCards.class);
        giftsCards.GiftCardsPage ();
    }

    @Test
    public void TestWomenPage(){
        Fashion fashion = PageFactory.initElements (driver, Fashion.class);
        fashion.FashionPage ();
    }

    @Test
    public void TestWomenFashion(){
        Fashion fashion = PageFactory.initElements (driver, Fashion.class);
        fashion.FashionPageLink ();
    }

    @Test
    public void TestDeveloper() {
        Developer developer = PageFactory.initElements (driver, Developer.class);
        developer.DeveloperPage ();

    }
    @Test
    public void TestReturns(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.ReturnsPage ();
    }

    @Test
    public void TestCompanyInfoPage(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CompanyInfoPage ();
    }

    @Test
    public void TestnvestPage(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.Inversting ();
    }

    @Test
    public void TestNewsPage(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.News ();
    }

//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }
//
//    @Test
//    public void TestReturns(){
//        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
//        eHomePage.ReturnsPage ();
//    }

}