package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

public class Fashion extends CommonAPI {


    public Fashion() {

        PageFactory.initElements (driver, this);
    }

    public void FashionPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("gucci");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("281");
        driver.findElement (By.id ("gh-btn")).click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "gucci in Jewelry and Watches | eBay");
    }
}
