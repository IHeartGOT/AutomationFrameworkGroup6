package title;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void Test69() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getSignInTab();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test70() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getFeatureTab();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test71() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getSearchTab();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test72() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getLogoTab();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test73() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getPeopleTab();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test74() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getVideoLink();
        Assert.assertEquals(true, true);

    }
    @Test
    public void Test75() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getHelpButton();
        Assert.assertEquals(true, true);
    }
    @Test

    public void Test76() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getSiteInfoLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test77() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getPrivacyLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test78() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getTermsLink();
        Assert.assertEquals(true, true);
    }
    @Test

    public void Test79() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getNewsLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test80() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getArtistOfTheDay();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test81() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getQandALink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test82() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getEveryBodyLovesAListTab();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test83() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getTop8Link();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test84() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getPortraitsTab();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test85() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getMoreButtonTab();
        Assert.assertEquals(true, true);
    }
}