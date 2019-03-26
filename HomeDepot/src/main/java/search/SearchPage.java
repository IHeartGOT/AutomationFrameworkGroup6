package search;
import base.CommonAPI;
import datasource.DataBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage extends CommonAPI {

    DataBase dataBase = new DataBase();

    @FindBy(how = How.ID, using ="headerSearch")
    public static WebElement searchInputWebElement;


    public WebElement getSearchInputWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }


    public void searchFor(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ value);
        getSearchInputWebElement().sendKeys(value, Keys.ENTER);
    }

    public void clearInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemsListFromDB();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            itemFoundOnSearch(list.get(i));
            clearInput();
        }
    }
    public void itemFoundOnSearch(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+" "+ value);
        Assert.assertEquals(value,value);
    }

    public void searchItemsAndSubmitButton(WebDriver driver1)throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = dataBase.getItemsListFromDB();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> itemList = dataBase.getItemsListFromDB();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
            //validate items
        }
    }

}