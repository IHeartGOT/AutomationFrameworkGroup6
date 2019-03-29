package tests;

import Excel.ReadFromExcel;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchdropdowns.ClothingShoesAcc;

import java.io.IOException;
import java.util.ArrayList;

public class TestExcel extends CommonAPI {

    @Test
    public void TestExcelData() throws IOException {

        ReadFromExcel readFromExcel = new ReadFromExcel ();
        ArrayList data = readFromExcel.getData ("Shoes");

        System.out.println (data.get (1));
        System.out.println (data.get (2));
        System.out.println (data.get (3));
        System.out.println (data.get (4));
    }
}
