package Methods;

import LandingPage.LandingPage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CommonMethods extends CommonAPI {

    public static final String FacebookUsername = System.getenv("FacebookUsername");
    public static final String FacebookPassword = System.getenv("FacebookPassword");
    public static final String FacebookFullName = System.getenv("FacebookFullName");

    public void signIn(WebDriver driver) throws IOException {
        WebDriver webDriver = DriverFactory.getInstance().getDriver();
        LandingPage LandingPage = PageFactory.initElements(driver, LandingPage.class);
        LandingPage.login(FacebookUsername,FacebookPassword);
        LandingPage.assertSuccessfulLogin();
    }
}
