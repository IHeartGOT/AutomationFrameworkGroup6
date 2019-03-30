package TestBrowseNYL;


import BrowseNYL.Signing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigningTest extends Signing {

    public SigningTest Signing;

    @BeforeMethod
    public void initElements(){
        Signing = (SigningTest) PageFactory.initElements(driver,Signing.class);
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





