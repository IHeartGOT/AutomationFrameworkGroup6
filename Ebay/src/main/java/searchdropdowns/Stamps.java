package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Stamps extends CommonAPI {


    public Stamps() {

        PageFactory.initElements (driver, this);
    }

    public void StampsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("USA");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("260");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
