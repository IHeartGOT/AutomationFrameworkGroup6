package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ToysHobbies extends CommonAPI {


    public ToysHobbies() {

        PageFactory.initElements (driver, this);
    }

    public void ToysPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("office");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("12576");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
