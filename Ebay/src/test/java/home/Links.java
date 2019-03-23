package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Links extends CommonAPI {

    @Test
    public void HomePageLinks(){

        EHomePage eh = new EHomePage();

        eh.MotorLink ().click ();
        eh.LoginLink ().click ();
        driver.navigate ().back ();
        eh.ShoppingLink ().click ();
        eh.SignInLink ().click ();
        eh.UserName ().sendKeys ("ProdipBhowmik");
        eh.Password ().sendKeys ("123456");
        eh.SignButton ();

    }
}