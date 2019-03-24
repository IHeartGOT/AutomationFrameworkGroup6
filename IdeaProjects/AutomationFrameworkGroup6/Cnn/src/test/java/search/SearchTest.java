package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test
    public void search () {
        driver.findElement(By.id("search-input-field")).sendKeys("news", Keys.ENTER);

    }
    @Test
    public void typeOncss() {
        driver.findElement(By.cssSelector("#search-input-field")).sendKeys("news", Keys.ENTER);

    }



}