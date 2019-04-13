package testmusicpage;

import base.CommonAPI;
import musicpage.Music;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestUploadMusic extends CommonAPI {

    @Test
    public void TestUplaodMusicTab() {
        Music music = PageFactory.initElements(driver, Music.class);
        music.UploadMusicPage();
    }
}