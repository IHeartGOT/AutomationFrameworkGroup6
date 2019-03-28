package Homepage;

import HomePage.MenuBar;
import HomePage.YourAccount;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestYourAcc extends CommonAPI {

    private Object InterruptedException;

    public YourAccount getYourAccount() throws IOException {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        signIn(driver);
        MenuBar MenuBar = PageFactory.initElements(driver, MenuBar.class);
        MenuBar.getYourAccount() getYourAccount();
        return PageFactory.initElements(driver, YourAccount.class);
    }
    @Test
    public void testCreatePage () throws IOException {
        getYourAccount().getCreatePage().assertPage();
    }
    @Test
    public void testManagePages () throws IOException {
        getYourAccount().getManagePages().assertPage();
    }
    @Test
    public void testCreateGroup () throws InterruptedException, IOException {
        getYourAccount().getCreateGroup().assertPage();
    }
    @Test
    public void testNewGroups () throws IOException {
        getYourAccount().getNewGroups().assertPage();
    }
    @Test
    public void testCreateAds () throws IOException, InterruptedException {
        getYourAccount().getCreateAds().assertPage();

    @Test
    public void testManageAds () throws IOException {
        getYourAccount().getManageAds().assertPage();
    }
    @Test
    public void testActivityLog () throws IOException {
        getYourAccount().getActivityLog().assertPage();
    }
    @Test
    public void testNewsFeedPreferences () throws InterruptedException, IOException {
        getYourAccount().getNewsFeedPreferences().assertPage();
    }
    @Test
    public void testSettings () throws IOException {
        getYourAccount().getSettings().assertPage();
    }
    @Test
    public void testLogout () throws IOException {
        getYourAccount().getLogout().assertPage();
    }
    @Test
    public void testHelp () throws IOException {
        getYourAccount().getHelp().assertPage();
    }
    @Test
    public void testSupportInbox () throws IOException {
        getYourAccount().getSupportInbox().assertPage();
    }
    @Test
    public void testReportProblem () throws InterruptedException, IOException {
        getYourAccount().getReportProblem().assertPage();
    }
    }
}
