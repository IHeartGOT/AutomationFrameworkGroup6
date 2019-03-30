package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tabledata.TablePage;

public class TestHomePage extends CommonAPI {


    @Test
    public void TestTitle() {
        String title = driver.getTitle ();
        System.out.println ("Webpage Title: " + driver.getTitle ());
        Assert.assertEquals (title, "The Home Depot");
    }
    @Test
    public void TrackOrders() {

        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.TrackOrders ();
    }

    @Test
    public void TestSearchBar(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar ();
    }
    @Test
    public void TestShoppinfCart() {
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.ShoppingCartPage ();
    }
    @Test
    public void TestTrackPage() {
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.TrackPage ();
    }

    @Test
    public void TestStoreLocator(){
        StoreFinder storeFinder = PageFactory.initElements (driver, StoreFinder.class);
        storeFinder.StoreLocation ();
    }

}


