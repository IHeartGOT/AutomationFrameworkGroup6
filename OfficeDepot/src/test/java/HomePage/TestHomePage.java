package HomePage;

import Home.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage= PageFactory.initElements(driver,HomePage.class);
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();

    }
    @Test
    public void testLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkLogo();
    }
    @Test(enabled=false)
    public void testOfficeSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkOfficeSupplies();
    }
    @Test(enabled=false)
    public void testPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPaper();
    }
    @Test(enabled=false)
    public void testDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkDeals();
    }
    @Test(enabled=false)
    public void testBreakRoom() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkBreakroom();
    }
    @Test(enabled=false)
    public void testCleaning() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCleaning();
    }
    @Test(enabled=false)
    public void testTechnology() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkTechnology();
    }
    @Test(enabled=false)
    public void testFurniture() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkFurniture();
    }
    @Test(enabled=false)
    public void testSchoolSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkSchoolSupplies();
    }
    @Test(enabled=false)
    public void testPrintPlusCopy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPrintPlusCopy();
    }
    @Test(enabled=false)
    public void testServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkServices();
    }
    @Test(enabled=false)
    public void testAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkAccount();
    }
    @Test(enabled=false)
    public void testIdeas(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPopup();
        homePage.checkIdeas();
        homePage.checkPopUp2();

    }
    @Test(enabled=false)
    public void testStores() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkStores();
        homePage.checkPopup();
        homePage.checkDeals();
    }
    @Test(enabled=false)
    public void testCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCart();
    }
    @Test(enabled=false)
    public void testOffer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkOffer();
    }
    @Test(enabled=false)
    public void testFaqs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkFaqs();
    }
    @Test(enabled=false)
    public void testReturnAnItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkReturnAnItem();
    }
    @Test(enabled=false)
    public void TestContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkContactUs();
    }
    @Test(enabled=false)
    public void TestCheckOrderStaus() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkOrderStaus();
    }
    @Test(enabled=false)
    public void TestPriceMatchPolicy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPriceMatchPolicy();
    }
    @Test(enabled=false)
    public void TestCorporateSustainability() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCorporateSustaiNability();
    }
    @Test(enabled=false)
    public void TestCareers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCareers();
    }
    @Test(enabled=false)
    public void TestSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPopup();
        homePage.checkSearchBox();

    }
    @Test(enabled=false)
    public void checkComplianceAndEthics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkComplianceAndEthics();
    }
    @Test(enabled=false)
    public void checkDiversity() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkDiversity();
    }
    @Test(enabled=false)
    public void checkInvestorRelations () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkInvestorRelations ();
    }
    @Test(enabled=false)
    public void checkMediaRelations () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkMediaRelations ();
    }
    @Test(enabled=false)
    public void checkPatents () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPatents();
    }
    @Test(enabled=false)
    public void checkRealEstateListing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkRealEstateListing();
    }
    @Test(enabled=false)
    public void checkCASupplyChainDisclosure() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCASupplyChainDisclosure();
    }
    @Test(enabled=false)
    public void checkCommunityInvestment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCommunityInvestment();
    }
    @Test(enabled=false)
    public void checkStoreLocator() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkStoreLocator();
    }
    @Test(enabled=false)
    public void checkResourceServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkResourceServices();
    }
    @Test(enabled=false)
    public void checkOnlineCatalogs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkOnlineCatalogs();
    }
    @Test(enabled=false)
    public void checkRebates() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkRebates();
    }
    @Test(enabled=false)
    public void checkEmployeeBusinesses() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkEmployeeBusinesses();
    }
    @Test(enabled=false)
    public void checkOrderByItemNumber() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkOrderByItemNumber();
    }
    @Test(enabled=false)
    public void checkWriteProductReview() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkWriteProductReview();
    }
    @Test(enabled=false)
    public void checkBlackFriday2018() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkBlackFriday2018();
    }
    @Test(enabled=false)
    public void checkSubscriptions() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkSubscriptions();
    }
    @Test(enabled=false)
    public void checkRecallNotices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkRecallNotices();
    }
    @Test(enabled=false)
    public void checkGreenerOfficeProducts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkGreenerOfficeProducts();
    }
    @Test(enabled=true)
    public void checkTechServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkTechServices();
    }
    @Test(enabled=true)
    public void checkAffiliateProgram() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkAffiliateProgram();
    }
    @Test(enabled=true)
    public void checkPartnerProgram() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPartnerProgram();
    }
    @Test(enabled=true)
    public void checkGiveBackToSchoolProgram () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkGiveBackToSchoolProgram ();
    }
    @Test(enabled=true)
    public void checkGovernmentPrograms () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkGovernmentPrograms();
    }
    @Test(enabled=true)
    public void checkAssociateDiscount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkAssociateDiscount();
    }
    @Test(enabled=true)
    public void checkStoreCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkStoreCreditCards();
    }

    @Test(enabled=true)
    public void checkStorePickup() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkStorePickup();
    }
    @Test(enabled=true)
    public void checkOrderOnline() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkOrderOnline();
    }
    @Test(enabled=true)
    public void checkTermsOfUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkTermsOfUse();
    }
    @Test(enabled=true)
    public void checkPrivacyPolicy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPrivacyPolicy();
    }
    @Test(enabled=true)
    public void checkOfficeDepotTrackingTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkOfficeDepotTrackingTools();
    }
    @Test(enabled=true)
    public void checkOfficeDepotAnywhere() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkOfficeDepotAnywhere();
    }
    @Test(enabled=true)
    public void checkGrandAndToyCanada() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkGrandAndToyCanada();
    }
    @Test(enabled=true)
    public void checkArtAndCrafting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkArtAndCrafting();
    }
    @Test(enabled=true)
    public void checkBagsAndLuggage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkBagsAndLuggage();
    }
    @Test(enabled=true)
    public void checkBasicSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkBasicSupplies();
    }
    @Test(enabled=true)
    public void checkBindersAndAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkBindersAndAccessories();
    }
    @Test(enabled=true)
    public void checkCalendarsAndPlanners() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCalendarsAndPlanners();
    }
    @Test(enabled=true)
    public void checkDeskAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkDeskAccessories();
    }
    @Test(enabled=true)
    public void checkDrafting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkDrafting();
    }
    @Test(enabled=true)
    public void checkFanShop() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkFanShop();
    }
    @Test(enabled=true)
    public void checkFilingAndFolders() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkFilingAndFolders();
    }
    @Test(enabled=true)
    public void checkGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkGiftCards();
    }
    @Test(enabled=true)
    public void checkArtAndCraftPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkArtAndCraftPaper();
    }
    @Test(enabled=true)
    public void checkBusinessAndDigitalPrintingPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkBusinessAndDigitalPrintingPaper();
    }
    @Test(enabled=true)
    public void checkCashRegisterAndThermalRolls() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCashRegisterAndThermalRolls();
    }
    @Test(enabled=true)
    public void checkCertificatesAndCovers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCertificatesAndCovers();
    }
    @Test(enabled=true)
    public void checkCopyAndPrinterPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCopyAndPrinterPaper();
    }
    @Test(enabled=true)
    public void checkFillerAndGraphPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkFillerAndGraphPaper();
    }
    @Test(enabled=true)
    public void checkIndexCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkIndexCards();
    }
    @Test(enabled=true)
    public void checkInvitationsAndCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkInvitationsAndCards();
    }
    @Test(enabled=true)
    public void checkNoteBooksAndPads() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkNoteBooksAndPads();
    }
    @Test(enabled=true)
    public void checkPostItAndStickyNotes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPostItAndStickyNotes();
    }
    @Test(enabled=true)
    public void checkAppliances() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkAppliances();
    }
    @Test(enabled=true)
    public void checkBeverages() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkBeverages();
    }
    @Test(enabled=true)
    public void checkCandy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCandy();
    }
    @Test(enabled=true)
    public void checkCoffeeAndCoffeeSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCoffeeAndCoffeeSupplies();
    }
    @Test(enabled=true)
    public void checkCookware() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCookware();
    }
    @Test(enabled=true)
    public void checkPlatesAndCutlery() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPlatesAndCutlery();
    }
    @Test(enabled=true)
    public void checkFirstAid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkFirstAid();
    }
    @Test(enabled=true)
    public void checkSnacksAndFood() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkSnacksAndFood();
    }
    @Test(enabled=true)
    public void checkAirFresheners() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkAirFresheners();
    }
    @Test(enabled=true)
    public void checkCleaningTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCleaningTools();
    }
    @Test(enabled=true)
    public void checkFacialTissues() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkFacialTissues();
    }
    @Test(enabled=true)
    public void checkFacilitySupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkFacilitySupplies();
    }
    @Test(enabled=true)
    public void checkHandSanitizers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkHandSanitizers();
    }
    @Test(enabled=true)
    public void checkHandSoap() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkHandSoap();
    }
    @Test(enabled=true)
    public void checkMaterialHandling() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkMaterialHandling();
    }
    @Test(enabled=true)
    public void checkMedicalSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkMedicalSupplies();
    }
    @Test(enabled=true)
    public void checkPaperTowels() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPaperTowels();
    }
    @Test(enabled=true)
    public void checkPersonalCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkPersonalCare();
    }
    @Test(enabled=true)
    public void checkRestroomSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkRestroomSupplies();
    }
    @Test(enabled=true)
    public void checkSafetyAndSecurity() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkSafetyAndSecurity();
    }
    @Test(enabled=true)
    public void checkToiletPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkToiletPaper();
    }
    @Test(enabled=true)
    public void checkToolsAndEquipment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkToolsAndEquipment();
    }
    @Test(enabled=true)
    public void checkTrashCansAndBags() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkTrashCansAndBags();
    }
    @Test(enabled=true)
    public void checkAudio() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkAudio();
    }
    @Test(enabled=true)
    public void checkBatteriesAndPowerProtection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkBatteriesAndPowerProtection();
    }
    @Test(enabled=true)
    public void checkCamerasAndCamcorders() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCamerasAndCamcorders();
    }
    @Test(enabled=true)
    public void checkCarAndOutdoor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkCarAndOutdoor();
    }
    @Test(enabled=true)
    public void checkComputerAndTabletAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkComputerAndTabletAccessories();
    }
    @Test(enabled=true)
    public void checkComputerPartsAndUpgrades() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkComputerPartsAndUpgrades();
    }
    @Test(enabled=true)
    public void checkDataStorageAndMedia() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.checkDataStorageAndMedia();
    }


}
