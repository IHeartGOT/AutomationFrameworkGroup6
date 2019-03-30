package BrowseCostco;
import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Searches extends CommonAPI {
    @FindBy(css = "#header_emailSignUpEmail")public static WebElement signInButton;
    @FindBy(css = "")public static WebElement searchBar;
    @FindBy(css = "")public static WebElement searchButton;
    @FindBy(css = "")public static WebElement advancedSearchOption;
    @FindBy(xpath = "")public static WebElement byItemNumber;
    @FindBy(css = "")public static WebElement itemNumberInputBox;
    @FindBy(css = "")public static WebElement keyWordInputBox;
    @FindBy(xpath = "")public static WebElement xPopUp;
    @FindBy(xpath = "")public static WebElement saveThisSearchOption;



}
