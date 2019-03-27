package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Crafts extends CommonAPI {


    public Crafts() {

        PageFactory.initElements (driver, this);
    }

    public void CraftsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("sewing machine");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("14339");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
