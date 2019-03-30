package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class BusinessAndIndstrial extends CommonAPI {


    public BusinessAndIndstrial() {

        PageFactory.initElements (driver, this);
    }

    public void Business() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("office");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        s.selectByValue ("12576");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}

