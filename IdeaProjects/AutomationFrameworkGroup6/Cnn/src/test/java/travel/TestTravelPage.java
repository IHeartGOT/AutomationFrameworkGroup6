package travel;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TravelPage;
import title.CnnHomePage;

public class TestTravelPage  extends CommonAPI {

    @Test
    public void Test36() {
        TravelPage travelPage = PageFactory.initElements(driver, TravelPage.class);
        travelPage.getDestinationLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test37() {
        TravelPage travelPage = PageFactory.initElements(driver, TravelPage.class);
        travelPage.getFoodAndDrink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test38() {
        TravelPage travelPage = PageFactory.initElements(driver, TravelPage.class);
        travelPage.getPlayLink();
        Assert.assertEquals(true, true);
    }
    @Test
    public void Test39() {
        TravelPage travelPage = PageFactory.initElements(driver, TravelPage.class);
        travelPage.getStayLink();
        Assert.assertEquals(true, true);
    }
}