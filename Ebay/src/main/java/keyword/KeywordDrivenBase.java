package keyword;

import base.CommonAPI;

import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.util.Properties;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywordDrivenBase extends CommonAPI {


    public WebDriver driver;
    public Properties prop;

    public WebDriver init_driver(String browserName){
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/prodipbhowmik/IdeaProjects/AutomationFrameworkGroup6/Generic/drivers/chromedriver");
            if(prop.getProperty("headless").equals("yes")){
                //headless mode:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
            }else{
                driver = new ChromeDriver();
            }
        } else if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/prodipbhowmik/IdeaProjects/AutomationFrameworkGroup6/Generic/drivers/geckodriver");
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public Properties init_properties(){
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("/Users/prodipbhowmik/IdeaProjects/AutomationFrameworkGroup6/Ebay/ExcelFile/excel2.xlsx");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

}
