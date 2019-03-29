package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomeAndGarden extends CommonAPI {


    public HomeAndGarden() {

        PageFactory.initElements (driver, this);
    }

    public void GardenPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("plant seed");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11700");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
