package TestBrowseCostco;

import BrowseCostco.HomepageUtilities;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static BrowseCostco.HomepageUtilities.homeButton;


public class HomepageUtilitiesTest extends CommonAPI {

    HomepageUtilities homepage;
    String url = "http://www.costco.com/";

    @BeforeClass
    public void init(){
        driver.get(url);
        homepage = PageFactory.initElements(driver,HomepageUtilities.class);
    }

    @Test
    public void homeButtonTest() {

        homepage.homeButton();
    }


    //Must be signed in
//    @Test
//    public void savedUtilityTest() {
//        homepage.savedUtility();
//    }
//
//    @Test
//    public void motorsUtilTest() {
//        motorsUtility();
//    }
//
//    @Test
//    public void fashionUtilityTest() {
//        fashionUtility();
//    }
//
//    @Test
//    public void electronicsUtilityTest() {
//        electronicsUtility();
//    }
//
//    @Test
//    public void collectiblesAndArtTest() {
//        collectiblesAndArt();
//    }
//
//    @Test
//    public void homeAndGardenTest() {
//        homeAndGarden();
//    }
//
//    @Test
//    public void sportingGoodsTest() {
//        sportingGoodsUtility();
//    }
//
//    @Test
//    public void toysUtilityTest() {
//        toysUtility();
//    }
//
//    @Test
//    public void businessAndIndustrialUtilityTest() {
//        businessAndIndustrialUtility();
//    }
//
//    @Test
//    public void musicUtilityTest() {
//        musicUtility();
//    }
//
//    @Test
//    public void dealsUtilityTest() {
//        dealsUtility();
//    }
//
//    @Test
//    public void under10utilityTest() {
//        under10Utility();
//    }
//
//
//    @Test
//    public void Test() {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object().getClass().getEnclosingMethod().getName()));
//
//    }



   /* @Test
    public void test1() { 
        String title = driver.getTitle(); 
        Assert.assertEquals(title, "");  



        @Test
        public void test2 () { 

            driver.findElement(By.className("m-menu-logo")).click(); 
        }  

        @Test

        public void test3 () { 

            driver.findElement(By.className("m-menu-global-section")).click(); 
        }  

        @Test
        public void test4 () { 
            driver.findElement(By.cssSelector("body > div.page-wrapper > div.header-modules > header > div.m-menu-wrapper > div > nav > ul > li:nth-child(1) > div > a")).click(); 
        }  

        @Test
        public void test5 () { 

            driver.findElement(By.cssSelector("a[class*=live]")).click();  
        }  

        @Test
        public void test6 () { 
            driver.findElement(By.cssSelector("body > div.page-wrapper > main > div > section.module.m-my-list-empty-cta.module-row.row.shown > div > div > h2")).click();  
        }  

        @Test
        public void test7 () { 

            driver.findElement(By.className("icon light-grey abc-icon-googleplus")).click();  
        }  

        @Test
        public void test8 () { 
            driver.findElement(By.cssSelector("body > div.page-wrapper > main > div > section.module.m-my-list-empty-cta.module-row.row.shown > div > article > span > a")).click(); }  
    }
@Test
public void test9() { 

            driver.findElement(By.className("extra-light grey lowercase")).click();  
        }

@Test
public void test10() { 

            driver.findElement(By.id("header_sign_in")).click(); 
            driver.findElement(By.id("logonId")).sendKeys("prabet@costco.com"); 
            //driver.findElement(By.className("error")).sendKeys("bad email"); 
            driver.findElement(By.name("logonPassword")).sendKeys("123456"); 
            driver.findElement(By.linkText("Forgot Password?")).click(); 
        }


@Test


public void test10() {
//driver.findElement((By.id("header_sign_in")).click():
        }
public void test11(){
        driver.findElement(By.id("header_sign_in")).click();
        driver.findElement(By.id("logonId")).sendKeys("prabet@costco.com");
        //driver.findElement(By.className("error")).sendKeys("bad email");
        driver.findElement(By.name("logonPassword")).sendKeys("123456");
        driver.findElement(By.linkText("Forgot Password?")).click();
        }
        }*/


}








