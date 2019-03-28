package NewsFeedPerferences;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class NewsFeedPerferences extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@data-intl-translation='Preferences']")
        public WebElement pageHeading;
        public String pageHeadingText = "Preferences";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}

