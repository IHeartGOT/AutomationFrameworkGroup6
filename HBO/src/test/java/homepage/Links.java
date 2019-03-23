package homepage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Links extends CommonAPI {

    @Test
    public void Links() {
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a");
    }










}