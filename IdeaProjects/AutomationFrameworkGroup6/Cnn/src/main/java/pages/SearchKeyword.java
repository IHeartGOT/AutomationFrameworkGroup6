package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchKeyword extends CommonAPI {

    public SearchKeyword() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-button")
    WebElement search;

    @FindBy(id = "search-input-field")
    WebElement searchBox;

    public WebElement SearchButton() {
        return search;
    }

    public WebElement SearchType() {
        return searchBox;
    }


    public void SearchBar() {
        SearchButton().click();
        SearchType().sendKeys("Trump", Keys.ENTER);
    }

    public void SearchBar2() {
        SearchButton().click();
        SearchType().sendKeys("Clinton", Keys.ENTER);
    }

    public void SearchBar3() {
        SearchButton().click();
        SearchType().sendKeys("George Bush", Keys.ENTER);
    }

    public void SearchBar4() {
        SearchButton().click();
        SearchType().sendKeys("Mueller", Keys.ENTER);
    }

    public void SearchBar5() {
        SearchButton().click();
        SearchType().sendKeys("New York", Keys.ENTER);
    }

    public void SearchBar6() {
        SearchButton().click();
        SearchType().sendKeys("Bangladesh", Keys.ENTER);
    }

    public void SearchBar7() {
        SearchButton().click();
        SearchType().sendKeys("India", Keys.ENTER);
    }
    public void SearchBar8() {
        SearchButton().click();
        SearchType().sendKeys("New York Times", Keys.ENTER);
    }
    public void SearchBar9() {
        SearchButton().click();
        SearchType().sendKeys("Boston", Keys.ENTER);
    }
    public void SearchBar10() {
        SearchButton().click();
        SearchType().sendKeys("Hillary Clinton", Keys.ENTER);
    }
}
