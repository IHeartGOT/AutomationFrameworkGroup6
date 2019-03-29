package UnitedHome;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AllLinkInHomePage extends CommonAPI {
    public AllLinkInHomePage() { PageFactory.initElements(driver, this); }
    @FindBy(xpath = "//span[@class='list-pipe-separator']//a[@class='at-element-click-tracking' and @href='https://www.uhcprovider.com/']")
    WebElement providerLink;
    @FindBy(xpath = "//span[@class='list-pipe-separator']//a[@href='https://www.uhc.com/broker']")
    WebElement brokerLink;
    @FindBy(xpath = "//a[contains(text(),'Español')]")
    WebElement languageLink;
    @FindBy(id = "loginmenubutton")
    WebElement checkSignIn;
    @FindBy(xpath = "//li[@class='home']//a[@class='top-menu1']")
    WebElement checkHomeLink;
    @FindBy(xpath = "//li[@class='individual-family ']//a[@title='Individuals & Families']")
    WebElement checkInidvidualAndFamilyLink;
    @FindBy(xpath = "//li[@class='employers ']//a[@class='top-menu3']")
    WebElement checkEmployersLink;
    @FindBy(xpath = "//a[contains(text(),'Medicare') and @href='/content/uhcdotcom/en/home/medicare' and @class='at-element-click-tracking']")
    WebElement checkMedicareLink;
    @FindBy(className = "top-menu6")
    WebElement checkFindDoctors;
    @FindBy(xpath = "//span[contains(text(),'Search Providers')]")
    WebElement SearchProviders;
    @FindBy(xpath = "//span[contains(text(),'Find Out More')]")
    WebElement checkFindOutMore;
    @FindBy(xpath = "//a[@href='/individual-and-family/member-resources/health-care-tools/virtual-visits?icid=VirtualVisitsAnytimeC']//span[contains(text(),'See Options')]")
    WebElement checkSeeOptions;
    @FindBy(xpath = "//a[contains(text(),'individuals')]")
    WebElement checkIndividualsLink;
    @FindBy(xpath = "//p[@style='text-align: center;']// a[@aria-label='Health insurance for employers']")
    WebElement checkEmployers;
    @FindBy(xpath = "//a[@href='/medicare.html' and @aria-label='Learn more on our Medicare page']")
    WebElement checkLearnMoreLink;
    @FindBy(xpath = "//a[@href='https://www.aarpmedicareplans.com/health-plans.html?WT.mc_id=880332' and @aria-label='View Medicare plans (opens in a new window)']")
    WebElement checkViewPlansUnderMedicarePlan;
    @FindBy(xpath = "//a[@href='/employer/small-business.html' and @aria-label='Health Insurance for Small Business']")
    WebElement checkLearnMoreLinkUnderSmalBusiness;
    @FindBy(xpath = "//a[@href='/individual-and-family.html' and @aria-label='Learn More on Individual and Families']")
    WebElement checkLearnMoreUnderIndividualsFamilyPlan;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#?LeadsourceName=UHC-Website' and @aria-label='View plans on UHOne.com (opens in a new window)']")
    WebElement checkViewPlanUnderIndividualsAndFailyPlan;
    @FindBy(xpath = "//a[@href='/individual-and-family/dental-insurance.html' and @aria-label='Learn More about Dental Plans']")
    WebElement checkLearnMoreUnderdDentalPlan;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#/census?LeadSourceName=UHC-Website-Dental' and @aria-label='View Dental plans on UHOne.com (opens in a new window)']")
    WebElement checkViewPlansUnderDentalPlan;
    @FindBy(xpath = "//a[@href='/individual-and-family/short-term-health-insurance.html']")
    WebElement checkLearnMoreUnderShortTermHealthIns;
    @FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#?LeadSourceName=UHC-Website-STM' and @target='_blank']")
    WebElement checkViewPlansUndedrShortTermIns;
    @FindBy(xpath = "//a[@href='https://uhccommunityplan.com' and @target='_blank']")
    WebElement checkLearnMoreUnderMedicaidPlan;
    @FindBy(xpath = "//a[contains(text(),'Hospital and Doctor Insurance')]")
    WebElement checkHospitalAndDoctorInsurance;
    @FindBy(xpath = "//a[@href='/individual-and-family/insurance-plans/critical-illness.html']//span[@class='arrow-link']")
    WebElement checkCriticalIllnessInsurance;
    @FindBy(xpath = "//a[contains(text(),'Supplemental Insurance' )]")
    WebElement checkSuplementalInsurance;
    @FindBy(xpath = "//span[@class='arrow-link']//a[contains(text(),'Vision Insurance' )]")
    WebElement checkVisionInsurance;
    @FindBy(xpath = "//span[@class='arrow-link']//a[contains(text(),'Accident Insurance' )]")
    WebElement checkAccidentInsurance;
    @FindBy(xpath = "//a[@href='https://www.uhcglobal.com/']")
    WebElement checkGlobalInsurance;
    @FindBy(xpath = "//span[@class='arrow-link']//a[contains(text(),'Term Life Insurance')]")
    WebElement checkTermLifeInsurance;
    @FindBy(xpath = "//span[@class='arrow-link']//a[contains(text(),'Hospitalization Insurance')]")
    WebElement checkHospitalizationInsurance;
    @FindBy(xpath = "//a[contains(text(),'Global Travel Insurance')]")
    WebElement checkGlobalTravelInsurance;
    @FindBy(xpath = "//span[@class='arrow-link' and contains(text(),'Access the Provider Portal')]")
    WebElement checkAccessTheProviderPortal;
    @FindBy(xpath = "//a[@href='/broker.html' and contains(text(),'View Broker Resources')]")
    WebElement checkBrokerResource;
    @FindBy(xpath = "//span[@class='arrow-link' and contains(text(),'Find a nearby clinic.')]")
    WebElement checkNearByClinic;
    @FindBy(xpath = "//a[@href='/content/uhcdotcom/en/home/individual-and-family/understanding-health-insurance/how-insurance-works/health-insurance-marketplace']")
    WebElement checkMarketPlaceInsurance;
    @FindBy(xpath = "//a[contains(text(),'Fitness')]")
    WebElement checkFitness;
    @FindBy(xpath = "//a[contains(text(),'Open Enrollment')]")
    WebElement checkOpenEnrolMent;
    @FindBy(xpath = "//a[contains(text(),'Language Assistance/ Nondiscrimination Notice')]")
    WebElement checkLanguageAssistant;
    @FindBy(xpath = "//a[contains(text(),'Medicare') and @href='https://www.aarpmedicareplans.com/?WT.mc_id=880332']")
    WebElement checkMedicare;
    @FindBy(xpath = "//a[contains(text(),'Nutrition') and @href='/content/uhcdotcom/en/home/health-and-wellness/nutrition']")
    WebElement checkNutrition;
    @FindBy(xpath = "//a[contains(text(),'Member Resources') and @href='/content/uhcdotcom/en/home/individual-and-family/member-resources']")
    WebElement checkMemberResource;
    @FindBy(xpath = "//a[contains(text(),'Asistencia de Idiomas / Aviso de no Discriminación')]")
    WebElement checkAsistenciaDeIdiomsa;
    @FindBy(xpath = "//a[contains(text(),'Medicaid') and @href='/individual-and-family/health-insurance-plans/medicare-medicaid/what-is-medicaid']")
    WebElement checkMedicaid;
    @FindBy(xpath = "//a[contains(text(),'Health Topics') and @href='/health-and-wellness/health-topics']")
    WebElement checkHealthTopics;
    @FindBy(xpath = "//a[contains(text(),'About Us') and @href='/about-us']")
    WebElement checkAboutUs;
    @FindBy(xpath = "//a[contains(text(),'Employer Group Plans')]")
    WebElement checkEmployerGropPlan;
    @FindBy(xpath = "//a[contains(text(),'Take Control of Your Care') and @href='/health-and-wellness/take-control-of-your-care']")
    WebElement checkTakeControlOfYourCare;
    @FindBy(xpath = "//a[contains(text(),'United For Reform') and @href='/united-for-reform']")
    WebElement checkUnitedForReform;
    @FindBy(xpath = "//a[contains(text(),'Dental Insurance') and @href='/individual-and-family/dental-insurance']")
    WebElement checkDentalInsurance;
    @FindBy(xpath = "//a[contains(text(),'Health and Wellness')]")
    WebElement checkHealthAndWellness;
    @FindBy(xpath = "//a[contains(text(),'Value-Based Care') and @href='/valuebasedcare']")
    WebElement checkValueBasedCare;
    @FindBy(xpath = " //span[@class='arrow-link']//a[contains(text(),'Vision Insurance') and @href='/individual-and-family/insurance-plans/vision']")
    WebElement checkVisionInsurances;
    @FindBy(xpath = " //a[contains(text(),'Programs & Tools') and @href='/individual-and-family/member-resources/health-care-tools']")
    WebElement checkProgramAndTools;
    @FindBy(xpath = " //a[contains(text(),'View Drug List') and @href='http://www.myuhc.com/']")
    WebElement checkViewDrugList;
    @FindBy(xpath = "//li[@class='find-doc ']//a[contains(text(),'Find a Doctor')]")
    WebElement checkFindADoctors;
    @FindBy(xpath = "//li[@lang='en']//a[contains(text(),'Short Term Health Insurance') and @href='/individual-and-family/short-term-health-insurance' and @target ='_self']")
    WebElement checkShortTermHealthInsurance;
    @FindBy(xpath = "//li[@lang='en']//a[contains(text(),'Download Health4Me App') and @href='/individual-and-family/member-resources/health-care-tools/health4me']")
    WebElement checkDownloadHealthForMe;
    @FindBy(xpath = "//li[@lang='en']//a[contains(text(),'Print ID Card')]")
    WebElement checkPrintIDcard;
    @FindBy(xpath = "//li[@lang='en']//a[contains(text(),'Broker Resources') and @href='https://www.uhc.com/broker'] ")
    WebElement checkBrokerResources;
    @FindBy(xpath = "//li[@lang='en']//a[contains(text(),'View Claims')] ")
    WebElement checkViewClaim;
    @FindBy(xpath = "//li[@lang='en']//a[contains(text(),'Just Plain Clear® Glossary') and @href='http://www.justplainclear.com?srcName=uhc_com-FeaturedLink']")
    WebElement checkJustPlainGlocdry;
    @FindBy(xpath = "//li[@lang='en']//a[contains(text(),'Check Benefits')] ")
    WebElement checkBenefit;
    @FindBy(xpath = "//a[contains(text(),'Newsroom') and @href='https://newsroom.uhc.com'] ")
    WebElement checkNewsRoom;
    @FindBy(xpath = "//a[contains(text(),'Contact Us') and @href='/contact-us'] ")
    WebElement checkContactUs;
    @FindBy(xpath = "//a[contains(text(),'Careers') and @href='/about-us/careers'] ")
    WebElement checkCareers;
    @FindBy(xpath = "//a[contains(text(),'Health Care Fraud') and @href='/fraud'] ")
    WebElement checkHealthCareFraud;
    @FindBy(xpath = "//a[contains(text(),'Legal')]")
    WebElement checkLegal;
    @FindBy(xpath = "//a[contains(text(),'Privacy')] ")
    WebElement checkPrivacy;
    @FindBy(xpath = "//a[contains(text(),'Terms of Use') and @href='/privacy/terms-of-use'] ")
    WebElement checkTermsOfUse;
    public WebElement homePageProviderLink() {
        return providerLink;
    }
    public WebElement homePageBrokerLink() {
        return brokerLink;
    }
    public WebElement homePageLanguageLink() {
        return languageLink;
    }
    public WebElement homePageSignInlink() {
        return checkSignIn;
    }
    public WebElement homePageHomeLink() {
        return checkHomeLink;
    }
    public WebElement homePageIndividualAndFamilyLink() {
        return checkInidvidualAndFamilyLink;
    }
    public WebElement homePageEmployerLink() {
        return checkEmployersLink;
    }
    public WebElement homePageMedicareLink() {
        return checkMedicareLink;
    }
    public WebElement homePageFindDoctorsLink() {
        return checkFindDoctors;
    }
    public WebElement homePageSearchProviderLink() {//?
        return SearchProviders;
    }
    public WebElement homePageFindOutMore() {//?
        return checkFindOutMore;
    }
    public WebElement homePageSeeOptionLink() {//?
        return checkSeeOptions;
    }
    public WebElement homePageCheckIndividualsLink() {
        return checkIndividualsLink;
    }
    public WebElement homePageEmployees() {
        return checkEmployers;
    }
    public WebElement homePageLearnMore() {
        return checkLearnMoreLink;
    }
    public WebElement homePagePlanUnderMedicare() {
        return checkViewPlansUnderMedicarePlan;
    }
    public WebElement homePageLearnMoreUnderstandSmallBusiness() {return checkLearnMoreLinkUnderSmalBusiness; }
    public WebElement homePageLearnMores() {
        return checkViewPlanUnderIndividualsAndFailyPlan;
    }
    public WebElement homePageLearnIndvidualFamilyLink() {
        return checkLearnMoreUnderIndividualsFamilyPlan;
    }
    public WebElement homePageMorePlan() {
        return checkLearnMoreUnderShortTermHealthIns;
    }
    public WebElement homePageDentalPlan() {
        return checkLearnMoreUnderdDentalPlan;
    }
    public WebElement homePagePlan() {//d
        return checkViewPlansUnderDentalPlan;
    }
    public WebElement homePageShortTremHealthInsurace() {
        return checkLearnMoreUnderShortTermHealthIns;
    }
    public WebElement homePageViewPlanUnterShortTerm() {//n
        return checkViewPlansUndedrShortTermIns;
    }
    public WebElement homePageUnderMedicaidPlan() { return checkLearnMoreUnderMedicaidPlan; }
    public WebElement homePaeHospitalandDoctoreInsur() { return checkHospitalAndDoctorInsurance; }
    public WebElement homePageCriticalIllnessInsurance() {
        return checkCriticalIllnessInsurance;
    }
    public WebElement homePageSuplimentalInsurance() {
        return checkSuplementalInsurance;
    }
    public WebElement homePageVisonInsurance() {
        return checkVisionInsurance;
    }
    public WebElement homePageAccidentalInsurance() {
        return checkAccidentInsurance;
    }
    public WebElement homePageIndividualLink() {
        return checkIndividualsLink;
    }
    public WebElement homePageEmplyersLink() {
        return checkEmployers;
    }
    public WebElement homePageLearnMoreLink() {
        return checkLearnMoreLink;
    }
    public WebElement homePageViewPlansLink() {
        return checkViewPlansUnderMedicarePlan;
    }
    public WebElement homePageLearnMoreLinkSmallBusiness() {
        return checkLearnMoreLinkUnderSmalBusiness;
    }
    public WebElement homePageLearnMoreLinkIndividualsFamily() {
        return checkLearnMoreUnderIndividualsFamilyPlan;
    }
    public WebElement homePageViewPlanIndividualsAndFamily() {
        return checkViewPlanUnderIndividualsAndFailyPlan;
    }
    public WebElement homePageLearMoreDeltalPlan() {
        return checkLearnMoreUnderdDentalPlan;
    }
    public WebElement homePageViewPlanUnderDentalPlan() {
        return checkViewPlansUnderDentalPlan;
    }
    public WebElement homePageLearnMoreShortTermIns() { return checkLearnMoreUnderShortTermHealthIns; }
    public WebElement homePageViewPlanShortTermIns() {
        return checkViewPlansUndedrShortTermIns;
    }
    public WebElement homePageLearnMoreMedicaidPlan() {
        return checkLearnMoreUnderMedicaidPlan;
    }
    public WebElement homePageHospitalAndDoctorIns() {
        return checkHospitalAndDoctorInsurance;
    }
    public WebElement homePageGlobalInsurance() {
        return checkGlobalInsurance;
    }
    public WebElement homePageTermLifeInsurace() {
        return checkTermLifeInsurance;
    }
    public WebElement homePageHospitalizationIns() {
        return checkHospitalizationInsurance;
    }
    public WebElement homePageGlobalTravelIns() {
        return checkGlobalTravelInsurance;
    }
    public WebElement homePageAccessProviderPortal() {
        return checkAccessTheProviderPortal;
    }
    public WebElement homePageBrokerResource() {
        return checkBrokerResource;
    }
    public WebElement homePageNearByClinic() {
        return checkNearByClinic;
    }
    public WebElement homePageMarketPlaceIns() {
        return checkMarketPlaceInsurance;
    }
    public WebElement homePageFitness() {
        return checkFitness;
    }
    public WebElement homePageOpenEnrolment() {
        return checkOpenEnrolMent;
    }
    public WebElement homePageLanguageAssistant() {
        return checkLanguageAssistant;
    }
    public WebElement homePageMedicares() {
        return checkMedicare;
    }
    public WebElement homePageNutrition() {
        return checkNutrition;
    }
    public WebElement homePageMemberResource() {
        return checkMemberResource;
    }
    public WebElement homePageAssistenciaDeIdiomsa() {
        return checkAsistenciaDeIdiomsa;
    }
    public WebElement homePageMedicaid() {
        return checkMedicaid;
    }
    public WebElement homePageHealthTopics() {
        return checkHealthTopics;
    }
    public WebElement homePageAboutUs() {
        return checkAboutUs;
    }
    public WebElement homePageEmplyerGroupPlan() {
        return checkEmployerGropPlan;
    }
    public WebElement homePageTakeControlOfYourPlan() {
        return checkTakeControlOfYourCare;
    }
    public WebElement homePageUnitedForReform() {
        return checkUnitedForReform;
    }
    public WebElement homePageDentalInsurace() {
        return checkDentalInsurance;
    }
    public WebElement homePageHealthAndWellness() {
        return checkHealthAndWellness;
    }
    public WebElement homePageValueBasedCare() {
        return checkValueBasedCare;
    }
    public WebElement homePageVisionInsurace(){
        return checkVisionInsurances;
    }
    public WebElement homePageProgramAndTools(){
        return checkProgramAndTools;
    }
    public WebElement homePaeViewDruglist(){
        return  checkViewDrugList;
    }
    public WebElement heomePageViewDrugList(){
        return checkViewDrugList;
    }
    public WebElement homePageFindADoctor(){
        return  checkFindADoctors;
    }
    public WebElement homePageShortTermInsurace(){
        return  checkShortTermHealthInsurance;
    }
    public WebElement homePageDownLoadHealthForMe(){
        return checkDownloadHealthForMe;
    }
    public WebElement homePagePrintIdCared(){
        return checkPrintIDcard;
    }
    public WebElement homePageBrokerResources(){
        return checkBrokerResource;
    }
    public WebElement homePageViewClaim(){
        return checkViewClaim;
    }
    public WebElement homePageJustPlainGlocdry(){
        return  checkJustPlainGlocdry;
    }
    public WebElement homePageBenefit(){
        return  checkBenefit;
    }
    public WebElement homePageNewsRoom(){
        return checkNewsRoom;
    }
    public WebElement homePageContactUs(){
        return checkContactUs;
    }
    public WebElement homePageCarrears(){
        return checkCareers;
    }
    public WebElement homePageHealthCareFraud(){
        return checkHealthCareFraud;
    }
    public WebElement homePageLegal(){
        return checkLegal;
    }
    public WebElement homePagePrvacy(){
        return checkPrivacy;
    }
    public WebElement homePageTermsOfUse(){return checkTermsOfUse;}

}
