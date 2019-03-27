package dropdowns;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class Electronics extends CommonAPI {

    public Electronics(){

        PageFactory.initElements (driver, this);
    }
}
