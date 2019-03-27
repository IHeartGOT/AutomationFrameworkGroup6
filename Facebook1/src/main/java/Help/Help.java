package Help;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Help extends CommonAPI {
    @FindBy(how = How.CSS,using = ".fsl.fwb")
    public WebElement pageHeading;
    public String pageHeadingText = "help";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}

