package pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCreditCard extends CommonAPI {

    @Test
    public void TestCreditCardPage(){
        CreditCardApp creditCardApp = PageFactory.initElements (driver, CreditCardApp.class);
        creditCardApp.CreditCardAppPage ();

    }
}
