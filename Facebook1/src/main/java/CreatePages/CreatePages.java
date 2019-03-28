package CreatePages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static org.testng.log4testng.Logger.getLogger;

public class CreatePages extends CommonAPI {

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[2]/h2")
    public WebElement pageHeading;
    public String pageHeadingText = "Create a Page";

    public void assertPage() {
        getLogger(CreatePages.class).trace("Execute assertPage Method for UiCreatePage Class");
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}

