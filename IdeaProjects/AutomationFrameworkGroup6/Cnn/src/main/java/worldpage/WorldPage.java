package worldpage;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorldPage extends CommonAPI {

    public WorldPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[1]")
    WebElement AfricaLink;
    public WebElement getAfricaLink() {
        return AfricaLink;
    }
    public void Africa() { getAfricaLink().click();
    getAfricaLink().sendKeys("Africa", Keys.ENTER);

    }

    @FindBy(css = "#nav-section-submenu > a.nav-section__submenu-item.nav-section__submenu-active")
    WebElement AmericasLink;
    public WebElement getAmericasLink() { return AmericasLink;}
    public void Americas() { AmericasLink.click();
    getAmericasLink().sendKeys("Americas", Keys.ENTER);
    }

    @FindBy(xpath = "//*[@id=\"nav-section-submenu\"]/a[3]")
    WebElement AsiaLink;
    public WebElement getAsiaLink () { return AsiaLink;}
    public void Asia(){ AsiaLink.click();
    getAsiaLink().sendKeys("Asia",Keys.ENTER);

    }
    @FindBy(css = "#nav-section-submenu > a:nth-child(4)")
    WebElement AustraliaLink;
    public WebElement getAustraliaLink () { return AustraliaLink;}
    public void Australia() {
        AustraliaLink.click();
        getAustraliaLink().sendKeys("Australia", Keys.ENTER);
    }
    }

