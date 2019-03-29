package tabledata;

import base.CommonAPI;

import java.util.List;

public class TablePage extends CommonAPI {

    public void readTable() {
        List<String> dataList = getTextFromWebElements("/Users/alexkarmokar/IdeaProjects/AutomationFrameworkGroup6/Cnn/src/test/resources/ForFramework.xls");
        for (String st : dataList) {
            System.out.println(st);
        }
    }
}