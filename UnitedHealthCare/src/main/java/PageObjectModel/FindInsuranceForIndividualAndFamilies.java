package PageObjectModel;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindInsuranceForIndividualAndFamilies extends CommonAPI {
    public FindInsuranceForIndividualAndFamilies() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Individuals & Families')]")
    WebElement IndividualAndFamiliesLink;
    @FindBy(xpath = "//span[@class='arrow-link']//a[contains(text(),'Find Plans') and @href='https://www.uhccommunityplan.com/']")
    WebElement findPlanUnderMedicaid;
    @FindBy(xpath = "//input[@class='cp-element-textinput numeric-only' and @name='zipCode']")
    WebElement enterZipCode;
    @FindBy(xpath = "//button[@class='cp-button cp-button-primary next-btn']")
    WebElement searchButton;
    @FindBy(xpath = "//a[@class='cp-button cp-button-primary c-button']")
    WebElement clickButton;
    @FindBy(css = ".c-button cp-button cp-button-primary")
    WebElement clickContinueSearchButton;
    @FindBy(css = ".c-button c-button--orange enrlBtn")
    WebElement clickOnEnrollInaPlan;
    @FindBy(xpath = "//a[@class='c-button u-m-r-sm' and @href='/ny/medicare/2019/dual-complete-hmo-snp.html']")
    WebElement clickOnviewPlanDetails;
    @FindBy(css = ".cp-element-textinput c-input numeric-only")
    WebElement lookUpZipCodes;
    public void clickOnIndividualsAndFamiliesLink(){
        driver.findElement(By.xpath("//a[contains(text(),'Individuals & Families')]")).click();
    }
    public void clickOnFindPlan(){
        driver.findElement(By.xpath("//span[@class='arrow-link']//a[contains(text(),'Find Plans') and @href='https://www.uhccommunityplan.com/']")).click();
    }
    public void enterzipCode(){
        driver.findElement(By.xpath("//input[@class='cp-element-textinput numeric-only' and @name='zipCode']")).sendKeys("11371");
    }
    public void clickOnSearchButton(){
        driver.findElement(By.xpath("//button[@class='cp-button cp-button-primary next-btn']")).click();
    }
    public void lookUpZipCodes(){
        driver.findElement(By.xpath("//input[@class='cp-element-textinput c-input numeric-only']")).sendKeys("11371");

    }
    public void clickOnSearchPlanButton(){
        driver.findElement(By.cssSelector(".cp-button cp-button-primary c-button")).click();
    }
    public void dropDownList(){
        driver.findElement(By.cssSelector(".c-select sb-dropdown states-with-plans")).sendKeys("New York");
    }
    public void clickContinueSearchButton(){
        driver.findElement(By.cssSelector(".c-button cp-button cp-button-primary")).click();
    }
    public void clickOnEnrollInaPlan(){
           try {
               driver.findElement(By.xpath("//a[@class='c-button c-button--orange enrlBtn' and @href='/enroll-in-plan.html/welcome']")).click();
           }
           catch (Exception e){
               driver.findElement(By.xpath("//a[@class='c-button u-m-r-sm' and @href='/ny/medicare/2019/dual-complete-hmo-snp.html']")).click();
           }
    }
//    public void clickOnviewPlanDetails(){
//        driver.findElement(By.xpath("//a[@href='/ny/medicare/2019/dual-complete-hmo-snp.html' and @class='c-button u-m-r-sm']")).click();
//    }
    public void clickOnCheckBox(){

    }

}
