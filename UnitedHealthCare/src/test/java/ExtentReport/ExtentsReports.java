package ExtentReport;
import Reportint.ApplicationsLog;
import Reportint.TestsLoggers;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ExtentsReports extends CommonAPI {
    @Test
    public void verifyHomePageTitle() {
        ApplicationsLog.EpicLogger();
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");



    }
}
