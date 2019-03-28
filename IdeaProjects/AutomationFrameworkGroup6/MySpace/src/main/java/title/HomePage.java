package title;


import base.CommonAPI;
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
    public void HomePageLink(){
        SignInTab.click();
        FeatureTab.click();
        logoTab.click();
        SearchTab.click();
    }
}


