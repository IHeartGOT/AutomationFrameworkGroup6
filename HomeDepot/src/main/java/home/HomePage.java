package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends CommonAPI {


    By alldept = By.xpath ("//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[1]/a");
    By search = By.id ("headerSearch");
    By cart = By.id ("headerCart");
    By signinbutton = By.xpath ("//*[@id=\"authSignIn\"]/a/span[2]");
    By email = By.id ("email_id");
    By password = By.id ("password");


public WebElement AllDept(){

    return driver.findElement (alldept);


}

    public WebElement SearchBox(){

        return driver.findElement (search);


    }

    public WebElement ShoppingCart(){

        return driver.findElement (cart);

    }
    public WebElement Signin(){

        return driver.findElement (signinbutton);

    }

    public WebElement EmailAddress(){

        return driver.findElement (email);


    }
    public WebElement Password(){

        return driver.findElement (password);


    }
}
