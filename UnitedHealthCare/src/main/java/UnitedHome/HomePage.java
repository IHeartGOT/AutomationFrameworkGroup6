package UnitedHome;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[@class='uhc-logo-container_link']//img[@class='uhc-logo desktop-logo']")
    WebElement MainLogo;

    public WebElement homePageMainLogo(){
        return MainLogo;
    }
}
