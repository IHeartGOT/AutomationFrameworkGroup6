package searchdropdowns;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VideoGamesConsoles extends CommonAPI {


    public VideoGamesConsoles() {

        PageFactory.initElements (driver, this);
    }

    public void VideoGamingPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("xbox");
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("1249");
        driver.findElement (By.id ("gh-btn")).click ();

    }
}
