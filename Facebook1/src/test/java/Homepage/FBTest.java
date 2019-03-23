package Homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FBTest extends CommonAPI {

    @Test
    public void TestEmail() {
        typeByXpathEnter("//*[@id=\"email\"]", "sak2015@gmail.com");
    }
    @Test
    public void TestPass(){
        typeByXpathEnter("//*[@id=\"pass\"]", "123456");
    }
    @Test
    public void TestLogin(){
        clickByXpath("//*[@id=\"u_0_2\"]");
    }
    @Test
    public void TestFirstName(){
        typeByXpathEnter("//*[@id=\"u_0_n\"]","Saifan");
    }
    @Test
    public void TestLastName(){
        typeByXpath("//*[@id=\"u_0_p\"]","Khan");
    }
    @Test
    public void TestMobileNumber(){
        typeOnInputBox("//*[@id=\"u_0_s\"]","718578651");
    }
    @Test
    public void TestNewPass(){
        typeByXpathEnter("//*[@id=\'u_0_z\']", "654321");
    }
    @Test
    public void TestMale(){
        clickOnCss("#u_0_13 > span:nth-child(2) > label");
    }


}
