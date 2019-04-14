package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tabledata.TablePage;

public class TestHomePage extends CommonAPI {


    @Test
    public void TestTrackPage3() {
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.TrackPage3 ();
    }

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
    public void TrackOrders2() {
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.TrackOrders2 ();
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
    @Test
    public void TestShoppinfCart2() {
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.ShoppingCartPage2 ();
    }
    @Test
    public void TestTrackPage2() {
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.TrackPage2 ();
    }
    @Test
    public void TrackOrders3() {
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.TrackOrders3 ();
    }
    @Test
    public void TestShoppinfCart3() {
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.ShoppingCartPage3 ();
    }
    @Test
    public void TestSearchBar2(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar2 ();
    }
    @Test
    public void TestSearchBar3(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar3 ();
    }
    @Test
    public void TestSearchBar4(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar4 ();
    }
    @Test
    public void TestSearchBar5(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar5 ();
    }
    @Test
    public void TestSearchBar6(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar6 ();
    }
    @Test
    public void TestSearchBar7(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar7 ();
    }
    @Test
    public void TestSearchBar8(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar8 ();
    }
    @Test
    public void TestSearchBar9(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar9 ();
    }
    @Test
    public void TestSearchBar10(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar10 ();
    }
    @Test
    public void TestSearchBar11(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar11 ();
    }
    @Test
    public void TestSearchBar12(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar12 ();
    }
    @Test
    public void TestSearchBar13(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar13 ();
    }
    @Test
    public void TestSearchBar14(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar14 ();
    }
    @Test
    public void TestSearchBar15(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar15 ();
    }
    @Test
    public void TestSearchBar16(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar16 ();
    }
    @Test
    public void TestSearchBar17(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar17 ();
    }
    @Test
    public void TestSearchBar18(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar18 ();
    }
    @Test
    public void TestSearchBar19(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar19 ();
    }
    @Test
    public void TestSearchBar20(){
        HomePage homePage = PageFactory.initElements (driver, HomePage.class);
        homePage.SearchBar20 ();
    }
}


