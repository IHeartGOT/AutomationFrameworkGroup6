package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class SearchTest extends CommonAPI {

    @Test
    public void search()throws Exception, IOException, SQLException, ClassNotFoundException{
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
