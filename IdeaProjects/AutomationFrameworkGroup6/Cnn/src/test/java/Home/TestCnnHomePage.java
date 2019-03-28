package Home;

import base.CommonAPI;
import org.omg.CORBA.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;
import title.CnnHomePage;

public class TestCnnHomePage extends CommonAPI {



    /*public void test1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod()
        String title = driver.getTitle();
        Assert.assertEquals(this, "cnn.com: a news agency");
    }*/

    @Test
    public void TestCnnHomePage(){
        CnnHomePage cnnHomePage = PageFactory.initElements (driver, CnnHomePage.class);
        cnnHomePage.getUSLink();
       // Assert.assertEquals (true, true);
}


}