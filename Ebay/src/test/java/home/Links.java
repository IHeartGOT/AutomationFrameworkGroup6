package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Registration;


public class Links extends CommonAPI {

    @Test
    public void TestHomeLinks(){
        EHomePage eHomePage = PageFactory.initElements (driver, EHomePage.class);
        eHomePage.HomePageLinks ();
    }

    @Test
    public void TestRegister()throws InterruptedException {
        Registration registration = PageFactory.initElements (driver, Registration.class);
        registration.ResgistationPage ();
    }
}