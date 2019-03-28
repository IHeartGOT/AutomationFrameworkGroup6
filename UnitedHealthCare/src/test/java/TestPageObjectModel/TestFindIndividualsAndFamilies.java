package TestPageObjectModel;

import PageObjectModel.FindInsuranceForIndividualAndFamilies;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFindIndividualsAndFamilies extends FindInsuranceForIndividualAndFamilies {
    @Test
    public void clickOnIndividualsAndFamiliesLink() {
        FindInsuranceForIndividualAndFamilies indvandfamilies = PageFactory.initElements(driver, FindInsuranceForIndividualAndFamilies.class);
        indvandfamilies.clickOnIndividualsAndFamiliesLink();
        indvandfamilies.clickOnFindPlan();
        driver.navigate().to("https://www.uhccommunityplan.com/");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        indvandfamilies.enterzipCode();
        indvandfamilies.clickOnSearchButton();
        driver.navigate().to("https://www.uhccommunityplan.com/ny.html");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        //indvandfamilies.clickOnSearchPlanButton();
        //indvandfamilies.dropDownList();
        //indvandfamilies.clickContinueSearchButton();
        // indvandfamilies.clickOnEnrollInaPlan();
        indvandfamilies.clickOnviewPlanDetails();
    }

}