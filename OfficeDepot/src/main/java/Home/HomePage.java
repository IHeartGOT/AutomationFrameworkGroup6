package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

    @FindBy (xpath = "//input[@class='input odomx']")
    public static WebElement searchBox;
    @FindBy(className = "hometag")
    public static WebElement officeSupplies;
    @FindBy(id = "navGroup2")
    public static WebElement paper;
    @FindBy(id = "navGroup12")
    public static WebElement deals;
    @FindBy(id = "inkNav")
    public static WebElement ink;
    @FindBy(id = "navGroup3")
    public static WebElement breakRoom;
    @FindBy(xpath = "//*[@id=\"navGroup4\"]")
    public static WebElement cleaning;
    @FindBy(id = "navGroup5")
    public static WebElement technology;
    @FindBy(id = "navGroup6")
    public static WebElement furniture;
    @FindBy(id = "navGroup7")
    public static WebElement schoolSupplies;
    @FindBy(id = "navGroup8")
    public static WebElement printPlusCopy;
    @FindBy(id = "navGroup9")
    public static WebElement services;
    @FindBy(xpath = "//a[@class='accountLogin']//span[@class='more_info']")
    public static WebElement account;
    @FindBy(id = "headerIdeas")
    public static WebElement ideas;
    @FindBy(id = "headerStores")
    public static WebElement stores;
    @FindBy(id = "headerCart")
    public static WebElement cart;
    @FindBy(id = "global_ad1_wrapper")
    public static WebElement offer;
    @FindBy(className = "customerService")
    public static WebElement helpCenter;
    @FindBy(xpath = "//a[text()='FAQs']")
    public static WebElement faqs;
    @FindBy(xpath = "//a[text()='Check Order Status']")
    public static WebElement checkOrderStatus;
    @FindBy(className = "w20")
    public static WebElement returnAnItem;
    @FindBy(xpath = "//a[text()='Contact Us']")
    public static WebElement contactUs;
    @FindBy(xpath = "//a[text()='Price Match Policy']")
    public static WebElement priceMatchPolicy;
    @FindBy(linkText = "Corporate Sustainability")
    public static WebElement corporateSustainability;
    @FindBy(linkText = "Carrers")
    public static WebElement careers;
    @FindBy(css = "#bx-close-inside-752704 > svg")
    public static WebElement popUpClose;
    @FindBy(css = "#bx-close-outside-681122 > svg")
    public static WebElement popUpClose2;
    @FindBy(id = "mainSearchField")
    public static WebElement searchField;
    @FindBy(xpath = "//a[contains(text(),'Compliance and Ethics')]")
    public static WebElement complianceAndEthics;
    @FindBy(xpath = "//a[contains(text(),'Diversity')]")
    public static WebElement diversity;
    @FindBy(xpath = "//a[contains(text(),'Investor Relations')]")
    public static WebElement investorRelations;
    @FindBy(xpath = "//a[contains(text(),'Media Relations')]")
    public static WebElement mediaRelations;
    @FindBy(xpath = "//a[contains(text(),'Patents')]")
    public static WebElement patents;
    @FindBy(xpath = "//a[contains(text(),'Real Estate Listing')]")
    public static WebElement realEstateListing;
    @FindBy(xpath = "//a[contains(text(),'CA Supply Chain Disclosure')]")
    public static WebElement cASupplyChainDisclosure ;
    @FindBy(xpath = "//a[contains(text(),'Community Investment')]")
    public static WebElement communityInvestment ;
    @FindBy(xpath = "//a[contains(text(),'Store Locator')]")
    public static WebElement storeLocator ;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[14]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/ul[1]/li[3]/a[1]")
    public static WebElement resourceServices ;
    @FindBy(xpath = "//a[contains(text(),'Online Catalogs')]")
    public static WebElement onlineCatalogs;
    @FindBy(xpath = "//a[contains(text(),'Rebates')]")
    public static WebElement rebates ;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[14]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/ul[1]/li[6]/a[1]")
    public static WebElement employeeBusinesses;
    @FindBy(xpath = "//a[contains(text(),'Order by Item Number')]")
    public static WebElement orderByItemNumber;
    @FindBy(xpath = "//a[contains(text(),'Write Product Review')]")
    public static WebElement writeProductReview;
    @FindBy(xpath = "//a[contains(text(),'Black Friday 2018')]")
    public static WebElement blackFriday2018;
    @FindBy(xpath = "//a[contains(text(),'Subscriptions')]")
    public static WebElement subscriptions;
    @FindBy(xpath = "//a[contains(text(),'Recall Notices')]")
    public static WebElement recallNotices ;
    @FindBy(xpath = "//a[contains(text(),'Greener Office Products')]")
    public static WebElement greenerOfficeProducts ;
    @FindBy(xpath = "//a[contains(text(),'Tech Services')]")
    public static WebElement techServices;
    @FindBy(xpath = "//a[contains(text(),'Affiliate Program')]")
    public static WebElement affiliateProgram;
    @FindBy(xpath = "//a[contains(text(),'Partner Program')]")
    public static WebElement partnerProgram ;
    @FindBy(xpath = "//a[contains(text(),'Give Back to School Program')]")
    public static WebElement giveBackToSchoolProgram ;
    @FindBy(xpath = "//a[contains(text(),'Government Programs')]")
    public static WebElement governmentPrograms ;
    @FindBy(xpath = "//a[contains(text(),'Associate Discount')]")
    public static WebElement associateDiscount;
    @FindBy(xpath = "//a[contains(text(),'Store Credit Cards')]")
    public static WebElement storeCreditCards;
    @FindBy(xpath = "//span[contains(text(),'Store Pickup.')]")
    public static WebElement storePickup;
    @FindBy(xpath = "//span[contains(text(),'Store Pickup.')]")
    public static WebElement orderOnline;
    @FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
    public static WebElement termsOfUse ;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[14]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[6]/ul[1]/li[2]/a[1]")
    public static WebElement privacyPolicy ;
    @FindBy(xpath = "//a[contains(text(),'Office Depot Tracking Tools')]")
    public static WebElement officeDepotTrackingTools;
    @FindBy(xpath = "//a[contains(text(),'Office Depot Anywhere')]")
    public static WebElement  officeDepotAnywhere;
    @FindBy(xpath = "//a[contains(text(),'Grand & Toy Canada')]")
    public static WebElement  grandAndToyCanada;
    @FindBy(xpath = "//a[contains(text(),'Art & Crafting')]")
    public static WebElement  artAndCrafting;
    @FindBy(xpath = "//a[contains(text(),'Bags & Luggage')]")
    public static WebElement  bagsAndLuggage;
    @FindBy(xpath = "//a[contains(text(),'Basic Supplies')]")
    public static WebElement  basicSupplies;
    @FindBy(xpath = "//a[contains(text(),'Binders & Accessories')]")
    public static WebElement  bindersAndAccessories;
    @FindBy(xpath = "//a[contains(text(),'Calendars & Planners')]")
    public static WebElement  calendarsAndPlanners;
    @FindBy(xpath = "//a[contains(text(),'Desk Accessories')]")
    public static WebElement  deskAccessories;
    @FindBy(xpath = "//a[contains(text(),'Drafting')]")
    public static WebElement  drafting;
    @FindBy(xpath = "//a[contains(text(),'Fan Shop')]")
    public static WebElement  fanShop;
    @FindBy(xpath = "//a[contains(text(),'Filing & Folders')]")
    public static WebElement  filingAndFolders;
    @FindBy(xpath = "//a[contains(@class,'refV2 black med_txt js-refinement-link')][contains(text(),'Gift Cards')]")
    public static WebElement  giftCards;
    @FindBy(xpath = "//a[contains(text(),'Art & Craft Paper')]")
    public static WebElement  artAndCraftPaper;
    @FindBy(xpath = "//a[contains(text(),'Business & Digital Printing Paper')]")
    public static WebElement  businessAndDigitalPrintingPaper;
    @FindBy(xpath = "//a[contains(text(),'Cash Register & Thermal Rolls')]")
    public static WebElement cashRegisterAndThermalRolls;
    @FindBy(xpath = "//a[contains(text(),'Certificates & Covers')]")
    public static WebElement certificatesAndCovers;
    @FindBy(xpath = "//a[contains(text(),'Copy & Printer Paper')]")
    public static WebElement copyAndPrinterPaper;
    @FindBy(xpath = "//a[contains(text(),'Filler & Graph Paper')]")
    public static WebElement fillerAndGraphPaper;
    @FindBy(xpath = "//a[contains(text(),'Index Cards')]")
    public static WebElement indexCards;
    @FindBy(xpath = "//a[contains(text(),'Invitations & Cards')]")
    public static WebElement invitationsAndCards;
    @FindBy(xpath = "//a[contains(text(),'Notebooks & Pads')]")
    public static WebElement noteBooksAndPads;
    @FindBy(xpath = "//a[contains(text(),'Post-It & Sticky Notes')]")
    public static WebElement postItAndStickyNotes;
    @FindBy(xpath = "//a[contains(text(),'Appliances')]")
    public static WebElement appliances ;
    @FindBy(xpath = "//a[contains(text(),'Beverages')]")
    public static WebElement beverages ;
    @FindBy(xpath = "//a[@class='refV2 black med_txt js-refinement-link'][contains(text(),'Candy')]")
    public static WebElement candy;
    @FindBy(xpath = "//a[contains(text(),'Coffee & Coffee Supplies')]")
    public static WebElement coffeeAndCoffeeSupplies;
    @FindBy(xpath = "//a[contains(text(),'Cookware')]")
    public static WebElement cookware;
    @FindBy(xpath = "//a[contains(text(),'Cups, Plates & Cutlery')]")
    public static WebElement platesAndCutlery;
    @FindBy(xpath = "//a[@class='refV2 black med_txt js-refinement-link'][contains(text(),'First Aid')]")
    public static WebElement firstAid;
    @FindBy(xpath = "//a[contains(text(),'Snacks & Food')]")
    public static WebElement snacksAndFood;
    @FindBy(xpath = "//a[contains(text(),'Air Fresheners')]")
    public static WebElement airFresheners;
    @FindBy(xpath = "//a[contains(text(),'Cleaning Tools')]")
    public static WebElement cleaningTools;
    @FindBy(xpath = "//a[contains(text(),'Facial Tissues')]")
    public static WebElement facialTissues;
    @FindBy(xpath = "//a[contains(text(),'Facility Supplies')]")
    public static WebElement facilitySupplies;
    @FindBy(xpath = "//a[contains(text(),'Hand Sanitizers')]")
    public static WebElement handSanitizers;
    @FindBy(xpath = "//a[contains(text(),'Hand Soap')]")
    public static WebElement handSoap ;
    @FindBy(xpath = "//a[contains(text(),'Material Handling')]")
    public static WebElement materialHandling;
    @FindBy(xpath = "//a[contains(text(),'Medical Supplies')]")
    public static WebElement medicalSupplies;
    @FindBy(xpath = "//a[contains(@class,'refV2 black med_txt js-refinement-link')][contains(text(),'Paper Towels')]")
    public static WebElement paperTowels;
    @FindBy(xpath = "//a[contains(@class,'refV2 black med_txt js-refinement-link')][contains(text(),'Personal Care')]")
    public static WebElement personalCare;
    @FindBy(xpath = "//a[contains(text(),'Restroom Supplies')]")
    public static WebElement restroomSupplies;
    @FindBy(xpath = "//a[contains(text(),'Safety & Security')]")
    public static WebElement safetyAndSecurity;
    @FindBy(xpath = "//a[contains(text(),'Toilet Paper')]")
    public static WebElement toiletPaper;
    @FindBy(xpath = "//a[contains(text(),'Tools & Equipment')]")
    public static WebElement toolsAndEquipment;
    @FindBy(xpath = "//a[contains(text(),'Trash Cans & Bags')]")
    public static WebElement trashCansAndBags ;
    @FindBy(xpath = "//a[contains(@class,'refV2 black med_txt js-refinement-link')][contains(text(),'Audio')]")
    public static WebElement audio ;
    @FindBy(xpath = "//a[contains(text(),'Batteries & Power Protection')]")
    public static WebElement batteriesAndPowerProtection ;
    @FindBy(xpath = "//a[contains(text(),'Cameras & Camcorders')]")
    public static WebElement camerasAndCamcorders ;
    @FindBy(xpath = "//a[contains(text(),'Car & Outdoor')]")
    public static WebElement carAndOutdoor;
    @FindBy(xpath = "//a[contains(text(),'Computer & Tablet Accessories')]")
    public static WebElement computerAndTabletAccessories;
    @FindBy(xpath = "//a[contains(text(),'Computer Parts & Upgrades')]")
    public static WebElement computerPartsAndUpgrades;
    @FindBy(xpath = "//a[contains(text(),'Data Storage & Media')]")
    public static WebElement dataStorageAndMedia;
    public void checkLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("computer");
    }
    public void checkOfficeSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        officeSupplies.click();
    }

    public void checkPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        paper.click();
    }
    public void checkDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
    }
    public void checkInk() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ink.click();
    }
    public void checkBreakroom() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        breakRoom.click();
    }
    public void checkCleaning() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cleaning.click();
    }
    public void checkTechnology() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        technology.click();
    }
    public void checkFurniture() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        furniture.click();
    }
    public void checkSchoolSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        schoolSupplies.click();
    }
    public void checkPrintPlusCopy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        printPlusCopy.click();
    }
    public void checkServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        services.click();
    }
    public void checkAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        account.click();
    }
    public void checkIdeas() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ideas.click();
    }
    public void checkStores() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        stores.click();
    }
    public void checkCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.click();
    }
    public void checkOffer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        offer.click();
    }
    public void checkHelpCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpCenter.click();
    }
    public void checkFaqs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        faqs.click();
    }
    public void checkReturnAnItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        returnAnItem.click();
    }
    public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        contactUs.click();
    }
    public void checkOrderStaus() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkOrderStatus.click();
    }
    public void checkPriceMatchPolicy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        priceMatchPolicy.click();
    }
    public void checkCorporateSustaiNability() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        corporateSustainability.click();
    }
    public void checkCareers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        careers.click();
    }
    public void checkPopup() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        popUpClose.click();
    }
    public void checkPopUp2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        popUpClose2.click();

    }
    public void checkSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Ink", Keys.ENTER);
    }
    public void checkSearchBox2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("laptop", Keys.ENTER);
    }
    public void checkComplianceAndEthics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        complianceAndEthics.click();
    }
    public void checkDiversity() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        diversity.click();
    }
    public void checkInvestorRelations() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        investorRelations.click();
    }
    public void checkMediaRelations() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mediaRelations.click();
    }
    public void checkPatents() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        patents.click();
    }
    public void checkRealEstateListing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        realEstateListing.click(); }
    public void checkCASupplyChainDisclosure() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cASupplyChainDisclosure.click();
    }
    public void checkCommunityInvestment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        communityInvestment.click();
    }
    public void checkStoreLocator() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        storeLocator.click();
    }
    public void checkResourceServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        resourceServices.click();
    }
    public void checkOnlineCatalogs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        onlineCatalogs.click();
    }
    public void checkRebates() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        rebates.click();
    }
    public void checkEmployeeBusinesses() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employeeBusinesses.click();
    }
    public void checkOrderByItemNumber() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        orderByItemNumber.click();
    }
    public void checkBlackFriday2018() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        blackFriday2018.click();
    }
    public void checkWriteProductReview() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        writeProductReview.click();
    }
    public void checkSubscriptions() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        subscriptions.click();
    }
    public void checkRecallNotices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        recallNotices.click();
    }
    public void checkGreenerOfficeProducts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        greenerOfficeProducts.click();
    }
    public void checkTechServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        techServices.click();
    }
    public void checkAffiliateProgram() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        affiliateProgram.click();
    }
    public void checkPartnerProgram() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        partnerProgram.click();
    }
    public void checkGiveBackToSchoolProgram () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giveBackToSchoolProgram .click();
    }
    public void checkGovernmentPrograms() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        governmentPrograms.click();
    }
    public void checkAssociateDiscount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        associateDiscount.click();
    }
    public void checkStoreCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        storeCreditCards.click();
    }
    public void checkStorePickup() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        storePickup.click();
    }
    public void checkOrderOnline() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        orderOnline.click();
    }
    public void checkTermsOfUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        termsOfUse.click();
    }
    public void checkPrivacyPolicy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyPolicy.click();
    }
    public void checkOfficeDepotTrackingTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        officeDepotTrackingTools.click();
    }
    public void checkOfficeDepotAnywhere() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        officeDepotAnywhere.click();
    }
    public void checkGrandAndToyCanada() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        grandAndToyCanada.click();
    }
    public void checkArtAndCrafting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        artAndCrafting.click();
    }
    public void checkBagsAndLuggage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bagsAndLuggage.click();
    }
    public void checkBasicSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        basicSupplies.click();
    }
    public void checkBindersAndAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bindersAndAccessories.click();
    }
    public void checkCalendarsAndPlanners() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        calendarsAndPlanners.click();
    }
    public void checkDeskAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deskAccessories.click();
    }
    public void checkDrafting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drafting.click();
    }
    public void checkFanShop() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fanShop.click();
    }
    public void checkFilingAndFolders() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        filingAndFolders.click();
    }
    public void checkGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCards.click();
    }
    public void checkArtAndCraftPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        artAndCraftPaper.click();
    }
    public void checkBusinessAndDigitalPrintingPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        businessAndDigitalPrintingPaper.click();
    }
    public void checkCashRegisterAndThermalRolls() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cashRegisterAndThermalRolls.click();
    }
    public void checkCertificatesAndCovers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        certificatesAndCovers.click();
    }
    public void checkCopyAndPrinterPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        copyAndPrinterPaper.click();
    }
    public void checkFillerAndGraphPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fillerAndGraphPaper.click();
    }
    public void checkIndexCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        indexCards.click();
    }
    public void checkInvitationsAndCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        invitationsAndCards.click();
    }
    public void checkNoteBooksAndPads() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        noteBooksAndPads.click();
    }
    public void checkPostItAndStickyNotes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        postItAndStickyNotes.click();
    }
    public void checkAppliances() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        appliances.click();
    }
    public void checkBeverages() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beverages.click();
    }
    public void checkCandy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        candy.click();
    }
    public void checkCoffeeAndCoffeeSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        coffeeAndCoffeeSupplies.click();
    }
    public void checkCookware() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cookware.click();
    }
    public void checkPlatesAndCutlery() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        platesAndCutlery.click();
    }
    public void checkFirstAid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstAid.click();
    }
    public void checkSnacksAndFood() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        snacksAndFood.click();
    }
    public void checkAirFresheners() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        airFresheners.click();
    }
    public void checkCleaningTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cleaningTools.click();
    }
    public void checkFacialTissues() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        facialTissues.click();
    }
    public void checkFacilitySupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        facilitySupplies.click();
    }
    public void checkHandSanitizers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        handSanitizers.click();
    }
    public void checkHandSoap() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        handSoap.click();
    }
    public void checkMaterialHandling() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        materialHandling.click();
    }
    public void checkMedicalSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        medicalSupplies.click();
    }
    public void checkPaperTowels() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        paperTowels.click();
    }
    public void checkPersonalCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        personalCare.click();
    }
    public void checkRestroomSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        restroomSupplies.click();
    }
    public void checkSafetyAndSecurity() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        safetyAndSecurity.click();
    }
    public void checkToiletPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toiletPaper.click();
    }
    public void checkToolsAndEquipment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        toolsAndEquipment.click();
    }
    public void checkTrashCansAndBags() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        trashCansAndBags.click();
    }
    public void checkAudio() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        audio.click();
    }
    public void checkBatteriesAndPowerProtection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        batteriesAndPowerProtection.click();
    }
    public void checkCamerasAndCamcorders() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        camerasAndCamcorders.click();
    }
    public void checkCarAndOutdoor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        carAndOutdoor.click();
    }
    public void checkComputerAndTabletAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        computerAndTabletAccessories.click();
    }
    public void checkComputerPartsAndUpgrades() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        computerPartsAndUpgrades.click();
    }
    public void checkDataStorageAndMedia() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        dataStorageAndMedia.click();
    }
}
