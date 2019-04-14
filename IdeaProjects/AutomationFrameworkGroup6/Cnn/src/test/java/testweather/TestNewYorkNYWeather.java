package testweather;

import Weather.NewYorkNY;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import title.CnnHomePage;

public class TestNewYorkNYWeather extends CommonAPI {

    @Test
    public void Test88() {
        NewYorkNY newYorkNY = PageFactory.initElements(driver, NewYorkNY.class);
        newYorkNY.getNewYorkNYWeatherTab();
        Assert.assertEquals(true, true);
    }

    @Test
    public void Test89() {
        NewYorkNY newYorkNY = PageFactory.initElements(driver, NewYorkNY.class);
        newYorkNY.getFahrenhite();
        Assert.assertEquals(true, true);
    }
}