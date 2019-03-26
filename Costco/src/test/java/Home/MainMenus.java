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
    public void test6() { 
        driver.findElement(By.linkText("Sign In / Register")).click(); 
        driver.findElement(By.id("logonId")).sendKeys("prabet@costco.com"); 
        driver.findElement(By.className("error")).sendKeys("bad email"); 
        driver.findElement(By.name("logonPassword")).sendKeys("123456"); 
        driver.findElement(By.linkText("Forgot Password?")).click(); 
        driver.findElement(By.cssSelector("#logonId")).sendKeys("prabet@Npeople.com"); 
}
}