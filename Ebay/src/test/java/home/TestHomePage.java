package home;

import home.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testsearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checksearchButton();
    }
    @Test
    public void testfindElectronics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkfindElectronics();
    }

    @Test
    public void testsearchPhone() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checksearchPhone();

    }

    @Test
    public void testfindDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkfindDeals();
    }

}