package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

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



public WebElement AllDept(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return driver.findElement (alldept);}

public WebElement SearchBox(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return driver.findElement (search);}

public WebElement ShoppingCart(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return driver.findElement (cart);}

public WebElement Track(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return driver.findElement (tracking);}

public WebElement OrderNumber(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return driver.findElement (tracknumber);}

public WebElement EmailAddress(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return driver.findElement (email);}

public WebElement SubmitBttn(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return driver.findElement (submit);}




public void TrackOrders() {
    AllDept ().click ();
}
public void SearchBar() {
    SearchBox ().sendKeys ("plumbing", Keys.ENTER);
}
public void ShoppingCartPage() {
    ShoppingCart ().click ();
}
public void TrackPage() {
    Track ().click ();
    OrderNumber ().sendKeys ("W565477687");
    EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
    SubmitBttn ().click ();

}

}
