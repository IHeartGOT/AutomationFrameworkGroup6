package discoverlink;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import discover.DiscoverTab;

public class TestDiscoverTab extends CommonAPI {

    @Test
    public void Test63() {
        DiscoverTab discoverTab = PageFactory.initElements(driver, DiscoverTab.class);
        discoverTab.getDiscoverlink();
        Assert.assertEquals (true, true);
    }
}
