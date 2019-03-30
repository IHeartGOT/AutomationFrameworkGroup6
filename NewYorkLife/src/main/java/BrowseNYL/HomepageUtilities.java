package BrowseNYL;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class HomepageUtilities extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"header\"]/div/a/img")
    public static WebElement homeButton;
    @FindBy(xpath = "//*[@id=\"nylsearch\"]/fieldset/legend/p/label")
    public static WebElement savedUtility;
    @FindBy(xpath = "//*[@id=\"mega-nav\"]/div[1]/a")
    public static WebElement motorsOption;
    @FindBy(xpath = "///*[@id=\"mega-nav\"]/div[3]/a")
    public static WebElement fashionUtility;
    @FindBy(xpath = "//*[@id=\"mega-nav\"]/div[4]/a")
    public static WebElement electronicsUtility;
    @FindBy(xpath = "//*[@id=\"facet_year_mvs\"]/button/h3")
    public static WebElement collectiblesAndArt;
    @FindBy(xpath = "//*[@id=\"facet_content-type_mvs\"]/button/h3")
    public static WebElement homeAndGarden;
    @FindBy(xpath = "//*[@id=\"facet_about-new-york-life_mvs\"]/button/h3")
    public static WebElement sportingGoodsUtility;
    @FindBy(xpath = "//*[@id=\"facet_about-new-york-life_mvs\"]/button/h3")
    public static WebElement toysUtility;
    @FindBy(xpath = "//*[@id=\"main-nav\"]/nav[1]/div[1]/a")
    public static WebElement businessAndIndustrialUtility;
    @FindBy(xpath = "//*[@id=\"main-nav\"]/nav[1]/div[2]/a")
    public static WebElement musicUtility;
    @FindBy(xpath = "//*[@id=\"cmp-search-results__load-more\"]/div[1]")
    public static WebElement dealsUtility;
    @FindBy(xpath = "/html/body/footer/div/div/div/div[1]/div/div[1]/div[2]/div/h6")
    public static WebElement under10Utility;
    @FindBy(css = "//*[@id=\"main-nav\"]/nav[1]/div[3]/a")
    public static WebElement signInButton;
    @FindBy(css = "//*[@id=\"myNylUserName\"]")
    public static WebElement userIdInputBar;
    @FindBy(css = "//*[@id=\"myNylPassword\"]")
    public static WebElement passwordInputBar;

    public void homeButton() {
        homeButton.click();
    }

    public void savedUtility() {
        savedUtility.click();
        userIdInputBar.sendKeys("Prabet24@gmail.com");
        passwordInputBar.sendKeys("******");
        signInButton.click();
    }

}