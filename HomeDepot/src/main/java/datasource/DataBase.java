package datasource;

import base.CommonAPI;
import databases.ConnectToSqlDB;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


    public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("homedepot", "searchItems");
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return list;
    }

    public static void main(String[] args)throws Exception, IOException, SQLException, ClassNotFoundException {
        //insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("homedepot","searchItems");
        for(String st:list){
            System.out.println(st);
        }

    }
}
