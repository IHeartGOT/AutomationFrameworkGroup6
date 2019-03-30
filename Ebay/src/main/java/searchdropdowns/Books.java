package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Books extends CommonAPI {


    public Books() {

        PageFactory.initElements (driver, this);
    }

    public void BooksPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Bible");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        s.selectByValue ("267");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
