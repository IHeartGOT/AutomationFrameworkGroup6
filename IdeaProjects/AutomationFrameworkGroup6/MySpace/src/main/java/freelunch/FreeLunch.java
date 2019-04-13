package freelunch;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FreeLunch extends CommonAPI {

    public FreeLunch() {
        PageFactory.initElements(driver, this);
    }
        public void FreeLunch() {
            driver.findElement (By.className ("gradient")).sendKeys ("FreeLunch");
            Select s = new Select (driver.findElement (By.className("gradient")));
            s.selectByValue ("61");
            driver.findElement (By.className ("connect-count")).click ();
    }

    }


