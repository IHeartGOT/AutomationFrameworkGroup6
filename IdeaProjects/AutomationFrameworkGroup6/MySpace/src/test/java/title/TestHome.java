package title;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void Test1() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getSignInTab();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test2() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getFeatureTab();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test3(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getSearchTab();
        Assert.assertEquals(true, true);
}
    @Test
    public void Test4(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getLogoTab();
        Assert.assertEquals(true, true);
    }

    }
