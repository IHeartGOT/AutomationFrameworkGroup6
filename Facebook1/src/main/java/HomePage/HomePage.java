package HomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='u_c_1']/div/div[1]/em")
    public WebElement headingSettings;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_g_0']")
    public WebElement headingCreateGroup;

    @FindBy(name = "xhpc_message")
    public WebElement barPostStatus;

    @FindBy(className = "_1mf _1mj")
    public WebElement tfPostStatus;



    public  WebElement Heading(){
        return headingSettings;
    }
    public  WebElement HeadingCreatet(){
        return headingCreateGroup;
    }
    public  WebElement BarPost(){
        return barPostStatus;
    }
    public  WebElement TftPost(){
        return tfPostStatus;
    }



    public void HomePage1(){
        Heading().click();
        HeadingCreatet().click();
        BarPost().sendKeys("jhjvhvjhvhv", Keys.ENTER);
        TftPost().click();

    }

//
//    public void typePostStatusBar(String text, WebDriver driver) {
//        clickIfElementPresent(barPostStatus);
//        barPostStatus.click();
//        new Actions(driver).sendKeys(text).build().perform();
//    }
//    private void clickIfElementPresent(WebElement barPostStatus) {
//    }
}

