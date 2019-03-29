package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PetSupplies extends CommonAPI {


    public PetSupplies() {

        PageFactory.initElements (driver, this);
    }

    public void PetsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("pedigree");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("1281");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
