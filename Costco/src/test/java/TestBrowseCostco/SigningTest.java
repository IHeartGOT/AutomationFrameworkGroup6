package TestBrowseCostco;
import BrowseCostco.Signing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import TestBrowseCostco.SigningTest;
public class SigningTest {


    public class signInTest extends Signing {

        public signInTest Signing;

        @BeforeMethod
        public void initElements(){
            Signing = (signInTest) PageFactory.initElements(driver,Signing.class);
        }
        @Test
        public void signInTest(){
            signIn();
        }
        @Test
        public void registerTest(){
            registerNewUser();
        }


    }



}
