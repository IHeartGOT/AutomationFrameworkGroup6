package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class Music  extends CommonAPI {


    public Music() {

        PageFactory.initElements (driver, this);
    }

        public void MusicPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Nirvana");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11233");
        driver.findElement (By.id ("gh-btn")).click ();

    }
        public void MusicPage2() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Nirvana");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11233");
        driver.findElement (By.id ("gh-btn")).click ();

    }
        public void MusicPage3() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Nirvana");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11233");
        driver.findElement (By.id ("gh-btn")).click ();

    }

}
