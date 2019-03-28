package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entertainment extends CommonAPI {

    public Entertainment() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(partialLinkText = "header_stars")
    WebElement EntertainmentLink;

    public WebElement EntertainmentTab() {
        return EntertainmentLink;
    }
    public void Entertainment() {
        EntertainmentTab().click();
        EntertainmentTab().sendKeys("Stars", Keys.ENTER);

    }

}
