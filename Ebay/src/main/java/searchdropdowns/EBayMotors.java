package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EBayMotors extends CommonAPI {


    public EBayMotors() {

        PageFactory.initElements (driver, this);
    }

    public void MotorPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("BMW");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("6000");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
