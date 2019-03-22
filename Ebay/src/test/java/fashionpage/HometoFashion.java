package fashionpage;

import base.CommonAPI;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class HometoFashion extends CommonAPI {

    @Test
    public void FashionElements(){
        clickByXpath ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a");
        Set<String>ids= driver.getWindowHandles();
        Iterator<String>it=ids.iterator ();
        String HomeId = it.next ();
        String FashionId =it.next ();
        driver.switchTo().window(FashionId);

    }

}
