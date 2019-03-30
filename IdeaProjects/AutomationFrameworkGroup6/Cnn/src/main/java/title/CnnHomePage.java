package title;

import base.CommonAPI;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.Name;

public class CnnHomePage extends CommonAPI {

    public CnnHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='nav-menu-links']//a[@href='/us']")
    WebElement US;

    @FindBy(css = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(2")
    WebElement WorldLink;

    @FindBy(css = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(3)")
    WebElement PoliticsLink;

    @FindBy(css = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(4)")
    WebElement BusinessLink;

    @FindBy(css = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(5)")
    WebElement OpinionLink;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[6]")
    WebElement HealthLink;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[7]")
    WebElement EntertainmentLink;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[8]")
    WebElement StyleLink;

    @FindBy(xpath= "//*[@id=\"logo\"]")
    WebElement CNNlogoLink;

    @FindBy(linkText = "main-menu_travel")
    WebElement TravelLink;

    @FindBy(linkText = "main-menu_bleacher")
    WebElement SportsLink;

    @FindBy(linkText = "main-menu_videos" )
    WebElement VideosLink;

    @FindBy(className = "js-nav__live-tv nav__live-tv")
    WebElement LiveTVLink;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[3]/div[1]")
    WebElement USEditionLink;

    @FindBy(className = "search__button cnn-icon")
    WebElement SearchTabLink;

    @FindBy(css = "#homepage1-zone-1 > div.l-container > div > div.column.zn__column--idx-1 > ul > h2")
    WebElement TodayInPoliticsLink;

    @FindBy(xpath = "//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[3]/ul/h2")
    WebElement TopStoriesLink;

    @FindBy(className = "cd__status cd__status--breaking")
    WebElement BreakingNewsLink;

    @FindBy(css = "#homepage2-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-0 > ul > h2")
    WebElement NewsAndBuzzLink;

    @FindBy(xpath = "//*[@id=\"homepage2-zone-1\"]/div[2]/div/div[2]/ul/h2")
    WebElement AppleBigEventLink;

    @FindBy(xpath = "//*[@id=\"homepage2-zone-1\"]/div[2]/div/div[6]/ul/a/h2")
    WebElement CNNBusinessLink;

    @FindBy(css = "#homepage2-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-4 > div > h2")
    WebElement CheckThisOutLink;

    @FindBy(xpath = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[3]/ul/h2")
    WebElement PaidPartnerContentLink;

    @FindBy(css = "#homepage3-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-7 > ul > a > h2")
    WebElement TechLink;

    @FindBy(xpath = "//*[@id=\"homepage4-zone-1\"]/div[2]/div[2]/div[2]/ul/h2")
    WebElement TrandingLink;

    @FindBy(css = "#outbrain_widget_0 > div > div.ob-widget-section.ob-first > div")
    WebElement PaidContent;

    @FindBy(css = "#homepage4-zone-3 > div.l-container.zn__background--content-relative > div.zn-header > h2")
    WebElement MoreFromCNNLink;

    @FindBy(xpath = "//*[@id=\"homepage4-zone-3\"]/div[3]/div[2]/div[1]/ul/h2")
    WebElement ClimateChangeLink;

    @FindBy(xpath = "//*[@id=\"homepage4-zone-3\"]/div[3]/div[2]/div[2]/ul/h2")
    WebElement CrisisAtBoeingLink;

    @FindBy(css = "body > div.widget-grid-container > div > div:nth-child(9) > div > h2 > a")
    WebElement LendingTree;

    @FindBy(css = "body > div.widget-grid-container > div > div:nth-child(11) > div > h2 > a")
    WebElement TopCreditCardRewards;

    @FindBy(css = "body > div.widget-grid-container > div > div:nth-child(13) > div > h2 > a")
    WebElement PersonalFinanceLink;

    @FindBy(xpath = "//*[@id=\"homepage4-zone-7\"]/div[2]/div[1]/h2")
    WebElement InCaseYouMissedIt;

    @FindBy(xpath = "//img[@class='el-weather__header-icon']")
    WebElement WeatherIcon;

    @FindBy(partialLinkText = "footer_terms-of-use")
    WebElement TermsOfUseTab;

    @FindBy(xpath = "/html/body/footer/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a")
    WebElement PrivacyPolicyTab;

    @FindBy(css = "/html/body/footer/div[2]/div/div[2]/div[2]/div[2]/ul/li[4]/a ")
    WebElement AddChoicesTab;

    @FindBy(partialLinkText = "footer_about-us")
    WebElement AboutUsTab;

    @FindBy(partialLinkText = "footer_cnn-studio-tours")
    WebElement CNNStudioTours;

    @FindBy(partialLinkText = "footer_cnn-store")
    WebElement CnnStoreTab;

    @FindBy(xpath = "/html/body/footer/div[2]/div/div[2]/div[2]/div[2]/ul/li[8]/a")
    WebElement NewsLetterTab;

    @FindBy(partialLinkText = "footer_transcripts")
    WebElement TranScriptTab;

    @FindBy(partialLinkText = "footer_license-footage")
    WebElement LicenseFootageTab;

    @FindBy(xpath = "/html/body/footer/div[2]/div/div[2]/div[2]/div[2]/ul/li[11]/a")
    WebElement CnnNewsSourceTab;


    public WebElement getUSLink() {
        return US;
    }
    public WebElement getWorldLink() {
        return WorldLink;
    }
    public WebElement getPoliticsLink() { return PoliticsLink; }
    public WebElement getBusinessLink(){
        return BusinessLink;
    }
    public WebElement getOpinionLink(){
        return OpinionLink;
    }
    public WebElement getHealthLink() {
        return  HealthLink;
    }
    public WebElement getEntertainmentLink(){
        return EntertainmentLink;
    }
    public WebElement getStyleLink(){
        return StyleLink;
    }
    public WebElement getCNNlogoLink(){
        return CNNlogoLink;
    }
    public WebElement getTravelLink(){
        return TravelLink;
    }
    public WebElement getSportsLink(){
        return SportsLink;
    }
    public WebElement getVideosLink(){
        return VideosLink;
    }
    public WebElement getLiveTVLink(){ return LiveTVLink;
    }
    public WebElement getUSEditionLink(){
        return USEditionLink;
    }
    public WebElement getSearchTabLink(){
        return SearchTabLink;
    }
    public WebElement getTodayInPoliticsLink(){
        return TodayInPoliticsLink;
    }
    public WebElement getTopStoriesLink(){
        return TopStoriesLink;
    }
    public WebElement getBreakingNewsLink(){
        return BreakingNewsLink;
    }
    public WebElement getNewsAndBuzzLink(){
        return NewsAndBuzzLink;
    }
    public WebElement getAppleBigEventLink(){ return AppleBigEventLink;
    }
    public WebElement getCNNBusinessLink(){
        return CNNBusinessLink;
    }
    public WebElement getCheckThisOutLink(){
        return CheckThisOutLink;
    }
    public WebElement getPaidPartnerContentLink(){
        return PaidPartnerContentLink;
    }
    public WebElement getTechLink(){ return TechLink;
    }
    public WebElement getTrandingLink(){
        return TrandingLink;
    }
    public WebElement getPaidContent(){
        return PaidContent;
    }
    public WebElement getMoreFromCNNLink(){
        return MoreFromCNNLink;
    }
    public WebElement getClimateChangeLink(){
        return ClimateChangeLink;
    }
    public WebElement getCrisisAtBoeingLink(){
        return CrisisAtBoeingLink;
    }
    public WebElement getLendingTree() {
        return LendingTree;
    }
    public WebElement getTopCreditCardRewards(){
        return TopCreditCardRewards;
    }
    public WebElement getPersonalFinanceLink(){
        return PersonalFinanceLink;
    }
    public WebElement getInCaseYouMissedIt(){ return InCaseYouMissedIt;}
    public WebElement getWeatherIcon(){ return WeatherIcon;}
    public WebElement getTermOfUseTab(){return TermsOfUseTab;}
    public WebElement getPrivacyPolicyTab(){return PrivacyPolicyTab;}
    public WebElement getAddChoicesTab(){return AddChoicesTab;}
    public WebElement getAboutUsTab(){return AboutUsTab;}
    public WebElement getCNNStudioTours() {return CNNStudioTours;}
    public WebElement getCnnStoreTab(){return  CnnStoreTab;}
    public WebElement getNewsLetterTab(){return NewsLetterTab;}
    public WebElement getTranScriptTab(){return TranScriptTab;}
    public WebElement getLicenseFootageTab(){return LicenseFootageTab;}
    public WebElement getCnnNewsSourceTab() {return CnnNewsSourceTab;}


    public void CnnHomePageLinks(){
        US.sendKeys("US", Keys.ENTER);
        WorldLink.sendKeys("WorldLink",Keys.ENTER);
        PoliticsLink.click();
        BusinessLink.click();
        OpinionLink.click();
        HealthLink.click();
        EntertainmentLink.click();
        StyleLink.sendKeys("Style", Keys.ENTER);
        CNNlogoLink.click();
        TravelLink.click();
        SportsLink.click();
        VideosLink.click();
        USEditionLink.click();
        SearchTabLink.click();
        TodayInPoliticsLink.click();
        TopStoriesLink.sendKeys("TopStories", Keys.ENTER);
        BreakingNewsLink.click();
        NewsAndBuzzLink.click();
        AppleBigEventLink.click();
        CNNBusinessLink.click();
        CheckThisOutLink.click();
        PaidPartnerContentLink.click();
        TechLink.sendKeys("Tech",Keys.ENTER);
        TrandingLink.click();
        PaidContent.click();
        MoreFromCNNLink.click();
        ClimateChangeLink.click();
        CrisisAtBoeingLink.click();
        LendingTree.click();
        TopCreditCardRewards.click();
        PersonalFinanceLink.click();
        InCaseYouMissedIt.sendKeys("InCaseYouMissedIt", Keys.ENTER);
        WeatherIcon.sendKeys("WeatherIcon", Keys.ENTER);
        TermsOfUseTab.sendKeys("TermsOfUse", Keys.ENTER);
        PrivacyPolicyTab.click();
        AddChoicesTab.sendKeys("AddChoices", Keys.ENTER);
        AboutUsTab.sendKeys("AboutUs", Keys.ENTER);
        CNNStudioTours.click();
        CNNStudioTours.sendKeys("CnnStore",Keys.ENTER);
        NewsLetterTab.click();
        TranScriptTab.sendKeys("TranScriptTab",Keys.ENTER);
        LicenseFootageTab.click();
        CnnNewsSourceTab.click();

    }

}
