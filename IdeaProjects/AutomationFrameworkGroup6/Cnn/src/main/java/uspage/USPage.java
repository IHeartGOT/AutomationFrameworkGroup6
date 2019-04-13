package uspage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPage extends CommonAPI {

    public USPage() { PageFactory.initElements(driver, this);
    }

//    @FindBy(className = "ad-ad_bnr_atf_01 ad-refresh-adbanner adfuel-rendered")
//    WebElement US;
//    public WebElement getUS(){return US;}
//    public void USPage() {
//        US.click();
//    }

    @FindBy(css = "#nav-section-submenu > a:nth-child(1)")
    WebElement CrimeJusticelink;

    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[2]")
    WebElement EnergyAndEnvironmentLink;

    @FindBy(css = "#nav-section-submenu > a:nth-child(3)")
    WebElement ExtremeWeather;

    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[4]")
    WebElement SpaceAndScienceLink;

    public WebElement getCrimeJusticelink(){
        return CrimeJusticelink;
    }
    public WebElement getEnergyAndEnvironmentLink(){
        return EnergyAndEnvironmentLink;
    }
    public WebElement getExtremeWeather(){
        return ExtremeWeather;
    }
    public WebElement getSpaceAndScienceLink(){
        return SpaceAndScienceLink;
    }
    public void USPageLinks(){

        CrimeJusticelink.click();
        EnergyAndEnvironmentLink.click();
        ExtremeWeather.click();
        SpaceAndScienceLink.click();
    }
}
