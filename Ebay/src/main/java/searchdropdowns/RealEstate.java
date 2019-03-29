package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RealEstate extends CommonAPI {


    public RealEstate() {

        PageFactory.initElements (driver, this);
    }

    public void RealEstatePage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Timeshares");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("10542");
        driver.findElement (By.id ("gh-btn")).click ();

        }
        }
