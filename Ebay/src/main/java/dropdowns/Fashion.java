package dropdowns;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class Fashion extends CommonAPI {

    public Fashion(){

        PageFactory.initElements (driver, this);
    }
}
