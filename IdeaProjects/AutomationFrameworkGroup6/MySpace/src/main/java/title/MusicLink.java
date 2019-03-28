package title;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MusicLink extends CommonAPI {

    public MusicLink() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"unifiedSidebar\"]/div[1]/nav/ul/li[2]/a/span")
    WebElement music;

    public WebElement getMusic(){
        return music;
    }
    public void musicltab(){
        getMusic().click();

    }

}
