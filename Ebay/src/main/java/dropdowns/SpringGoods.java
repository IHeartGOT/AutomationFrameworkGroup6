package dropdowns;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class SpringGoods extends CommonAPI {

    public SpringGoods(){

        PageFactory.initElements (driver, this);
    }
}
