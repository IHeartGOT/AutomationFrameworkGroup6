package TestBrowseNYL;

import BrowseNYL.HomepageUtilities;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class HomepageUtilitiesTest extends CommonAPI {

    HomepageUtilities HomepageUtilitiesTest;
    String url = "https://www.NewYorkLife.com/";

    @BeforeClass
    public void initElements() {
        driver.get(url);
        HomepageUtilitiesTest = PageFactory.initElements(driver,HomepageUtilities.class);
    }

    @Test
    public void homeButtonTest() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void savedUtilityTest() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void motorsOption() {
        HomepageUtilitiesTest.homeButton();
    }


    @Test
    public void fashionUtility() {
        HomepageUtilitiesTest.homeButton();
    }


    @Test
    public void electronicsUtility() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void collectiblesandart() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void homeAndGarden() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void sportingGoodsUtility() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void toysUtility() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void businessAndIndustrialUtility() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void musicUtility() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void dealsUtility() {
        HomepageUtilitiesTest.homeButton();
    }

    @Test
    public void under10Utility() {
        HomepageUtilitiesTest.homeButton();
    }


    //@Test
    //public void test10Test() {
    //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object().getClass().getEnclosingMethod().getName()));

}



