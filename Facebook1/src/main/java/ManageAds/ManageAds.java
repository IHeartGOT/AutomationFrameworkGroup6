package ManageAds;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ManageAds extends CommonAPI {
    @FindBy(how = How.XPATH,using = "html/body/div[1]/div/div[3]/form/div[1]")
    public WebElement pageHeading;
    public String pageHeadingText = "Ad Accounts";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}

