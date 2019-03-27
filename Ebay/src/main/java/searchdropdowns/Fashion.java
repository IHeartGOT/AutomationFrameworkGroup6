package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Fashion extends CommonAPI {


    public Fashion() {

        PageFactory.initElements (driver, this);
    }

    public void FashionPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("office");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("12576");
        driver.findElement (By.id ("gh-btn")).click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "Fashion | eBay");
    }
}
