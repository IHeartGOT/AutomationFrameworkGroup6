package moviespage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Links extends CommonAPI {

    @Test
    public void Movies(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div[2]/div/div/div/ul/li[2]/div/a");
    }
    @Test
    public void Series(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/ul/li[1]/div/a");
    }
    @Test
    public void Specials(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/ul/li[3]/div/a");
    }
    @Test
    public void Sports(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/ul/li[4]/div/a");
    }
    @Test
    public void Kids(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/ul/li[5]/div/a");
    }
    @Test
    public void SearchIcon(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/div");
    }
    @Test
    public void FreeEpisodes(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/ul/li[1]/div/a");
    }
    @Test
    public void Schedule(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/ul/li[2]/div/a");
    }
    @Test
    public void SignIn(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/ul/li[3]/div/span");
    }
    @Test
    public void GetHbo(){
        clickByXpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/div/a");
    }
}
