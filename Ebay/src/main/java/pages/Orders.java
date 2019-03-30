package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Orders extends CommonAPI {

    public Orders() {
        PageFactory.initElements (driver, this);

    }

    @FindBy(className = "gh-eb-li-a")
    WebElement orders;

    @FindBy(id = "userid")
    WebElement userID;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(id = "sgnBt")
    WebElement sndbutton;

    @FindBy(xpath = "//*[@id=\"domain-nav\"]/div[2]/p[4]/a")
    WebElement purchaseHistory;


    public WebElement OrderPage() {
        return orders;
    }

    public WebElement UserID() {
        return userID;
    }

    public WebElement Password() {
        return password;
    }

    public WebElement SendButton() {
        return sndbutton;
    }

    public WebElement PurchaseHistory(){
        return purchaseHistory;
    }

    public void UserOrders() {
        OrderPage ().click ();
        UserID ().sendKeys ("prodip718");
        Password ().sendKeys ("Bangladesh1");
        SendButton ().click ();
        PurchaseHistory ().click ();
        String title = driver.getTitle ();
        Assert.assertEquals (title, "My eBay Purchase History");

    }

}


