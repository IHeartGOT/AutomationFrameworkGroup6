package TestBrowseNYL;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMiscellaneous extends CommonAPI {




    @Test
    public void getDealsUtility() { getDealsUtility(); }

    //@Test
   // public void getDealsUtility () { getDealsUtility();}


    @Test
    public void getBusinessAndIndustrialUtility() {getBusinessAndIndustrialUtility();}
    //@Test
    //public void getBusinessAndIndustrialUtility() {getBusinessAndIndustrialUtility(); }
    //@Test
    //public void getUserIdInputBar() {getUserIdInputBar(); }

    @Test
    public void getUserIdInputBar() { getUserIdInputBar();}
    //@Test
    //public void getSignInButton() {getSignInButton(); }

    @Test
    public void getSignInButton() { getSignInButton (); }
   // @Test
    //public void getPasswordInputBar() {getPasswordInputBar(); }

    @Test
    public void getPasswordInputBar() { getPasswordInputBar(); }

    @Test
    public void musicUtility() { musicUtility();
    }

    @Test
    public void dealsUtility() { dealsUtility(); }

    @Test
    public void under10Utility() { under10Utility(); }

    //@Test
    //public void test10Test() {
       // TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object().getClass().getEnclosingMethod().getName()));

    }




    /*@Test
    public void test1() { 
        String title = driver.getTitle(); 
        Assert.assertEquals(title, "");  
    }  

@Test
    public void test2() { 

        driver.findElement(By.className("m-menu-logo")).click(); 
    }  

@Test
    public void test3() { 

        driver.findElement(By.className("m-menu-global-section")).click(); 
    }  

@Test
    public void test4() { 
        driver.findElement(By.cssSelector("body > div.page-wrapper > div.header-modules > header > div.m-menu-wrapper > div > nav > ul > li:nth-child(1) > div > a")).click(); 
    }  

@Test
    public void test5() { 

        driver.findElement(By.cssSelector("a[class*=live]")).click();  
    }  
@Test

    public void test6() { 
        driver.findElement(By.cssSelector("body > div.page-wrapper > main > div > section.module.m-my-list-empty-cta.module-row.row.shown > div > div > h2")).click();  
    }  

@Test
    public void test7() { 

        driver.findElement(By.className("icon light-grey abc-icon-googleplus")).click();  
    }  
@Test

    public void test8() { 
        driver.findElement(By.cssSelector("body > div.page-wrapper > main > div > section.module.m-my-list-empty-cta.module-row.row.shown > div > article > span > a")).click(); }  

@Test
    public void test9() { 

        driver.findElement(By.className("extra-light grey lowercase")).click();  
    } */





