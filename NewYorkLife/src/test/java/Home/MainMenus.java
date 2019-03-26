package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class MainMenus extends CommonAPI {

    @Test 
    public void test1() { 
        driver.findElement(By.id("header_sign_in")).click(); 
        driver.findElement(By.id("logonId")).sendKeys("prabet@NYL.com"); 
        driver.findElement(By.className("error")).sendKeys("bad email"); 
        driver.findElement(By.name("logonPassword")).sendKeys("123456");
         driver.findElement(By.linkText("Forgot Password?")).click(); 
    } 
}
