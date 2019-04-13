package testkeyword;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import keyword.SearchKeyword;

public class TestSearchKeyword extends CommonAPI {

    @Test
    public void Test56() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar();

    }

    @Test
    public void Test57() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar2();

    }

    @Test
    public void Test58() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar3();

    }

    @Test
    public void Test59() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar4();

    }

    @Test
    public void Test60() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar5();

    }

    @Test
    public void Test61() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar6();

    }

    @Test
    public void Test62() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar7();

    }

    @Test
    public void Test63() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar8();
    }

    @Test
    public void Test64() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar9();
    }

    @Test
    public void Test65() {

        SearchKeyword searchKeyword = PageFactory.initElements(driver, SearchKeyword.class);
        searchKeyword.SearchBar10();

    }
}