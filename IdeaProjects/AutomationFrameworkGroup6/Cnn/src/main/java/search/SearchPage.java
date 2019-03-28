package search;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage {

        DataBase dataBase = new DataBase();

        @FindBy(how = How.ID, using ="search-input-field")
        public static WebElement searchInputWebElement;

        @FindBy(how = How.ID, using ="submit-button")
        public static WebElement SubmitButtonWebElement;

        public WebElement getSearchInputWebElement() {
            return searchInputWebElement;
        }
        public WebElement getSubmitButtonWebElement() {
            return SubmitButtonWebElement;
        }

        public void searchFor(String value){
            getSearchInputWebElement().sendKeys(value);
        }
        public void SubmitButton(){
            getSubmitButtonWebElement().click();
        }
        public void clearInput(){
            getSearchInputWebElement().clear();
        }
        public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException{
            List<String> list = dataBase.getItemsListFromDB();
            for(int i=0; i<list.size(); i++) {
                searchFor(list.get(i));
                getSubmitButtonWebElement();
                clearInput();
            }
        }

        public void searchItemsAndSubmitButton(WebDriver driver1)throws Exception, IOException, SQLException, ClassNotFoundException{
            List<String> list = dataBase.getItemsListFromDB();
            for(int i=0; i<list.size(); i++) {
                searchFor(list.get(i));
                getSubmitButtonWebElement();
                clearInput();
            }
        }

        public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException, SQLException, ClassNotFoundException {
// ToDo
//Read data from Excel file using Apache POI
            List<String> list = null;
            for(int i=0; i<list.size(); i++) {
                searchFor(list.get(i));
                getSubmitButtonWebElement();
                clearInput();
            }
        }

        public WebElement getSearchInputField() {
            return searchInputWebElement;
        }

        public void setSearchInputField(WebElement searchInputField) { this.searchInputWebElement = searchInputField;}

            public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
                List<String> itemList = dataBase.getItemsListFromDB();
                for(String st: itemList) {
                    getSearchInputField().sendKeys(st, Keys.ENTER);
                    getSearchInputField().clear();

                }
            }

        }
