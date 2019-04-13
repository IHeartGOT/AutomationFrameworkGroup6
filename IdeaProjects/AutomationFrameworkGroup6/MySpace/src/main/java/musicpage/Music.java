package musicpage;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class Music extends CommonAPI {

    public Music () { PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[@class='upload-music']")
    WebElement UploadMusic;

    public WebElement UploadMusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return UploadMusic;
    }
    public void UploadMusicPage() {
        UploadMusic().click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Upload Music");
        }

        @FindBy(xpath = "//*[@id=\"songs-tab\"]/a")
        WebElement SongsTab;
    public WebElement Songs(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return SongsTab;
    }
    public void  SongsPage(){
        Songs().click();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://myspace.com/discover/songs");
    }

    @FindBy(xpath = "//a[@href='/discover/albums'] ")
    WebElement AlbumTab;
    public  WebElement Album() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return AlbumTab;
    }
    public void AlbumPage(){
        Album().click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "albums-tab");
    }

    @FindBy(id = "artists-tab")
    WebElement ArtistTab;
    public WebElement ArtistLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return ArtistTab;
    }
    public void ArtistPage(){
        ArtistLink().click();
        String title = driver.getTitle();
        Assert.assertEquals(title, " Artists");
    }
    }


