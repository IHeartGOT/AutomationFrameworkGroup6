package Homepage;

import HomePage.HomePage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;
import static org.testng.log4testng.Logger.getLogger;

    public class TestPostStatus extends CommonAPI {

    public HomePage HomePage() throws IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        getLogger(this.getClass()).trace("Creating new instance of WebDriver");
        typeOnID(driver);
        getLogger(this.getClass()).trace("Signing in to Facebook");
        return PageFactory.initElements(driver,HomePage.class);
    }
    private void typeOnID(WebDriver driver) {
    }
    @Test
    public void testPostStatus() throws IOException, InterruptedException {
        HomePage().typePostStatusBar("Test Test Test",DriverFactory.getInstance().getDriver());
        getLogger(TestPostStatus.class).trace("Type Test Message on Facebook PostStatusBar");
        sleepFor(3);
    }
}

