package fashionpage;

import base.CommonAPI;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class HometoFashion extends CommonAPI {

    @Test
    public void FashionElements(){
        clickByXpath ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a");
        clickByXpath ("//*[@id=\"gh-as-a\"]");
        typeByCssNEnter ("#_nkw", "Toys");

    }

}
