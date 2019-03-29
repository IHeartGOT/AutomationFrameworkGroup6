package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DollsBears extends CommonAPI {


    public DollsBears() {

        PageFactory.initElements (driver, this);
    }

    public void DollsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("teddy");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("237");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
