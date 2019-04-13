package home;

import base.CommonAPI;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import javax.naming.Name;

public class CnnHomePage extends CommonAPI {

    public CnnHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='nav-menu-links']//a[@href='/us']")
    WebElement USTab;

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

    @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[8]")
    WebElement StyleLink;

    @FindBy(xpath= "//*[@id=\"logo\"]")
    WebElement CNNlogoLink;

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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return USTab;
    }
    public WebElement getWorldLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return WorldLink;
    }
    public WebElement getPoliticsLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return PoliticsLink; }

    public WebElement getBusinessLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return BusinessLink;
    }
    public WebElement getOpinionLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return OpinionLink;
    }
    public WebElement getHealthLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return  HealthLink;
    }
    public WebElement getStyleLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return StyleLink;
    }
    public WebElement getCNNlogoLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return CNNlogoLink;
    }

    public WebElement getSportsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SportsLink;
    }
    public WebElement getVideosLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return VideosLink;
    }
    public WebElement getLiveTVLink(){ return LiveTVLink;
    }
    public WebElement getUSEditionLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return USEditionLink;
    }
    public WebElement getSearchTabLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SearchTabLink;
    }
    public WebElement getTodayInPoliticsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TodayInPoliticsLink;
    }
    public WebElement getTopStoriesLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TopStoriesLink;
    }
    public WebElement getBreakingNewsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return BreakingNewsLink;
    }
    public WebElement getNewsAndBuzzLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return NewsAndBuzzLink;
    }
    public WebElement getAppleBigEventLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AppleBigEventLink;
    }
    public WebElement getCNNBusinessLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return CNNBusinessLink;
    }
    public WebElement getCheckThisOutLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return CheckThisOutLink;
    }
    public WebElement getPaidPartnerContentLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return PaidPartnerContentLink;
    }
    public WebElement getTechLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TechLink;
    }
    public WebElement getTrandingLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TrandingLink;
    }
    public WebElement getPaidContent(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return PaidContent;
    }
    public WebElement getMoreFromCNNLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return MoreFromCNNLink;
    }
    public WebElement getClimateChangeLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ClimateChangeLink;
    }
    public WebElement getCrisisAtBoeingLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return CrisisAtBoeingLink;
    }
    public WebElement getLendingTree() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return LendingTree;
    }
    public WebElement getTopCreditCardRewards(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TopCreditCardRewards;
    }
    public WebElement getPersonalFinanceLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return PersonalFinanceLink;
    }
    public WebElement getInCaseYouMissedIt(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return InCaseYouMissedIt;}

    public WebElement getWeatherIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return WeatherIcon;}

    public WebElement getTermOfUseTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TermsOfUseTab;}

    public WebElement getPrivacyPolicyTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return PrivacyPolicyTab;}

    public WebElement getAddChoicesTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AddChoicesTab;}

    public WebElement getAboutUsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AboutUsTab;}

    public WebElement getCNNStudioTours() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return CNNStudioTours;}

    public WebElement getCnnStoreTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return  CnnStoreTab;}

    public WebElement getNewsLetterTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return NewsLetterTab;}

    public WebElement getTranScriptTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TranScriptTab;}

    public WebElement getLicenseFootageTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return LicenseFootageTab;}

    public WebElement getCnnNewsSourceTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return CnnNewsSourceTab;}


    public void CnnHomePageLinks(){
        USTab.click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "US News – Top national stories and latest headlines");

        WorldLink.click();
        String title1 = driver.getTitle();
        Assert.assertEquals(title, "World news – breaking news, videos and headlines");

        PoliticsLink.click();
        String title3 = driver.getTitle();
        Assert.assertEquals(title, "CNNPolitics - Political News, Analysis and Opinion");

        BusinessLink.click();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.cnn.com/business");

        OpinionLink.click();
        String url1 = driver.getCurrentUrl();
        Assert.assertEquals(url1, "https://www.cnn.com/opinions");

        HealthLink.click();
        String url2 = driver.getCurrentUrl();
        Assert.assertEquals(url2, "https://www.cnn.com/health");

        StyleLink.click();
        String title8 = driver.getTitle();
        Assert.assertEquals(title, "CNN Style - Fashion, design, art, architecture and luxury");

        CNNlogoLink.click();
        String title9 = driver.getTitle();
        Assert.assertEquals(title, "CNN - Breaking News, Latest News and Videos");

        SportsLink.click();
        String title10 = driver.getTitle();
        Assert.assertEquals(title, "Bleacher Report | Sports. Highlights. News");

        VideosLink.click();
        String title11 = driver.getTitle();
        Assert.assertEquals(title, "Video News - CNN");

        USEditionLink.click();

        SearchTabLink.click();
        String title12 = driver.getTitle();
        Assert.assertEquals(title, "search-button");

        TodayInPoliticsLink.click();
        TopStoriesLink.click();
        BreakingNewsLink.click();
        NewsAndBuzzLink.click();
        AppleBigEventLink.click();
        CNNBusinessLink.click();
        CheckThisOutLink.click();
        PaidPartnerContentLink.click();
        TechLink.click();
        TrandingLink.click();
        PaidContent.click();
        MoreFromCNNLink.click();
        ClimateChangeLink.click();
        CrisisAtBoeingLink.click();
        LendingTree.click();
        TopCreditCardRewards.click();
        PersonalFinanceLink.click();
        InCaseYouMissedIt.click();
        WeatherIcon.click();
        TermsOfUseTab.click();
        PrivacyPolicyTab.click();
        AddChoicesTab.click();
        AboutUsTab.click();
        CNNStudioTours.click();
        CNNStudioTours.click();
        NewsLetterTab.click();
        TranScriptTab.click();
        LicenseFootageTab.click();
        CnnNewsSourceTab.click();

    }

}
