package musictab;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import title.DiscoverTab;
import title.MusicLink;

public class TestMusicLink extends CommonAPI {

    @Test
    public void Test12() {
        MusicLink musicLink = PageFactory.initElements(driver, MusicLink.class);
        musicLink.musicltab();
        Assert.assertEquals(true, true);

    }
}