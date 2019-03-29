package exceldatareader;

import base.CommonAPI;
import exceldata.ExcelDataSource;
import org.testng.annotations.Test;
import tabledata.TablePage;

import java.util.List;

public class TestExcelDataSource extends CommonAPI {

    String ForFramework = "/Users/alexkarmokar/IdeaProjects/AutomationFrameworkGroup6/Cnn/src/test/resources/ForFramework.xls";

   @Test
   public void ForFramework() {
       ExcelDataSource excelDataSource = new ExcelDataSource();
       excelDataSource.navigateForward();

       }
   }