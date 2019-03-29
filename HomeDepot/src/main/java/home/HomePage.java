package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    public HomePage(){

        PageFactory.initElements (driver, this);
    }



    By alldept = By.xpath ("//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[1]/a");
    By search = By.id ("headerSearch");
    By cart = By.id ("headerCart");
    By tracking = By.id ("headerOrderStatus");
    By tracknumber = By.xpath ("//input[@name='order']");
    By email = By.xpath ("//input[@name='email']");
    By submit = By.xpath ("//*[@id=\"orders_root\"]/div/div[2]/div[1]/div[2]/form/div[3]/button/span");



public WebElement AllDept(){ return driver.findElement (alldept);}

public WebElement SearchBox(){ return driver.findElement (search);}

public WebElement ShoppingCart(){return driver.findElement (cart);}

public WebElement Track(){return driver.findElement (tracking);}

public WebElement OrderNumber(){return driver.findElement (tracknumber);}

public WebElement EmailAddress(){ return driver.findElement (email);}

public WebElement SubmitBttn(){return driver.findElement (submit);}


public void TrackOrders(){
    AllDept ().click ();
    SearchBox ().sendKeys ("plumbing", Keys.ENTER);
    ShoppingCart ().click ();
    Track ().click ();
    OrderNumber ().sendKeys ("W565477687");
    EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
    SubmitBttn ().click ();

}

}
