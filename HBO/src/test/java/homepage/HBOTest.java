package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HBOTest extends CommonAPI {

    @Test
    public void TestButton() {
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[1]/div[3]/div/a");
    }
    @Test
    public void TestNews(){
        driver.findElements(By.xpath("//*[@id=\"root\"]/main/section/div[3]/div/div[1]/div/h2"));
    }
    @Test
    public void TestVeep(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/section/div[5]/div/div[2]/div[2]/section/div/div/div/div[2]/div/div[1]/div/a/div"));
    }
    @Test
    public void TestHboFlims(){
        clickByXpath("//*[@id=\"root\"]/main/section/div[5]/div/div[2]/div[2]/section/div/div/div/div[4]/div/div[1]/div/p");
    }


    }
