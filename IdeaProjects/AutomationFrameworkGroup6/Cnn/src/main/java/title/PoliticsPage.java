package title;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoliticsPage extends CommonAPI {

    public PoliticsPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#nav > div > div.drawer > div.drawer__container.politics__drawer--navigation > ul.buckets > li.bucket.congress.selected.open > a")
    WebElement CongressLink;

    @FindBy(xpath = "//*[@id=\"nav\"]/div/div[2]/div[2]/ul[1]/li[3]/a")
    WebElement SupremeCourt;

    @FindBy(css = "#nav > div > div.drawer > div.drawer__container.politics__drawer--navigation > ul.buckets > li.bucket.facts-first.selected.open > a")
    WebElement FactFirst;

    public WebElement getCongressLink(){
        return CongressLink;
    }
    public WebElement getSupremeCourt(){
        return SupremeCourt;
    }
    public WebElement getFactFirst(){
        return FactFirst;
    }
    public void PoliticsPage(){
        CongressLink.click();
        SupremeCourt.click();
        FactFirst.click();
    }
}


