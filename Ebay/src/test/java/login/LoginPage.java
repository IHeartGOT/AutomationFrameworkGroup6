package login;

import base.CommonAPI;
import org.testng.annotations.Test;

public class LoginPage extends CommonAPI {
    @Test
    public void LoginInput(){
        clickOnCss (".gh-eb-li-a");
        typeOnID ("userid", "Prodip Bhowmik");



    }
}
