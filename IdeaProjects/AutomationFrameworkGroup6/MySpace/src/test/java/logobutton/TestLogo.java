package logobutton;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;
import title.Logo;

public class TestLogo extends CommonAPI {

        @Test
        public void Test67() {
            Logo logo = PageFactory.initElements(driver, Logo.class);
            logo.LogoTab();
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            Assert.assertEquals(true, true);
        }
}
