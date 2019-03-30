package reporting;


import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import java.io.File;

public class ExtentManager {

    private static ExtentReports extent;
    private static ITestContext context;

    public synchronized static ExtentReports getInstance(){
        if(extent == null){
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParent(), "html");
            extent = new ExtentReports(System.getProperty("user.dir")+"/Extent-Report/ExtentReport.html", true);
            extent.addSystemInfo("Group 6", "PNT").addSystemInfo("Environment","QA")
                    .addSystemInfo("Team Name", "Patrick Rabet");
        }
        return extent;
    }
    public static void  setOutputDirectory(ITestContext context){
        ExtentManager.context = context;
    }
}
