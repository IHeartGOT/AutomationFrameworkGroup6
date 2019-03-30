package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

public class AllCategories extends CommonAPI {


    public AllCategories() {

        PageFactory.initElements (driver, this);
    }

    public void AllCatPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Honey");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("0");
        driver.findElement (By.id ("gh-btn")).click ();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Honey | eBay");



    }
}
