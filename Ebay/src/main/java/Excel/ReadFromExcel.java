package Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class ReadFromExcel {

    public ArrayList<String> getData(String TestCaseName) throws IOException
    {
        ArrayList<String> a= new ArrayList<String> ();

        FileInputStream fis = new FileInputStream ("/Users/prodipbhowmik/IdeaProjects/AutomationFrameworkGroup6/Ebay/ExcelFile/ExcelData.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook (fis);

        int sheets = workbook.getNumberOfSheets ();

        for (int i = 0; i < sheets; i++) {

            if (workbook.getSheetName (i).equalsIgnoreCase ("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt (i);

                Iterator<Row> rows = sheet.iterator ();
                Row firstrow = rows.next ();
                Iterator<Cell> ce = firstrow.cellIterator ();
                ce.next ();


                int k = 1;
                int column = 0;
                while (ce.hasNext ()) {
                    Cell value = ce.next ();
                    if (value.getStringCellValue ().equalsIgnoreCase ("cars")) {

                        column = k;

                    }
                    k++;
                }
                System.out.println (column);

                while (rows.hasNext ()) {
                    Row r = rows.next ();
                    if (r.getCell (column).getStringCellValue ().equalsIgnoreCase (TestCaseName)) {
                        Iterator<Cell> cv = r.cellIterator ();
                        while (cv.hasNext ())
                        {
                            a.add (cv.next ().getStringCellValue ());
                        }
                    }

                }
            }
        }
        return a;
    }

}

