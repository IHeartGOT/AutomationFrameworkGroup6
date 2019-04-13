package keyworddriven;


import base.CommonAPI;
import com.sun.media.sound.InvalidFormatException;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class KeywordEngine extends CommonAPI {

    public WebDriver driver;
    public Properties prop;

    public static Workbook book;
    public static Sheet sheet;

    public final String SCENARIO_SHEET_PATH = "/Users/alexkarmokar/IdeaProjects/AutomationFrameworkGroup6/Cnn/src/test/resources/KeywordDrivenFile.xls ";

    public void startExcution(String sheetName) {
        String locatorName = null;
        String locatorValue = null;

        FileInputStream file = null;
        try {
            file = new FileInputStream(SCENARIO_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
////     try {         //book = WorkbookFactory.create(file);
////         } catch (InvalidFormatException e) {e.printStackTrace();
////          } catch (IOException e) {
////           e.printStackTrace();
//        }
        sheet = book.getSheet(sheetName);
        int k = 0;
        for (int i = 0; i < sheet.getLastRowNum(); i++) {

            String locatorColValue = sheet.getRow(i + 1).getCell(k + 1).toString().trim();
            if (locatorColValue.equalsIgnoreCase("NA")) {
                locatorColValue.split("=")[0].trim();
                locatorValue = locatorColValue.split("=")[1].trim();
            }
            String action = sheet.getRow(i + 1).getCell(k + 2).toString().trim();
            String value = sheet.getRow(i + 1).getCell(k + 3).toString().trim();

            switch (action) {
                case "open browser":


                    break;
                default:
                    break;
            }

        }
    }
}
