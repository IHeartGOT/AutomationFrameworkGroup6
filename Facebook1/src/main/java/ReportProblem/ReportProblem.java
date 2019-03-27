package ReportProblem;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

    public class ReportProblem extends CommonAPI {

     @FindBy(how = How.XPATH,using = ".//*[@id='bug_or_feedback']/a[1]")
     public WebElement pageHeading;
     public String pageHeadingText = "General Feedback";

    public void assertPage(){
        Assert.assertTrue(pageHeading.getText().contains(pageHeadingText));
    }
}

