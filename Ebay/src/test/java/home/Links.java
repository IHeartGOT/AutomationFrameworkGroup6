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
    public void TestInvestPage(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.InvestorsPage ();
    }

    @Test
    public void TestNewsPage(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.NewsPage ();
    }

    @Test
    public void TestClassifieds(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.ClassifiedsPage ();
    }

    @Test
    public void TestMoneyBack(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.MoneyBackPage ();
    }

    @Test
    public void TestStoresPage() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StorePage ();
    }

    @Test
    public void TestStubHub(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StubHubPage ();
    }

    @Test
    public void TestCareerPage(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CareerPage ();
    }

    @Test
    public void TestPolicies(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.PoliciesPage ();
    }

    @Test
    public void TestContacts(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.ContactPage ();
    }

    @Test
    public void TestAnnouncement(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.AnnouncementPage ();
    }

    @Test
    public void TestSellPage(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.SellPage ();
    }

    @Test
    public void TestCommunity(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.ContactPage ();
    }

    @Test
    public void TestHomePageLink2(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HomePageLinks2 ();
    }

    @Test
    public void TestHomePageLink3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HomePageLinks3 ();
    }

    @Test
    public void TestSignin() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.SigninPage ();
    }

}

