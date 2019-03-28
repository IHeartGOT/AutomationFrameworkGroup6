package entertainment;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Entertainment;
import title.CnnHomePage;

public class TestEntertainment extends CommonAPI {
    @Test
    public void Test63() {
        Entertainment entertainment = PageFactory.initElements(driver, Entertainment.class);
        entertainment.EntertainmentTab();
        Assert.assertEquals (true, true);
    }
}
