package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Travel extends CommonAPI {

    public Travel(){

        PageFactory.initElements (driver, this);
    }

    public void TravelPage(){
        driver.findElement (By.id ("gh-ac")).sendKeys ("luggage");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("3252");
        driver.findElement (By.id ("gh-btn")).click ();
    }

}
