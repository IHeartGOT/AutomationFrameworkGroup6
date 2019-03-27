package UnitedHomeTest;

import UnitedHome.AllLinkInHomePage;
import UnitedHome.HomePage;
import UnitedHome.UnitedHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends AllLinkInHomePage {

  @Test(priority = 1)
  public void testHomePageLanguageLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageLanguageLink().click();
    driver.navigate().back();
  }
  @Test(priority = 2)
  public void testHomePageSignInLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageSignInlink().click();
    driver.navigate().back();

  }
  @Test(priority = 3)
  public void testhomePageHomeButton() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageHomeLink().click();
    driver.navigate().back();

  }
  @Test(priority = 4)
  public void testhomePageIndividualAndFamilyLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageIndividualAndFamilyLink().click();
    driver.navigate().back();
  }
  @Test(priority = 5)
  public void testhomehomePageEmployerLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageEmployerLink().click();
    driver.navigate().back();
  }
  @Test(priority = 6)
  public void testhomehomePageMedicareLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageMedicareLink().click();
    driver.navigate().back();
  }
  @Test(priority = 7)
  public void testHomePageFindDoctorsLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageFindDoctorsLink().click();
    driver.navigate().back();
  }
  @Test(priority = 8)
public void testSearchProviderlink() {
  AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
  homePage.homePageSearchProviderLink().click();
  driver.navigate().back();
 }
 @Test(priority = 9)
  public void testFindPlanlink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageFindOutMore().click();
    driver.navigate().back();
  }
  @Test(priority = 10)
  public void testIndividualslink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageCheckIndividualsLink().click();
    driver.navigate().back();
  }
  @Test(priority = 11)
  public void testEmployersLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageEmployees().click();
    driver.navigate().back();
  }
  @Test(priority = 12)
  public void testLearnMoreLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageLearnMore().click();
    driver.navigate().back();
  }
  @Test(priority = 13)
  public void testViewsPlans() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePagePlanUnderMedicare().click();
    driver.navigate().back();
  }
  @Test(priority =14)
  public void testLearnMoreUnderSmallBusiness() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageLearnMoreUnderstandSmallBusiness().click();
    driver.navigate().back();
  }
  @Test(priority = 15)
  public void testLearnMoreUndeIndividuals() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageLearnIndvidualFamilyLink().click();
    driver.navigate().back();
  }
  @Test(priority = 16)
  public void testLearnMoreIndividualsAndFamily() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageLearnMores().click();
    driver.navigate().back();
  }
  @Test(priority = 17)
  public void testLearnMoreUnderDentalPlan() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageDentalPlan().click();
    driver.navigate().back();
  }
  @Test(priority = 18)
    public void testViewDentalPlan() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePagePlan().click();
        driver.navigate().back();
    }
    @Test(priority = 19)
    public void testLearnMoreShortTermIns() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageMorePlan().click();
        driver.navigate().back();
    }
    @Test(priority = 20)
    public void testViewPlandShortTermIns() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageViewPlanUnterShortTerm().click();
        driver.navigate().back();
    }
    @Test(priority = 21)
    public void testLearnMoreUnderMedicaid() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageUnderMedicaidPlan().click();
        driver.navigate().back();
    }
    @Test(priority = 22)
    public void testHospitalAndDoctorIns() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePaeHospitalandDoctoreInsur().click();
        driver.navigate().back();
    }
    @Test(priority = 23)
    public void testCriticalHealthIns() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageCriticalIllnessInsurance().click();
        driver.navigate().back();
    }
    @Test(priority = 24)
    public void testSuplimentalIns() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageSuplimentalInsurance().click();
        driver.navigate().back();
    }
    @Test(priority = 25)
    public void testVisinInsLink() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageVisonInsurance().click();
        driver.navigate().back();
    }
    @Test(priority = 26)
    public void testAccidentInsurance() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageAccidentalInsurance().click();
        driver.navigate().back();
    }
    @Test(priority = 28)
    public void testGlobalInsurance() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageTermLifeInsurace().click();
        driver.navigate().back();
    }
    @Test(priority = 29)
    public void testHospitalizationIns() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageHospitalizationIns().click();
        driver.navigate().back();
    }
    @Test(priority = 30)
    public void testGlobalTravelIns() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageGlobalTravelIns().click();
        driver.navigate().back();
    }
    @Test(priority = 31)
    public void testAccessProviderPortal() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageAccessProviderPortal().click();
        driver.navigate().back();
    }
    @Test(priority = 32)
    public void testBrokerResource() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageBrokerResource().click();
        driver.navigate().back();
    }
    @Test(priority = 33)
    public void testNearByClinic() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageNearByClinic().click();
        driver.navigate().back();
    }
    @Test(priority = 34)
    public void testMarketPlaceInsurace() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageMarketPlaceIns().click();
        driver.navigate().back();
    }
    @Test(priority = 35)
    public void testFitness() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageFitness().click();
        driver.navigate().back();
    }
    @Test(priority = 36)
    public void testOpenEnrolment() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageOpenEnrolment().click();
        driver.navigate().back();
    }
    @Test(priority = 37)
    public void testLanguageAssistance() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageLanguageAssistant().click();
        driver.navigate().back();
    }
    @Test(priority = 38)
    public void testMedicare() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageMedicares().click();
        driver.navigate().back();
    }
    @Test(priority = 39)
    public void testNutritions() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageNutrition().click();
        driver.navigate().back();
    }
    @Test(priority = 40)
    public void testMemberResource() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageMemberResource().click();
        driver.navigate().back();
    }
    @Test(priority = 41)
    public void testAssistenciaDeIdiomsa() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageAssistenciaDeIdiomsa().click();
        driver.navigate().back();
    }
    @Test(priority = 42)
    public void testPageMedicaid() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageMedicaid().click();
        driver.navigate().back();
    }
    @Test(priority = 43)
    public void testHealthTopics() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageHealthTopics().click();
        driver.navigate().back();
    }
    @Test(priority = 44)
    public void testAboutUs() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageAboutUs().click();
        driver.navigate().back();
    }
    @Test(priority = 45)
    public void testEmpGroupPlan() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageEmplyerGroupPlan().click();
        driver.navigate().back();
    }

    @Test(priority = 47)
    public void testUnitedForReform() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageUnitedForReform().click();
        driver.navigate().back();
    }
    @Test(priority = 48)
    public void testDentalInss() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageDentalInsurace().click();
        driver.navigate().back();
    }
    @Test(priority = 49)
    public void testHealthAndWellness() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageHealthAndWellness().click();
        driver.navigate().back();
    }
    @Test(priority = 49)
    public void testValueBasedCare() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageValueBasedCare().click();
        driver.navigate().back();
    }
    @Test(priority = 50)
    public void testVisionInsurance() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageVisionInsurace().click();
        driver.navigate().back();
    }
    @Test(priority = 51)
    public void testProgramAndTools() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageProgramAndTools().click();
        driver.navigate().back();
    }
    @Test(priority = 52)
    public void testDrugList() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePaeViewDruglist().click();
        driver.navigate().back();
    }
    @Test(priority = 53)
    public void testFindADoctor() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageFindADoctor().click();
        driver.navigate().back();
    }
    @Test(priority = 54)
    public void testShortTermHealthIns() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageShortTermInsurace().click();
        driver.navigate().back();
    }
    @Test(priority = 55)
    public void testDownLoadApp() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageDownLoadHealthForMe().click();
        driver.navigate().back();
    }
    @Test(priority = 56)
    public void testPrintIDcard() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePagePrintIdCared().click();
        driver.navigate().back();
    }
    @Test(priority = 57)
    public void testBrokerResources() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageBrokerResources().click();
        driver.navigate().back();
    }
    @Test(priority = 58)
    public void testViewClains() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageViewClaim().click();
        driver.navigate().back();
    }
    @Test(priority = 59)
    public void testClearGlocery() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageJustPlainGlocdry().click();
        driver.navigate().back();
    }
    @Test(priority = 60)
    public void testCheckBenefit() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageBenefit().click();
        driver.navigate().back();
    }
    @Test(priority = 61)
    public void testNewsRoom() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageNewsRoom().click();
        driver.navigate().back();
    }
    @Test(priority = 62)
    public void testContactUs() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageContactUs().click();
        driver.navigate().back();
    }
    @Test(priority = 63)
    public void testCareers() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageCarrears().click();
        driver.navigate().back();
    }
    @Test(priority = 64)
    public void testHealthCareFraud() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageHealthCareFraud().click();
        driver.navigate().back();
    }
    @Test(priority = 65)
    public void testLegal() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageLegal().click();
        driver.navigate().back();
    }
    @Test(priority = 66)
    public void testPrivecy() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePagePrvacy().click();
        driver.navigate().back();
    }
    @Test(priority = 67)
    public void testTermsOfUse() {
        AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
        homePage.homePageTermsOfUse().click();
        driver.navigate().back();
    }
}