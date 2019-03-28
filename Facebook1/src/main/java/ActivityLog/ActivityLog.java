package ActivityLog;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ActivityLog extends CommonAPI {

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/h2")
        public WebElement pageHeading;
        public String pageHeadingText = "Activity Log";
    }
