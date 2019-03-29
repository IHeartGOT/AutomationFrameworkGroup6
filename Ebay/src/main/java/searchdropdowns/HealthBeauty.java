package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HealthBeauty extends CommonAPI {


    public HealthBeauty() {

        PageFactory.initElements (driver, this);
    }

    public void HealthPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("makeup");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("26395");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
