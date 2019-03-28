package title;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorldPAge extends CommonAPI {

    public WorldPAge() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[1]")
    WebElement AfricaLink;

    @FindBy(css = "#nav-section-submenu > a.nav-section__submenu-item.nav-section__submenu-active")
    WebElement AmericasLink;

    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[3]")
    WebElement AsiaLink;

    @FindBy(css = "#nav-section-submenu > a:nth-child(4)")
    WebElement AustraliaLink;

    public WebElement getAfricaLink(){
        return AfricaLink;
    }
    public WebElement getAmericasLink(){
        return AmericasLink;
    }
    public WebElement getAsiaLink(){
        return AustraliaLink;
    }
    public void WorldPageLinks(){
        AfricaLink.click();
        AmericasLink.click();
        AsiaLink.click();
        AustraliaLink.click();

    }
}
