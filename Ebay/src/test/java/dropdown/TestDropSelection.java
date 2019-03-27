package dropdown;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.*;

public class TestDropSelection extends CommonAPI {

    @Test
    public void DropDown() throws InterruptedException{

        Select s  = new Select (driver.findElement(By.id("gh-cat")));
        s.selectByValue ("3252");
    }
}
