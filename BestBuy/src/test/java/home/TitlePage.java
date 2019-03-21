package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitlePage extends CommonAPI {

    @Test
    public void test1() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Best Buy | Official Online Store | Shop Now & Save");
    }
}
