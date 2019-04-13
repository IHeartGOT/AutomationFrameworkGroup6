package Home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import home.CnnHomePage;

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

    }

    @Test
    public void Test2() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getWorldLink();

    }

    @Test
    public void Test3() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPoliticsLink();
    }

    @Test
    public void Test4() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getBusinessLink();
    }

    @Test
    public void Test5() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getOpinionLink();

    }
    @Test
    public void Test6() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getHealthLink();

    }

    @Test
    public void Test8() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getStyleLink();

    }

    @Test
    public void Test9() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCNNlogoLink();

    }

    @Test
    public void Test11() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getSportsLink();

    }

    @Test
    public void Test12() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getVideosLink();

    }

    @Test
    public void Test13() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getLiveTVLink();

    }

    @Test
    public void Test14() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getUSEditionLink();

    }

    @Test
    public void Test15() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getSearchTabLink();

    }

    @Test
    public void Test16() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTodayInPoliticsLink();

    }

    @Test
    public void Test17() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTopStoriesLink();

    }

    @Test
    public void Test18() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getBreakingNewsLink();

    }

    @Test
    public void Test19() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getNewsAndBuzzLink();

    }

    @Test
    public void Test20() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getAppleBigEventLink();

    }

    @Test
    public void Test21() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCNNBusinessLink();

    }

    @Test
    public void Test22() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCheckThisOutLink();

    }

    @Test
    public void Test23() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPaidPartnerContentLink();

    }

    @Test
    public void Test24() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTechLink();

    }

    @Test
    public void Test25() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTrandingLink();

    }

    @Test
    public void Test26() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPaidContent();

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

    }

    @Test
    public void Test29() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCrisisAtBoeingLink();

    }

    @Test
    public void Test30() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getLendingTree();

    }

    @Test
    public void Test31() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTopCreditCardRewards();

    }

    @Test
    public void Test32() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPersonalFinanceLink();

    }

    @Test
    public void Test33() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getInCaseYouMissedIt();
    }

    @Test
    public void Test34() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getWeatherIcon();
    }

    @Test
    public void Test35() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTermOfUseTab();
    }

    @Test
    public void Test36() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getPrivacyPolicyTab();
    }

    @Test
    public void Test37() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getAddChoicesTab();
    }

    @Test
    public void Test38() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getAboutUsTab();
    }

    @Test
    public void Test39() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCNNStudioTours();
    }

    @Test
    public void Test40() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCnnStoreTab();
    }

    @Test
    public void Test41() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getNewsLetterTab();
    }

    @Test
    public void Test42() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getTranScriptTab();
    }

    @Test
    public void Test43() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getLicenseFootageTab();
    }
    @Test
    public void Test44() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.getCnnNewsSourceTab();
    }
}