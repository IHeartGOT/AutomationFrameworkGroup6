package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TicketsExperiences extends CommonAPI {


    public TicketsExperiences() {

        PageFactory.initElements (driver, this);
    }

    public void TicketsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Lady gaga");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("1305");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
