package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Art extends CommonAPI {


    public Art() {

        PageFactory.initElements (driver, this);
    }

    public void ArtPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Picasso");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("550");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
