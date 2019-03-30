package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Stamps extends CommonAPI {


    public Stamps() {

        PageFactory.initElements (driver, this);
    }

    public void StampsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("USA");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("260");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
