package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreFinder extends CommonAPI {

    public StoreFinder(){
        PageFactory.initElements (driver, this);

    }

    @FindBy(className = "TaskLinks__link")
    WebElement storelocation;

    @FindBy (id="storeSearchBox")
    WebElement zip;


    public WebElement StoreFinder(){return storelocation;}
    public WebElement ZipCode(){return zip;}

    public void StoreLocation(){
        StoreFinder ().click ();
        ZipCode ().sendKeys ("11421", Keys.ENTER);

    }

}
