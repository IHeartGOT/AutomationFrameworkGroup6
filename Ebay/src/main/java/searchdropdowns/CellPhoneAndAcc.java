package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class CellPhoneAndAcc extends CommonAPI {


    public CellPhoneAndAcc() {

        PageFactory.initElements (driver, this);
    }

    public void CellPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("iPhone");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("15032");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
