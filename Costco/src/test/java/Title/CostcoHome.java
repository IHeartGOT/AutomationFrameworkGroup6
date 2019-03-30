package Title;

import BrowseCostco.HomepageUtilities;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CostcoHome extends CommonAPI {


    @Test
    public void test(){
// 2 lines code to run extend report that has to be place in
        TestLogger.log(getClass().getSimpleName() + " -> " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+" This is Title test");
        TestLogger.log("Costco |Title Test");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Welcome to Costco Wholesale");
    }


}
