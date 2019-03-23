package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchButton extends CommonAPI {

    @Test
    public void TestSearch(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/div");
    }
    @Test
    public void TestDrama(){

    }







}
