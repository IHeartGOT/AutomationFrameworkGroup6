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



    public void TrackPage3() {
    Track ().click ();
    OrderNumber ().sendKeys ("W565477687");
    EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
    SubmitBttn ().click ();
    }

    public void ShoppingCartPage3() {
    ShoppingCart ().click ();
    }

    public void TrackOrders() {
    AllDept ().click ();
}
    public void SearchBar() {
    SearchBox ().sendKeys ("plumbing", Keys.ENTER);
}
    public void ShoppingCartPage() {
    ShoppingCart ().click ();
}
    public void TrackOrders3() {
    AllDept ().click ();
    }

    public void TrackPage() {
    Track ().click ();
    OrderNumber ().sendKeys ("W565477687");
    EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
    SubmitBttn ().click ();

}
    public void TrackOrders2() {
    AllDept ().click ();
    }

    public void ShoppingCartPage2() {
    ShoppingCart ().click ();
    }
    public void TrackPage2() {
        Track ().click ();
        OrderNumber ().sendKeys ("W565477687");
        EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
        SubmitBttn ().click ();

    }
    public void SearchBar2() {
        SearchBox ().sendKeys ("wrench", Keys.ENTER);
    }
    public void SearchBar3() {
        SearchBox ().sendKeys ("bathtub", Keys.ENTER);
    }
    public void SearchBar4() {
        SearchBox ().sendKeys ("refrigerator", Keys.ENTER);
    }
    public void SearchBar5() {
        SearchBox ().sendKeys ("windows", Keys.ENTER);
    }
    public void SearchBar6() {
        SearchBox ().sendKeys ("lights", Keys.ENTER);
    }
    public void SearchBar7() {
        SearchBox ().sendKeys ("bugspray", Keys.ENTER);
    }
    public void SearchBar8() {
        SearchBox ().sendKeys ("lawn", Keys.ENTER);
    }
    public void SearchBar9() {
        SearchBox ().sendKeys ("gardening", Keys.ENTER);
    }
    public void SearchBar10() {
        SearchBox ().sendKeys ("hammer", Keys.ENTER);
    }
    public void SearchBar11() {
        SearchBox ().sendKeys ("garbage bags", Keys.ENTER);
    }
    public void SearchBar12() {
        SearchBox ().sendKeys ("nails", Keys.ENTER);
    }
    public void SearchBar13() {
        SearchBox ().sendKeys ("paint", Keys.ENTER);
    }
    public void SearchBar14() {
        SearchBox ().sendKeys ("flooring", Keys.ENTER);
    }
    public void SearchBar15() {
        SearchBox ().sendKeys ("cabinets", Keys.ENTER);
    }
    public void SearchBar16() {
        SearchBox ().sendKeys ("carpet", Keys.ENTER);
    }
    public void SearchBar17() {
        SearchBox ().sendKeys ("tapes", Keys.ENTER);
    }
    public void SearchBar18() {
        SearchBox ().sendKeys ("grill", Keys.ENTER);
    }
    public void SearchBar19() {
        SearchBox ().sendKeys ("faucet", Keys.ENTER);
    }
    public void SearchBar20() {
        SearchBox ().sendKeys ("fans", Keys.ENTER);
    }

}
