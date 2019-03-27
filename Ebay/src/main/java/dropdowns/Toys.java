package dropdowns;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class Toys extends CommonAPI {

    public Toys(){

        PageFactory.initElements (driver, this);
    }
}
