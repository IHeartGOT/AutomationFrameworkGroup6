package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class TicketsExperiences extends CommonAPI {


    public TicketsExperiences() {

        PageFactory.initElements (driver, this);
    }

    public void TicketsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Lady gaga");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("1305");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
