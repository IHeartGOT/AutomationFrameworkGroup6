package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class SportsMemCards extends CommonAPI {


    public SportsMemCards() {

        PageFactory.initElements (driver, this);
    }

    public void SportsMemPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Baseball Cards");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("64482");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}