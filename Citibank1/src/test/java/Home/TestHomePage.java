package Home;

import HomePage.SearchHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends SearchHomePage {

    SearchHomePage searchHomePage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        searchHomePage = PageFactory.initElements(driver, SearchHomePage.class);
    }
    @Test
    public void testLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkLogo();
    }
    @Test
    public void testAtmBranch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkAtmBranch();
    }
    @Test
    public void testOpenAnAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkOpenAnAccount();
    }
    @Test
    public void testEnglish() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkEnglish();
    }
    @Test
    public void testSearchIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkSearchIcon();
    }
    @Test
    public void testCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkCreditCards();
    }
    @Test
    public void testBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkbanking();
    }
    @Test
    public void testLending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checklending();
    }
    @Test
    public void testInvesting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkInvesting();
    }
    @Test
    public void testCitigold() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkCitiGold();
    }
    @Test
    public void testUserName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkUserName();
    }
    @Test
    public void testRememberMyUserId() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkRememberMyUserId();
    }
    @Test
    public void testSignOn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkSignOn();
    }
    @Test
    public void testForgotUserId() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkForgotUserId();
    }
    @Test
    public void testActivateAId() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkActivateAId();
    }
    @Test
    public void testForgotPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkForgotPassword();
    }
    @Test
    public void testRegisterForOnlineAccess() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkRegisterForOnlineAccess();
    }
    @Test
    public void testNoLateFeesEver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkNoLateFeesEver();
    }
    @Test
    public void testHollywoodSpendingSolutions() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkHollywoodSpendingSolutions();
    }
    @Test
    public void testPromoInterestRate() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkPromoInterestRate();
    }
    @Test
    public void testCitiSimplicityCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkCitiSimplicityCard();
    }
    @Test
    public void testLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkLearnMore();
    }
    @Test
    public void testImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkImage();
    }
    @Test
    public void testLearnMore2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkLearnMore2();
    }
    @Test
    public void testLearnMore3() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkLearnMore3();
    }
    @Test
    public void testCitiLogo2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkCitiLogo2();
    }
    @Test
    public void testExperienceMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkExperienceMore();
    }
    @Test
    public void testLearnMore4() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkLearnMore4();
    }
    @Test
    public void testHealpfulTips() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkHealpfulTips();
    }
    @Test
    public void testAppleStoreTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkAppleStoreTab();
    }
    @Test
    public void testGooglePlayTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkGooglePlayTab();
    }
    @Test
    public void testWhyciti() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkWhyCiti();
    }
    @Test
    public void testOurStory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchHomePage.checkOurStory();
    }


}
