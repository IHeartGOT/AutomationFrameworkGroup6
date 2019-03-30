package TestBrowseNYL;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchesTest extends CommonAPI {


//    public class SearchesTest extends BrowseNYL.Searches {


        SearchesTest searches;

        @BeforeMethod
        public void initElements() {

            searches = PageFactory.initElements(driver, SearchesTest.class);
        }

        @Test
        public void usingSearchBarTest() {
            searches.usingSearchBarTest();
        }

        @Test
        public void searchbuttonTest() {
            searches.initElements();
        }
}
