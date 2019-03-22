package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Links extends CommonAPI {

    @Test
    public void MotorClick(){
        clickByXpath ("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a");
    }

    @Test
    public void MyEbay(){
        clickByXpath ("//*[@id=\"gh-eb-My\"]/div/a[1]");
    }

    @Test
    public void ShoppingCart(){
        clickOnCss ("#gh-cart-i");
    }

}
