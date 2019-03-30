package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class ClothingShoesAcc extends CommonAPI {


    public ClothingShoesAcc() {

        PageFactory.initElements (driver, this);
    }

    public void ShoesPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("nike");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11450");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
