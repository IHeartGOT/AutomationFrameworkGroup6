package travelpage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class TravelPage extends CommonAPI {

    public TravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "main-menu_travel")
    WebElement TravelLink;

    @FindBy(css = "#mount > div > div:nth-child(2) > div.Header__container.Header__isShown > div > div > div.Header__navigation > a.Header__section.Header__active")
    WebElement DestinationLink;

    @FindBy(className = "\"Header__section Header__active\" ")
    WebElement FoodAndDrink;

    @FindBy(xpath = "//*[@id=\"mount\"]/div/div[1]/div[2]/div/div/div[2]/a[3]")
    WebElement PlayLink;

    @FindBy(css = "#mount > div > div.StickyTop__isStickyAd > div.Header__container.Header__isShown > div > div > div.Header__navigation > a:nth-child(4)")
    WebElement StayLink;

    public WebElement getDestinationLink(){
        return DestinationLink;
    }
    public WebElement getFoodAndDrink(){
        return FoodAndDrink;
    }
    public WebElement getPlayLink(){
        return PlayLink;
    }
    public WebElement getStayLink(){
        return StayLink;
    }
    public WebElement getTravelLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return TravelLink;
    }

    public void TravelPageLinks(){
        DestinationLink.click();
        FoodAndDrink.click();
        PlayLink.click();
        StayLink.click();

        TravelLink.click();
        String title= driver.getTitle();
        Assert.assertEquals(title, "");
    }
}
