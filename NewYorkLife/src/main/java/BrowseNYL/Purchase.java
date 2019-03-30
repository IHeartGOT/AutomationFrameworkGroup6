package BrowseNYL;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class Purchase extends CommonAPI {


    public static WebElement searchBar;
    public static WebElement searchButton;
    public static WebElement under1DollarOtion;





    public void purchaseAnItem(){
        searchBar.sendKeys("Keychains");
        searchButton.click();
        under1DollarOtion.click();
    }
}


