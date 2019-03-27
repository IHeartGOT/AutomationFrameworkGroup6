package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoinsAndPaperMoney extends CommonAPI {


    public CoinsAndPaperMoney() {

        PageFactory.initElements (driver, this);
    }

    public void CoinsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("world coins");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11116");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
