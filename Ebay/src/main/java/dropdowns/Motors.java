package dropdowns;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class Motors extends CommonAPI {

    public Motors(){

        PageFactory.initElements (driver, this);
    }
}
