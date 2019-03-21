package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SearchBox extends CommonAPI {

    @Test
    public void Search(){
        typeOnIdEnter("gh-ac","Laptops");
    }

}
