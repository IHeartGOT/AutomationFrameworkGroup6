package TestLandingPage;

import LandingPage.LandingPage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;
import static Methods.CommonMethods.FacebookPassword;
import static Methods.CommonMethods.FacebookUsername;

public class TestLogin extends CommonAPI {

    public LandingPage FLandingPage(){
        WebDriver driver = DriverFactory.getInstancen().getDriver();
        return PageFactory.initElements(driver,LandingPage.class);
    }
    @Test
    public void testLoginIncorrectCredentials(){
        FLandingPage().login("incorrectUserName@unknownDomain.com", "incorrectPassword");
        FLandingPage().assertIncorrectCredential("incorrectUsername");
    }
    @Test
    public void testLoginBlankPassword(){
        new LandingPage().login(FacebookUsername, "");
        new LandingPage().assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 3)
    public void testLoginIncorrectPassword(){
        FLandingPage().login(FacebookUsername, "incorrectPassword");
        FLandingPage().assertIncorrectCredential("incorrectPassword");
    }
    @Test(priority = 4)
    public void testLoginCorrectCredentials() throws IOException {
        FLandingPage().login(FacebookUsername,FacebookPassword);
    }
}

