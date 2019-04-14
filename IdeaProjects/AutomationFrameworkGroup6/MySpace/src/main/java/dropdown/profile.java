package dropdown;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

public class profile extends CommonAPI {

    public profile () { PageFactory.initElements (driver, this); }

    public void profileTab() {
        driver.findElement (By.className ("\"more-btn\"")).sendKeys ("More");
        Select s = new Select (driver.findElement (By.className ("Catagories")));
        s.selectByValue ("0");
        driver.findElement (By.xpath("//a[@href='/articles/profiling']")).click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "More Categories | myspace");


    }


}
