package dropdown;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;
import java.util.*;

public class DropSelection extends CommonAPI {

    @Test
    public void DropDown() throws InterruptedException{
        WebElement select = driver.findElement(By.id("gh-cat"));
        List<WebElement> options = select.findElements(By.tagName("Travel"));

        for (WebElement option : options) {
            if("Travel".equals(option.getText()))
                option.click(); }
        clickByXpath ("//*[@id=\"gh-btn\"]");


    }
}
