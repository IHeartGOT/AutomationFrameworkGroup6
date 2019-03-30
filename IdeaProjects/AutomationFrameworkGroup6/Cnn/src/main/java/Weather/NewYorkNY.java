package Weather;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewYorkNY extends CommonAPI {

    public NewYorkNY() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "el-weather__footer-location js-el-weather__footer-location")
    WebElement NewYorkNYWeatherTab;

    @FindBy(name = "fahrenheit ")
    WebElement Fahrenhite;

    public WebElement getNewYorkNYWeatherTab(){
        return NewYorkNYWeatherTab;
    }
    public void weatherTab(){
        NewYorkNYWeatherTab.sendKeys("NYWeather", Keys.ENTER);
    }
    public WebElement getFahrenhite(){
        return Fahrenhite;
    }
    public void FahrenhiteTab(){
        Fahrenhite.sendKeys("Fahrenhite",Keys.ENTER);
    }

}
