package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  TitlePage extends CommonAPI {

    @Test
    public void test1() {
        System.out.println(driver.getTitle());
    }
}
