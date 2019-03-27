package PageObjectModel;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindInsuranceForIndividualAndFamilies extends CommonAPI {
    public FindInsuranceForIndividualAndFamilies() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Individuals & Families')]")
    WebElement IndividualAndFamiliesLink;
    @FindBy(xpath = "//span[contains(text(),'View Plans') and @class='button-primary-common button-digital-blue span-focus']")
    WebElement viewPlan;
    @FindBy(xpath = "//input[@type='tel' and @id='zipCode']")
    WebElement enterZipCode;
    public WebElement IndividualsAndFamilies(){
        return IndividualAndFamiliesLink;
    }
    public WebElement clickOnViewPlan(){
        return viewPlan;
    }
    public WebElement enterZipCodes(){
        return enterZipCode;
    }

}
