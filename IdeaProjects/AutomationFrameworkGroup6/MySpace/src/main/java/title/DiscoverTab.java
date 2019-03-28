package title;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscoverTab extends CommonAPI {

    public DiscoverTab() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "nav-title")
    WebElement Discoverlink;

    public WebElement getDiscoverlink() {
        return Discoverlink;
    }
    public void DiscoverTab(){ Discoverlink.click();
    getDiscoverlink().sendKeys("DiscoverTab", Keys.ENTER);
    }

}

