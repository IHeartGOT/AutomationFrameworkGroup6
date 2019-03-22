package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Title extends CommonAPI {

    @Test
    public void Test1(){
        String title = driver.getTitle();
        System.out.println("Webpage Title: " + driver.getTitle ());
        Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

    }
}
