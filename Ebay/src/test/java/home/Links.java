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
    public void TestCareerPage5() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CareerPage5();
    }
    @Test
    public void TestInvestPage2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.InvestorsPage2 ();
    }
    @Test
    public void TestHelpPage() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HelpPage ();
    }
    @Test
    public void TestBusiness() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.BusinessPage ();
    }
    @Test
    public void TestStoresPage3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StorePage3 ();
    }
    @Test
    public void TestInvestPage3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.InvestorsPage3 ();
    }
    @Test
    public void TestKnowledge() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.KnowledgePage ();
    }
    @Test
    public void TestHomeLinks() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HomePageLinks ();
    }

    @Test
    public void TestRegister() {
        Registration registration = PageFactory.initElements (driver, Registration.class);
        registration.ResgistationPage ();
    }

    @Test
    public void BuyGiftCards() {
        GiftsCards giftsCards = PageFactory.initElements (driver, GiftsCards.class);
        giftsCards.GiftCardsPage ();
    }

    @Test
    public void TestWomenPage() {
        Fashion fashion = PageFactory.initElements (driver, Fashion.class);
        fashion.FashionPage ();
    }
    @Test
    public void TestInvestPage4() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.InvestorsPage4 ();
    }

    @Test
    public void TestWomenFashion() {
        Fashion fashion = PageFactory.initElements (driver, Fashion.class);
        fashion.FashionPageLink ();
    }
    @Test
    public void TestStoresPage2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StorePage2 ();
    }
    @Test
    public void TestDeveloper() {
        Developer developer = PageFactory.initElements (driver, Developer.class);
        developer.DeveloperPage ();
    }

    @Test
    public void TestReturns() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.ReturnsPage ();
    }

    @Test
    public void TestCompanyInfoPage() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CompanyInfoPage ();
    }
    @Test
    public void TestInvestPage5() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.InvestorsPage5 ();
    }

    @Test
    public void TestInvestPage() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.InvestorsPage ();
    }

    @Test
    public void TestNewsPage() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.NewsPage ();
    }

    @Test
    public void TestClassifieds() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.ClassifiedsPage ();
    }
    @Test
    public void TestCareerPage4() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CareerPage4 ();
    }

    @Test
    public void TestMoneyBack() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.MoneyBackPage ();
    }
    @Test
    public void TestNewsPage2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.NewsPage2 ();
    }

    @Test
    public void TestStoresPage() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StorePage ();
    }
    @Test
    public void TestMoneyBack2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.MoneyBackPage2 ();
    }
    @Test
    public void TestStubHub() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StubHubPage ();
    }
    @Test
    public void TestNewsPage3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.NewsPage3 ();
    }

    @Test
    public void TestCareerPage() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CareerPage ();
    }

    @Test
    public void TestPolicies() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.PoliciesPage ();
    }
    @Test
    public void BuyGiftCards2() {
        GiftsCards giftsCards = PageFactory.initElements (driver, GiftsCards.class);
        giftsCards.GiftCardsPage2 ();
    }
    @Test
    public void TestMoneyBack3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.MoneyBackPage3 ();
    }
    @Test
    public void TestPolicies2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.PoliciesPage2 ();
    }

    @Test
    public void TestContacts() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.ContactPage ();
    }
    @Test
    public void TestCareerPage3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CareerPage3 ();
    }

    @Test
    public void TestAnnouncement() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.AnnouncementPage ();
    }

    @Test
    public void TestNewsPage4() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.NewsPage4 ();
    }
    @Test
    public void TestMoneyBack4() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.MoneyBackPage4 ();
    }
    @Test
    public void TestSellPage() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.SellPage2 ();
    }
    @Test
    public void TestPolicies3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.PoliciesPage3 ();
    }

    @Test
    public void TestCommunity() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CommunityPage ();
    }

    @Test
    public void TestStoresPage4() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StorePage4 ();
    }

    @Test
    public void TestHomePageLink2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HomePageLinks2 ();
    }
    @Test
    public void TestMoneyBack5() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.MoneyBackPage5 ();
    }

    @Test
    public void TestHomePageLink3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HomePageLinks3 ();
    }
    @Test
    public void TestPolicies4() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.PoliciesPage4 ();
    }
    @Test
    public void TestStoresPage5() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StorePage5 ();
    }
    @Test
    public void TestStubHub2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StubHubPage2 ();
    }

    @Test
    public void TestSignin() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.SigninPage ();
    }

    @Test
    public void TestCommunity2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CommunityPage2 ();
    }
    @Test
    public void TestStubHub3() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.StubHubPage3 ();
    }
    @Test
    public void TestNewsPage5() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.NewsPage5 ();
    }
    @Test
    public void TestPolicies5() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.PoliciesPage5 ();
    }
    @Test
    public void TestCareerPage2() {
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.CareerPage2 ();
    }
}

