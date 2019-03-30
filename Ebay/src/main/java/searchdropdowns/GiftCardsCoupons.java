package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class GiftCardsCoupons extends CommonAPI {


    public GiftCardsCoupons() {

        PageFactory.initElements (driver, this);
    }

    public void GiftCardsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("birthday");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("172008");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
