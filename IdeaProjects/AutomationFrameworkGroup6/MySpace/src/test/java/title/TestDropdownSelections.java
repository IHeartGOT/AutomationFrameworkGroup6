package title;

import base.CommonAPI;
import dropdown.More;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDropdownSelections extends CommonAPI {

    @Test
    public void TestMore(){

        More more= PageFactory.initElements (driver, More.class );
        more.AllCatPage ();
    }


}
