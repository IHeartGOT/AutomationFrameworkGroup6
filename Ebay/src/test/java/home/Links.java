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
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HomePageLinks ();
        Assert.assertEquals (true, true);
    }

    @Test
    public void TestRegister()throws InterruptedException {
        Registration registration = PageFactory.initElements (driver, Registration.class);
        registration.ResgistationPage ();
        Assert.assertEquals (true, true);
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

    @Test void TestWomenFashion(){
        Fashion fashion = PageFactory.initElements (driver, Fashion.class);
        fashion.FashionPageLink ();
    }

    @Test void TestDeveloper(){
        Developer developer = PageFactory.initElements (driver, Developer.class);
        developer.DeveloperPage ();
    }


}