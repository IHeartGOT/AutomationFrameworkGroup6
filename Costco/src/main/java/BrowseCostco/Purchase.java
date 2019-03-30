package BrowseCostco;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class Purchase extends CommonAPI {


    @FindBy(css = "#search-field") public static WebElement searchBar;
    @FindBy(css = "#search-dropdown-select") public static WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"accordion-filter_collapse-2\"]/div/a[1]/label/span[1]")
    public static WebElement under1DollarOtion;





    public void purchaseAnItem(){
        searchBar.sendKeys("Keychains");
        searchButton.click();
        under1DollarOtion.click();
    }
}


