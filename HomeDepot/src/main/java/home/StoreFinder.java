package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class StoreFinder extends CommonAPI {

    public StoreFinder(){
        PageFactory.initElements (driver, this);

    }

    @FindBy(className = "TaskLinks__link")
    WebElement storelocation;

    @FindBy (id="storeSearchBox")
    WebElement zip;


    public WebElement StoreFinder(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return storelocation;}

    public WebElement ZipCode(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return zip;}

    public void StoreLocation(){
        StoreFinder ().click ();
        ZipCode ().sendKeys ("11421", Keys.ENTER);

    }

}
