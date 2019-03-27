package HomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import sun.misc.resources.Messages;
import sun.plugin.util.UserProfile;
import java.util.ArrayList;
import java.util.List;

public class MenuBar extends CommonAPI {

    @FindBy(how = How.XPATH,using = "html/body/div[1]/div[1]/div/div[1]/div/div/div/div/div/*/*")
    List<WebElement> elements = new ArrayList();
    private WebDriver driver = DriverFactory.getInstance().getDriver();
    public void clickFacebookLogo(){
        elements.get(0).click();
    }
    public void searchFacebook(String text){
        elements.get(1).sendKeys(text, Keys.ENTER);
    }
    public UserProfile getUserProfile(){
        elements.get(2).click();
        return new UserProfile();
    }
    public void getHomepage(){
        elements.get(3).click();
    }
    public FriendRequest getFriendsRequestTab(){
        elements.get(4).click();
        return new FriendRequest();
    }
    public Messages getMessages(){
        elements.get(5).click();
        return new Messages();
    }
    public Notifiactions getNotifications(){
        elements.get(6).click();
        return new Notifiactions();
    }
    public PrivacyShortcuts getPrivacyShortcuts(){
        elements.get(7).click();
        return new PrivacyShortcuts();
    }
    public YourAccount getYourAccount(){
        elements.get(8).click();
        return PageFactory.initElements(driver,YourAccount.class);
    }
    private class Notifiactions {
    }
}

