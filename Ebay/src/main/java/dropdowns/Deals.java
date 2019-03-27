package dropdowns;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class Deals extends CommonAPI {

    public Deals(){
        PageFactory.initElements (driver, this);
    }
}
