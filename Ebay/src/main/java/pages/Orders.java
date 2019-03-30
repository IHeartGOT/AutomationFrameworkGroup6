package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        return orders;
    }

    public WebElement UserID() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        return userID;
    }

    public WebElement Password() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return password;
    }

    public WebElement SendButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return sndbutton;
    }

    public WebElement PurchaseHistory(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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


