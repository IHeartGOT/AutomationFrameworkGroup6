package CreateGroup;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class CreateGroup extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@id='groupsCreateName']")
    public WebElement pageHeading;
    public String pageHeadingText = "Name";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}

