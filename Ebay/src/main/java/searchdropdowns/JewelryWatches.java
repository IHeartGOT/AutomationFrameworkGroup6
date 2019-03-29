package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JewelryWatches extends CommonAPI {


    public JewelryWatches() {

        PageFactory.initElements (driver, this);
    }

    public void JewelryPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("rolex");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("281");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
