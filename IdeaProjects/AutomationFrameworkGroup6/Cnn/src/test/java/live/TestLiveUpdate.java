package live;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import liveupdate.LiveUpdate;

public class TestLiveUpdate extends CommonAPI {

    @Test
    public void Test62() {

        LiveUpdate liveUpdate = PageFactory.initElements(driver, LiveUpdate.class);
        liveUpdate.LiveUpButton();
    }
    }
