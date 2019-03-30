package BrowseCostco;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class HomepageUtilities extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"header-widget\"]/div/div/div/div[1]/a/img")
    public static WebElement homeButton;
    @FindBy(xpath = "//*[@id=\"navigation-dropdown\"]")
    public static WebElement savedUtility;
    @FindBy(xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_5\"]")
    public static WebElement motorsOption;
    @FindBy(xpath = "//*[@id=\"search-results\"]/ctl:cache/div[1]/h1")
    public static WebElement fashionUtility;
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[1]/div/div/div/h1")
    public static WebElement electronicsUtility;
    @FindBy(xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_6\"]")
    public static WebElement collectiblesAndArt;
    @FindBy(xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_8\"]")
    public static WebElement homeAndGarden;
    @FindBy(xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_16\"]")
    public static WebElement sportingGoodsUtility;
    @FindBy(xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_14\"]")
    public static WebElement toysUtility;
    @FindBy(xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_11\"]")
    public static WebElement businessAndIndustrialUtility;
    @FindBy(xpath = "//*[@id=\"primary-category-container\"]/li[3]")
    public static WebElement musicUtility;
    @FindBy(xpath = "//*[@id=\"Home_Ancillary_4\"]")
    public static WebElement dealsUtility;
    @FindBy(xpath = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_14\"]")
    public static WebElement under10Utility;
    @FindBy(css = "#header_sign_in")
    public static WebElement signInButton;
    @FindBy(css = "#logonId")
    public static WebElement userIdInputBar;
    @FindBy(css = "#logonPassword")
    public static WebElement passwordInputBar;

    public void homeButton() {
        homeButton.click();
    }

    //Must be signed in to access feed
    public void savedUtility() {
        savedUtility.click();
        userIdInputBar.sendKeys("Prabet24@gmail.com");
        passwordInputBar.sendKeys("******");
        signInButton.click();
    }

    public void motorsUtility() {
        motorsOption.click();
    }

    public void setFashionUtility() {
        fashionUtility.click();
    }

    public void electronicsUtility() {
        electronicsUtility.click();
    }

    public void setCollectiblesAndArt() {
        collectiblesAndArt.click();
    }

    public void homeAndGarden() {
        homeAndGarden.click();
    }

    public void sportingGoodsUtility() {
        sportingGoodsUtility.click();
    }

    public void toysUtility() {
        toysUtility.click();
    }

    public void businessAndIndustrialUtility() {
        businessAndIndustrialUtility.click();
    }

    public void musicUtility() {
        musicUtility.click();
    }

    public void dealsUtility() {
        dealsUtility.click();
    }

    public void under10Utility() {
        under10Utility.click();
    }




}