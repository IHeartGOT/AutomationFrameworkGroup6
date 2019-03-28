package HomePage;

import ActivityLog.ActivityLog;
import CreateAds.CreateAds;
import CreateGroup.CreateGroup;
import CreatePages.CreatePages;
import Help.Help;
import LandingPage.LandingPage;
import ManageAds.ManageAds;
import NewGroup.NewGroup;
import NewsFeedPerferences.NewsFeedPerferences;
import ReportProblem.ReportProblem;
import SupportInbox.SupportInbox;
import base.CommonAPI;
import okhttp3.internal.http2.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class YourAccount extends CommonAPI {

    WebDriver locDriver = DriverFactory.getInstance().getDriver();

    @FindBy(how = How.XPATH,using=".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[position()>last()-17]/a")
    List<WebElement> elements = new ArrayList();

    public CreatePages getCreatePage(){
        elements.get(0).click();
        //CreatePage CreatePage = PageFactory.initElements(locDriver,CreatePage.class);
        return PageFactory.initElements(locDriver, CreatePages.class);
    }
    public ManagePage getManagePages(){
        elements.get(1).click();
        return PageFactory.initElements(locDriver, ManagePage.class);
    }
    public CreateGroup getCreateGroup() throws InterruptedException {
        elements.get(2).click();
        sleepFor(2);
        return PageFactory.initElements(locDriver, CreateGroup.class);
    }
    public NewGroup getNewGroups(){
        elements.get(3).click();
        return PageFactory.initElements(locDriver, NewGroup.class);
    }
    public CreateAds getCreateAds(){
        elements.get(4).click();
        return PageFactory.initElements(locDriver, CreateAds.class);
    }
    public ManageAds getManageAds(){
        elements.get(5).click();
        return PageFactory.initElements(locDriver, ManageAds.class);
    }
    public ActivityLog getActivityLog(){
        elements.get(6).click();
        return PageFactory.initElements(locDriver, ActivityLog.class);
    }
    public NewsFeedPerferences getNewsFeedPreferences() throws InterruptedException {
        elements.get(7).click();
        sleepFor(1);
        return PageFactory.initElements(locDriver, NewsFeedPerferences.class);
    }
    public Settings getSettings(){
        elements.get(8).click();
        return PageFactory.initElements(locDriver, Settings.class);
    }
    public LandingPage getLogout(){
        elements.get(9).click();
        return PageFactory.initElements(locDriver, LandingPage.class);
    }
    public Help getHelp(){
        elements.get(10).click();
        return PageFactory.initElements(locDriver, Help.class);
    }
    public SupportInbox getSupportInbox(){
        elements.get(11).click();
        return PageFactory.initElements(locDriver, SupportInbox.class);
    }
    public ReportProblem getReportProblem() throws InterruptedException {
        elements.get(12).click();
        sleepFor(1);
        return PageFactory.initElements(locDriver, ReportProblem.class);
    }
}

