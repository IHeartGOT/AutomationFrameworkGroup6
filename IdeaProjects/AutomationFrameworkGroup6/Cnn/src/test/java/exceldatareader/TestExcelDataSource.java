package exceldatareader;

import base.CommonAPI;
import exceldata.ExcelDataSource;
import org.testng.annotations.Test;
import search.SearchPage;

import java.util.List;

public class TestExcelDataSource extends CommonAPI {

    String CNNdata = ("/Users/alexkarmokar/IdeaProjects/AutomationFrameworkGroup6/Cnn/src/test/resources/CNNdata.xls");

SearchPage searchPage;
String homeUrl = "https://www.cnn.com/";

@Test
    public void TestExceldata () {
    ExcelDataSource dr = new ExcelDataSource();
    String[] data = dr.getExcelData(this.CNNdata, 0);
    for (int i= 0; i< data.length; i++) {
        System.out.println(data[i]);
    }
}
       }

