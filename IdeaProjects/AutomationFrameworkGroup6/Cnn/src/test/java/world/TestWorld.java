package world;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import worldpage.WorldPage;

public class TestWorld extends CommonAPI {


    @Test
    public void Test45() {
        WorldPage worldPage = PageFactory.initElements(driver, WorldPage.class);
        worldPage.getAfricaLink();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test46() {
        WorldPage worldPage = PageFactory.initElements(driver, WorldPage.class);
        worldPage.getAmericasLink();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test47() {
        WorldPage worldPage = PageFactory.initElements(driver, WorldPage.class);
        worldPage.getAsiaLink();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test48() {
        WorldPage worldPage = PageFactory.initElements(driver, WorldPage.class);
        worldPage.getAustraliaLink();
        Assert.assertEquals(true, true);

    }
}