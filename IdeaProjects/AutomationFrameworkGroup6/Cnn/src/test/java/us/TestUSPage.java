package testpages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uspage.USPage;

public class TestUSPage extends CommonAPI {


    @Test
    public void Test41() {
        USPage usPage = PageFactory.initElements(driver, USPage.class);
        usPage.getCrimeJusticelink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test42() {
        USPage usPage = PageFactory.initElements(driver, USPage.class);
        usPage.getEnergyAndEnvironmentLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test43() {
        USPage usPage = PageFactory.initElements(driver, USPage.class);
        usPage.getExtremeWeather();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test44() {
        USPage usPage = PageFactory.initElements(driver, USPage.class);
        usPage.getSpaceAndScienceLink();
        Assert.assertEquals(true, true);
    }
}