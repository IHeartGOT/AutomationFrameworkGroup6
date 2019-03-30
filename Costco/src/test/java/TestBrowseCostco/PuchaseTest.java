package TestBrowseCostco;
import org.openqa.selenium.support.PageFactory;
import BrowseCostco.Purchase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PuchaseTest extends Purchase {

        Purchase purchase;

        @BeforeMethod
        public void initElements(){
            purchase = PageFactory.initElements(driver, Purchase.class);
        }
        @Test
        public void purchaseAnItemTest(){
            purchaseAnItem();
        }
    }


