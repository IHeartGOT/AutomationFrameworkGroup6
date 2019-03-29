package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SportingGoods extends CommonAPI {


    public SportingGoods() {

        PageFactory.initElements (driver, this);
    }

    public void SportingPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("hunting");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("888");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
