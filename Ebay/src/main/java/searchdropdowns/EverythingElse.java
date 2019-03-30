package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class EverythingElse extends CommonAPI {


    public EverythingElse() {

        PageFactory.initElements (driver, this);
    }

    public void EverythingElsePage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Weird stuff");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("99");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
