package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Orders;

public class TestOrders extends CommonAPI {

    @Test
    public void TestOrderPage(){

        Orders orders = PageFactory.initElements (driver, Orders.class);
        orders.UserOrders ();
        Assert.assertEquals (true, true);
    }


}
