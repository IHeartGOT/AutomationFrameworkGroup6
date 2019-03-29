package testtable;

import base.CommonAPI;
import org.testng.annotations.Test;
import tabledata.TablePage;

public class TestTableData extends CommonAPI {

    @Test
    public void TestTabledata(){
        TablePage tablePage = new TablePage ();
        tablePage.readTable();
    }
}


