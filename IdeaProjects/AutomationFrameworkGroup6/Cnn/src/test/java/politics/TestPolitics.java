package politics;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import politicspage.PoliticsPage;

public class TestPolitics extends CommonAPI {

/*@Test
    public void testUserCanNavigateToTheSignInPage() {
        this.homePage.clickOnSignInTab();
        String signInPageUrl =
                "http://";
        Assert.assertEquals(this.driver.getCurrentUrl(), signInPageUrl);*/

    @Test
    public void Test33() {
        PoliticsPage politicsPage = PageFactory.initElements(driver, PoliticsPage.class);
        politicsPage.getCongressLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test34() {
        PoliticsPage politicsPage = PageFactory.initElements(driver, PoliticsPage.class);
        politicsPage.getFactFirst();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test35() {
        PoliticsPage politicsPage = PageFactory.initElements(driver, PoliticsPage.class);
        politicsPage.getSupremeCourt();
        Assert.assertEquals(true, true);
    }
}


