package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EntertainmentMemo extends CommonAPI {


    public EntertainmentMemo() {

        PageFactory.initElements (driver, this);
    }

    public void EnterMemoPapge() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Movie Posters");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("45100");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
