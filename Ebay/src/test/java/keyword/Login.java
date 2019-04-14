package keyword;

import base.CommonAPI;
import org.testng.annotations.Test;


public class Login extends CommonAPI {

    public KeyWordEngine keyWordEngine;

    @Test
    public void loginTest(){
        keyWordEngine = new KeyWordEngine();
        keyWordEngine.startExecution("login");
    }

    @Test
    public void signUpTest(){
        keyWordEngine = new KeyWordEngine();
        keyWordEngine.startExecution("signup");
    }

}
