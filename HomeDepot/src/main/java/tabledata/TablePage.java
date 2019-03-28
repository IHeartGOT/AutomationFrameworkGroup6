package tabledata;

import base.CommonAPI;

import java.util.List;

public class TablePage extends CommonAPI {

    public void readTable(){
        List<String> dataList =  getTextFromWebElements("div.grid.isBound:nth-child(2) div.legacy-content.u--fix-960 div.row.withBorder div.pod.grid_24:nth-child(2) div.content div.row.withBorder:nth-child(4) div.pod.spad.grid_24 div.content > p.u__text-align--left");
        for(String st:dataList){
            System.out.println(st);
        }
    }
}
