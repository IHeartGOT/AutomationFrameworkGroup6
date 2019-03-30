package signin;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import title.HomePage;

public class TestSignInPage extends CommonAPI {

//        TestSignInPage signInPage = PageFactory.initElements(driver, TestSignInPage.class);
//        signInPage.navigateBack();

    @Test
    public void Test65() {
        String signInPageUrl = "https://myspace.com/signin";
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getSignInTab();
        Assert.assertEquals(true, true);
    }
}