package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PotteryGlass extends CommonAPI {


    public PotteryGlass() {

        PageFactory.initElements (driver, this);
    }

    public void PotteryPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Rookwood");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("870");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
