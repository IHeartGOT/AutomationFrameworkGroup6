package title;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends CommonAPI {

    By search  = By.id("searchQuery");
    By logo = By.xpath("//*[@id=\"searchQuery\"]/span");



    public WebElement SearchButton(){

        return driver.findElement(search);
    }
    public WebElement LogoButton() {

        return driver.findElement(logo);
    }


}
