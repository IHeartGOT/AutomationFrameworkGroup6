package fashionpage;

import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.Iterator;
import java.util.Set;

public class HometoFashion extends CommonAPI {

    @Test
    public void FashionElements(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a");
        clickByXpath ("//*[@id=\"gh-as-a\"]");
        typeByCssNEnter ("#_nkw", "ToysHobbies");

    }

}
