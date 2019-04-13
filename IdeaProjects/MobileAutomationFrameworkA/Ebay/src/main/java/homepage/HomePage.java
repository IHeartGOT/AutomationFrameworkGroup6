package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    public HomePage (){ PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]")
    WebElement brgrbtn;
    @FindBy(className = "_highlighter-box_6a798")
    WebElement searchBox;
    @FindBy(id = "com.ebay.mobile:id/recycler_view_main")
    WebElement messages;
    @FindBy(xpath = "/android.widget.TextView[@content-desc=\"Selling button\"]")
    WebElement selling;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Deals button\"]")
    WebElement deals;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]")
    WebElement categories;
    @FindBy(xpath="//android.widget.TextView[@text='Baby']")
    WebElement baby;
    @FindBy(xpath = "//android.widget.TextView[@text='FEATURED']")
    WebElement featured;

    public WebElement getBrgrbtn(){ return brgrbtn;
    }

    public WebElement getSearchBox(){ return getSearchBox();
    }

    public WebElement getMessages(){ return messages;
    }

    public WebElement getSelling(){ return selling;
    }

    public WebElement getDeals(){ return deals;
    }
    public WebElement getCategories(){ return categories;
    }

    public WebElement getBaby() { return baby;
    }

    public WebElement getFeatured() { return featured;
    }
    public void BRGRMenu(){ getBrgrbtn().click();
    }

    public void Search(){ getSearchBox().sendKeys("toys");
    }

    public void Messages(){ getMessages().click();
    }

    public void SellPage(){ getSelling().click();
    }

    public void DealPage(){ getDeals().click();
    }

    public void CategoriesPage(){
        getCategories().click();
        getBaby().click();
    }

    public void FeauturedPage(){
        getDeals().click();
        getFeatured().click();
    }

}
