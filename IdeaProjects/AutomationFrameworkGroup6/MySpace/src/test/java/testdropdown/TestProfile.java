package testdropdown;

import base.CommonAPI;
import dropdown.FreeLunch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sun.java2d.cmm.Profile;

public class TestProfile extends CommonAPI {

    @Test
    public void Test87() {

        Profile profile = PageFactory.initElements(driver, Profile.class);
        profile.getClass();
    }
}
