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
        //driver.navigate().to("https://www.uhccommunityplan.com/enroll-in-plan.html/steps/medicare-information");
        //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        indvandfamilies.lookUpZipCodes();
       // indvandfamilies.clickOnSearchPlanButton();
       // indvandfamilies.dropDownList();
        //indvandfamilies.clickContinueSearchButton();
        indvandfamilies.clickOnEnrollInaPlan();
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        //driver.navigate().to("https://www.uhccommunityplan.com/ny/medicare/2019/dual-complete-hmo-snp.html");
        //indvandfamilies.clickOnviewPlanDetails();
        //driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
    }

}