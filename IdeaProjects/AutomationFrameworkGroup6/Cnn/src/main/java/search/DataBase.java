package search;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

        static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


        public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
            List<String> list = new ArrayList<>();
            list = connectToSqlDB.readDataBase("news", "keyword");
            return list;
        }

        public static void main(String[] args)throws Exception, IOException, SQLException, ClassNotFoundException {
        //insertDataIntoDB();
            ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
            List<String> list = connectToSqlDB.readDataBase("news","keyword");
            for(String st:list){
                System.out.println(st);
            }

        }
    }

