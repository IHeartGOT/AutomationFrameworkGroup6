package TestPageObjectModel;

import PageObjectModel.FindInsuranceForIndividualAndFamilies;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFindIndividualsAndFamilies extends FindInsuranceForIndividualAndFamilies {
    @Test(priority = 1)
    public void clickOnIndividualsAndFamiliesLink() {
        FindInsuranceForIndividualAndFamilies indvandfamilies = PageFactory.initElements(driver, FindInsuranceForIndividualAndFamilies.class);
        indvandfamilies.IndividualsAndFamilies().click();
        driver.navigate().forward();
        indvandfamilies.clickOnViewPlan().click();
        driver.navigate().to("https://www.uhone.com/shop/#/census");
        indvandfamilies.enterZipCodes().sendKeys("11372");

    }
//    @Test(priority = 2)
//    public void cleikOnViewPlans() {
//        FindInsuranceForIndividualAndFamilies indvandfamilies = PageFactory.initElements(driver, FindInsuranceForIndividualAndFamilies.class);
//        indvandfamilies.clickOnViewPlan().click();
//        driver.navigate().forward();
//
//    }
}