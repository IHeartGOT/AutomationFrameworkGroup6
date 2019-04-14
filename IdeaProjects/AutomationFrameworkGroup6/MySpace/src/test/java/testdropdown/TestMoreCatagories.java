package testdropdown;

import base.CommonAPI;
import dropdown.FreeLunch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMoreCatagories extends CommonAPI {
    @Test
    public void Test86() {

        FreeLunch freeLunch = PageFactory.initElements(driver, FreeLunch.class);
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        freeLunch.FreeLunch();
    }
}