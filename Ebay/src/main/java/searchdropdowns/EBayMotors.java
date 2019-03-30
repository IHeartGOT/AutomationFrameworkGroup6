package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class EBayMotors extends CommonAPI {


    public EBayMotors() {

        PageFactory.initElements (driver, this);
    }

    public void MotorPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("BMW");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("6000");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
