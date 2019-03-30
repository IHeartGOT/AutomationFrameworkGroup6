package BrowseNYL;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Searches extends CommonAPI {
    @FindBy(css = "body > footer > div > div > div > div.cmp-footer__primary.pb-5 > div > div:nth-child(1) > div:nth-child(2) > div > ul > li:nth-child(1) > a")public static WebElement signInButton;
    @FindBy(css = "#search-input")public static WebElement searchBar;
    @FindBy(css = "#search > div")public static WebElement searchButton;
    @FindBy(css = "document.querySelector('body > footer > div > div > div > div.cmp-footer__primary.pb-5 > div > div:nth-child(1) > div:nth-child(2) > div > ul > li:nth-child(2) > a')")public static WebElement advancedSearchOption;
    @FindBy(xpath = "body > footer > div > div > div > div.cmp-footer__primary.pb-5 > div > div:nth-child(1) > div:nth-child(2) > div > ul > li:nth-child(3) > a")public static WebElement byItemNumber;
    @FindBy(css = "body > footer > div > div > div > div.cmp-footer__primary.pb-5 > div > div:nth-child(1) > div:nth-child(3) > div > ul > li:nth-child(6) > a")public static WebElement itemNumberInputBox;
    @FindBy(css = "body > footer > div > div > div > div.cmp-footer__primary.pb-5 > div > div:nth-child(1) > div:nth-child(3) > div > ul > li:nth-child(1) > a")public static WebElement keyWordInputBox;
    @FindBy(xpath = "body > footer > div > div > div > div.cmp-footer__primary.pb-5 > div > div:nth-child(1) > div.rte.text > div > p:nth-child(2) > span > span")public static WebElement xPopUp;
    @FindBy(xpath = "body > footer > div > div > div > div.cmp-footer__primary.pb-5 > div > div:nth-child(2) > div.social-follow > div")public static WebElement saveThisSearchOption;



}



