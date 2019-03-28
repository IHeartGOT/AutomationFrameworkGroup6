package UserProfile;

import HomePage.MenuBar;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class UserProfile extends CommonAPI {

    public void getUserProfile() {
        MenuBar MenuBar = PageFactory.initElements(driver, MenuBar.class);
        MenuBar.getUserProfile();
    }
}