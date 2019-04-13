package entertainment;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEntertainment extends CommonAPI {
    @Test
    public void Test63() {
        Entertainment entertainment = PageFactory.initElements(driver, Entertainment.class);
        entertainment.EntertainmentPage();

    }
}
