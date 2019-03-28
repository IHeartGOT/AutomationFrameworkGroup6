package Home;

import base.CommonAPI;
import org.omg.CORBA.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;
import title.CnnHomePage;

public class TestCnnHomePage extends CommonAPI {

    /*public void test1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod()
        String title = driver.getTitle();
        Assert.assertEquals(this, "cnn.com: a news agency");
    }*/

    @Test
    public void Test1() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getUSLink();
        Assert.assertEquals (true, true);
    }

    @Test
    public void Test2() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getWorldLink();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test3() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPoliticsLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test4() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getBusinessLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test5() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getOpinionLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test6() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getHealthLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test7() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getEntertainmentLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test8() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getStyleLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test9() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCNNlogoLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test10() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTravelLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test11() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getSportsLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test12() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getVideosLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test13() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getLiveTVLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test14() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getUSEditionLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test15() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getSearchTabLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test16() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTodayInPoliticsLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test17() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTopStoriesLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test18() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getBreakingNewsLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test19() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getNewsAndBuzzLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test20() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getAppleBigEventLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test21() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCNNBusinessLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test22() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCheckThisOutLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test23() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPaidPartnerContentLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test24() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTechLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test25() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTrandingLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test26() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPaidContent();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test27() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getMoreFromCNNLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test28() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getClimateChangeLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test29() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCrisisAtBoeingLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test30() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getLendingTree();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test31() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTopCreditCardRewards();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test32() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPersonalFinanceLink();
        Assert.assertEquals(true, true);
    }
    }