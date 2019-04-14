package title;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

   /* By search = By.id("searchQuery");
    public WebElement SearchButton() {
        return driver.findElement(search);*/

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sign-in")
    public WebElement SignInTab;

    @FindBy(xpath = "//*[@id=\"unifiedSidebar\"]/div[1]/nav/ul/li[1]/a/span")
    public WebElement FeatureTab;

    @FindBy(className = "myspace-logo svg")
    private WebElement logoTab;

    @FindBy(id = "searchQuery")
    public WebElement SearchTab;

    @FindBy(css = "#unifiedSidebar > div:nth-child(3) > nav > ul > li.people.selected > a > span")
    public WebElement PeopleTab;

    @FindBy(className = "discover-videos svg")
    public WebElement VideoLink;

    @FindBy(xpath = "//*[@id=\"footer_global\"]/span[1]/a")
    public WebElement HelpButton;

    @FindBy(xpath = "//*[@id='site-info']")
    public WebElement SiteInfoLink;

    @FindBy(css = "#footer_global > span:nth-child(4) > a")
    public WebElement PrivacyLink;

    @FindBy(css = "#footer_global > span:nth-child(5) > a")
    public WebElement TermsLink;

    @FindBy(partialLinkText = "\"/articles/news\"")
    public WebElement NewsLink;

    @FindBy(xpath = "//a[@href='/articles/artist-of-the-day']")
    public WebElement ArtistOfTheDay;

    @FindBy(xpath = "//a[@href='/articles/q-a']")
    public WebElement QandALink;

    @FindBy(partialLinkText = "\"/articles/everybody-loves-a-list\"")
    public WebElement EveryBodyLovesAListTab;

    @FindBy(css = "c#article-category-nav > ul.categories > li:nth-child(5) > a")
    public WebElement Top8Link;

    @FindBy(xpath = "//a[@href='/articles/portraits']")
    public WebElement PortraitsTab;

    @FindBy(partialLinkText = "\"/pages/privacy?page=ad-opt-out\" ")
    public WebElement AdOptOutTab;


    public WebElement getSignInTab() {
        return SignInTab;
    }

    public WebElement getFeatureTab() {
        return FeatureTab;
    }

    public WebElement getLogoTab() {
        return logoTab;
    }

    public WebElement getSearchTab() {
        return SearchTab;
    }

    public WebElement getPeopleTab() {
        return PeopleTab;
    }

    public WebElement getVideoLink() {
        return VideoLink;
    }

    public WebElement getHelpButton() {
        return HelpButton;
    }

    public WebElement getSiteInfoLink() {
        return SiteInfoLink;
    }

    public WebElement getPrivacyLink() {
        return PrivacyLink;
    }

    public WebElement getTermsLink() {
        return TermsLink;
    }

    public WebElement getNewsLink() {
        return NewsLink;
    }

    public WebElement getArtistOfTheDay() {
        return ArtistOfTheDay;
    }

    public WebElement getQandALink(){
        return QandALink;
    }
    public WebElement getEveryBodyLovesAListTab(){
        return EveryBodyLovesAListTab;
    }
    public WebElement getTop8Link(){
        return Top8Link;
    }
    public WebElement getPortraitsTab(){
        return PortraitsTab;
    }
    public WebElement getAdOptOutTab(){
        return AdOptOutTab;
    }


    public void HomePageLink(){
        SignInTab.click();
        FeatureTab.click();
        logoTab.sendKeys("logoTab", Keys.ENTER);
        SearchTab.click();
        PeopleTab.click();
        VideoLink.sendKeys("VideoLink", Keys.ENTER);
        HelpButton.click();
        SiteInfoLink.click();
        PrivacyLink.click();
        TermsLink.sendKeys("TermsLink", Keys.ENTER);
        NewsLink.sendKeys("NewsLink", Keys.ENTER);
        ArtistOfTheDay.click();
        QandALink.sendKeys("QandAlink", Keys.ENTER);
        EveryBodyLovesAListTab.click();
        Top8Link.sendKeys("Top8Link", Keys.ENTER);
        PortraitsTab.click();
        AdOptOutTab.sendKeys("AdOptOutTab", Keys.ENTER);


    }
}


