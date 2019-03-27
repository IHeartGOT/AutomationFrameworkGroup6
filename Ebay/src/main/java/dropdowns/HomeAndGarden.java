package dropdowns;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class HomeAndGarden extends CommonAPI {

    public HomeAndGarden(){

        PageFactory.initElements (driver, this);
    }
}
