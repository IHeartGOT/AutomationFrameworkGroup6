package entertainment;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class Entertainment extends CommonAPI {

    public Entertainment() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(partialLinkText = "header_stars")
    WebElement EntertainmentLink;

    public WebElement EntertainmentTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return EntertainmentLink;
    }
    public void EntertainmentPage() {
        EntertainmentTab().click();
        String url = driver.getCurrentUrl ();
        Assert.assertEquals (url, "https://www.cnn.com/entertainment");

    }

}
