package title;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logo extends CommonAPI {

    public Logo() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(className = "myspace-logo svg")
    WebElement logoTab;

    public WebElement EntertainmentTab() {
        return logoTab;
    }
    public void LogoTab() { logoTab.click();
    logoTab.sendKeys("logo", Keys.ENTER);

    }

}

