package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void HomePageLinks() {

        HomePage h = new HomePage ();
        h.AllDept ().click ();
        h.SearchBox ().sendKeys ("plumbing", Keys.ENTER);
        h.ShoppingCart ().click ();
        h.Signin ().click ();
        h.EmailAddress ().sendKeys ("ptbhowmik@gmail.com");
        h.Password ().sendKeys ("123456", Keys.ENTER);


    }
}



