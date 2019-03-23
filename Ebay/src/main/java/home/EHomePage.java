package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EHomePage extends CommonAPI {


    By motor = By.xpath ("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a");
    By MyEbay = By.xpath ("//*[@id=\"gh-eb-My\"]/div/a[1]");
    By shopping = By.id ("gh-cart-i");
    By signin = By.xpath ("//*[@id=\"gh-ug\"]/a");
    By username = By.id ("userid");
    By password = By.id ("pass");
    By signButton = By.id ("sgnBt");

    public WebElement MotorLink() {

        return driver.findElement (motor);
    }

    public WebElement LoginLink() {
        return driver.findElement (MyEbay);

    }

    public WebElement ShoppingLink() {
        return driver.findElement (shopping);

    }

    public WebElement SignInLink() {
        return driver.findElement (signin);

    }

    public WebElement UserName() {
        return driver.findElement (username);

    }

    public WebElement Password() {
        return driver.findElement (password);

    }

    public WebElement SignButton() {
        return driver.findElement (signButton);

    }

}