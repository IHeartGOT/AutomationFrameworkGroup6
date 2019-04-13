package articles;

import common.CommonAPI;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.home.MainPage;
import static common.CommonAPI.ad;

public class ArticleTest extends CommonAPI {

    @Test
    public void testArticles(){
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.goToArticles();
    }

}
