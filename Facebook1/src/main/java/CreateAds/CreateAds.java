package CreateAds;

import base.CommonAPI;
import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;

public class CreateAds extends CommonAPI {
    
    public WebDriver driver = DriverFactory.getInstance().getDriver();
    public String pageHeadingText = "Ads Manager";

        public void assertPage(){
            Assert.check(driver.getTitle().contains(pageHeadingText));
        }
}
