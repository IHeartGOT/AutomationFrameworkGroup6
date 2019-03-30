package UnitedHomeTest;

import UnitedHome.UnitedHomePage;
import org.testng.annotations.Test;

public class HomePageTest extends UnitedHomePage {
    @Test
    public void testPage(){
        UnitedHomePage eu = new UnitedHomePage();
        eu.Logolink().click();
        eu.testSearchBox().click();
        eu.clickOnSearchButon().click();
        eu.clickOnBrokerLink().click();
        eu.clickOnEspanol().click();
        eu.clickOnSignIn().click();
    }


}
