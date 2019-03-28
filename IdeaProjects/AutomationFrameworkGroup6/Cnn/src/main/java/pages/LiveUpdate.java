package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveUpdate extends CommonAPI {

    public LiveUpdate() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "cd__status cd__status--breaking")
    WebElement LiveUpdateField;

    public WebElement LiveUpButton() {
        return LiveUpdateField;
    }
    public void LiveUpdateTab() {
        LiveUpButton().click();
        LiveUpButton().sendKeys("Latest News", Keys.ENTER);
    }

}

