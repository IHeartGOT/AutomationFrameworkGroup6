package title;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CnnHome extends CommonAPI {

    @Test

    public void Test1() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "cnn.com: Breaking news, Latest news and Videos ");
    }



}
