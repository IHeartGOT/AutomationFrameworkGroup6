package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GiftCardsCoupons extends CommonAPI {


    public GiftCardsCoupons() {

        PageFactory.initElements (driver, this);
    }

    public void GiftCardsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("office");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("12576");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
