package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class PetSupplies extends CommonAPI {


    public PetSupplies() {

        PageFactory.initElements (driver, this);
    }

        public void PetsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("pedigree");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("1281");
        driver.findElement (By.id ("gh-btn")).click ();

    }
        public void PetsPage2() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("pedigree");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("1281");
        driver.findElement (By.id ("gh-btn")).click ();

    }
        public void PetsPage3() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("pedigree");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("1281");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
