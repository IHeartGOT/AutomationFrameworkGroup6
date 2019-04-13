package more;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.openqa.selenium.support.PageFactory.initElements;

public class More extends CommonAPI {

    public More() {

        initElements (driver, this);
    }

    public void MoreTab() {
        driver.findElement (By.className ("\"more-btn\"")).sendKeys ("More");
        Select s = new Select (driver.findElement (By.className ("Catagories")));
        s.selectByValue ("55");
        driver.findElement (By.id("article-category-nav")).click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "More Categories | myspace");

    }
}
