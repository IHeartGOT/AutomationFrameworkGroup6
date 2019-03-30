package testdropdown;

import base.CommonAPI;
import dropdown.FreeLunch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFreeLunch extends CommonAPI {
    @Test
    public void Test86() {

        FreeLunch freeLunch = PageFactory.initElements(driver, FreeLunch.class);
        freeLunch.FreeLunch();
    }
}