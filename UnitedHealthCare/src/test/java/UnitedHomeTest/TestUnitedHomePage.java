package UnitedHomeTest;

import UnitedHome.UnitedHomePage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class TestUnitedHomePage extends CommonAPI {
    @Test
    public void testUHClogo(){
     clickByXpath("//img[@class='uhc-logo desktop-logo']");
    }
    @Test
    public void checkSearchText(){
        if(driver.getPageSource().contains("Search")){
            System.out.println("'Search' text exist before search box");
        }
        else{
            System.out.println("There is not Search text before  search box");
        }
    }
    @Test
    public void testSearchBox(){
        clickByXpath("//input[@id='q']");
    }
    @Test
    public void testSearchButton(){
        clickOnCss(".search-button");
    }
    @Test
    public void testProviderLink(){
        clickByXpath("//a[@href='https://www.uhcprovider.com/' and @class='at-element-click-tracking']");
    }
    @Test
    public void testBrokerLink(){
        clickByXpath("//a[@href='https://www.uhc.com/broker' and @class='at-element-click-tracking']");
    }
    @Test
    public void checkTextExist(){
        if(driver.getPageSource().contains("Already a member?")){
            System.out.println("'Already a member?' text exist upper right corner");
        }
        else {
            System.out.println("'Already a member?' is not exist in this webpage");
        }
    }
    @Test
    public void testClickOnSignIn(){
        clickOnCss("#loginmenubutton");
    }
    @Test
    public void testHomeButton(){
        clickOnCss(".top-menu1");
    }
    @Test
    public void testIndividualAndFamilies(){
        clickByXpath("//a[@title='Individuals & Families']");
    }
    @Test
    public void testEmployers(){
        clickOnCss(".top-menu3");
    }
    @Test
    public void testMedicare(){
        clickByXpath("//a[@href='/medicare' and @title='Medicare']");
    }
    @Test
    public void testFindAdoctor(){
        clickOnCss(".top-menu6");
    }
    public void checkFindaproviderText(){
        if(driver.getPageSource().contains("Find a provider")){
            System.out.println("'Find a provider'text exist");
        }
        else {
            System.out.println("'Find a provider' text is not existed in this page");
        }
    }
    @Test
    public void checkInsurancePlansandProductsTextExist(){
        if(driver.getPageSource().contains("Insurance Plans and Products")){
            System.out.println("'Insurance Plans and Products' text is exist in the main page");
        }
        else{
            System.out.println("'Insurance Plans and Products' not such text exist in the main page");
        }
    }
    @Test
    public void partABCD(){
        clickByXpath("//img[@src='/content/dam/uhcdotcom/en/Common/Images/Medicare-90.jpg']");
    }
    @Test
    public void checkMedicarePlansTextExist(){
        if(driver.getPageSource().contains("Medicare Plans")){
            System.out.println("'Medicare Plans' text exist in partABCD");
        }
        else{
            System.out.println("'Medicare Plans' is not exist  in partABCD");
        }
    }
    @Test
    public void clickOnLearnMore(){
        clickByXpath("//a[@href='/medicare.html']");
    }
    @Test
    public void clickOnViewPlan(){
        clickByXpath("//a[@href='https://www.aarpmedicareplans.com/health-plans.html?WT.mc_id=880332']");
    }
    @Test
    public void checkSmallBusinessPlansTextExist(){
        if(driver.getPageSource().contains("Small Business Plans")){
            System.out.println("'Small Business Plans' text exist next to Medicare Plans");
        }
        else {
            System.out.println("'Small Business Plans' text is not exist next to Medicare plans");
        }
    }
    @Test
    public void checkImage(){
        clickByXpath("//img[@class='wrap-text-right' and @src='/content/dam/uhcdotcom/en/Common/Images/Small-Business-90.jpg']");
    }
    @Test
    public void clickLearnMoreUnderSmallBusinessPlan(){
        clickByXpath("//a[@href='/employer/small-business.html']");
    }
    @Test
    public void checkIndividualFamilyPlansTextUnderMedicarePlan(){
       if(driver.getPageSource().contains("Individual & Family Plans")){
           System.out.println("'Individual & Family Plans' text exist under Medicare plans");
       }
       else {
           System.out.println("'Individual & Family Plans' text is not exist under Medicare plans");
       }
    }
    @Test
    public void clickOnLearnMoreUnderIndividualsAndFamilyPlan(){
        clickByXpath("//a[@aria-label='Learn More on Individual and Families']");
    }
}
