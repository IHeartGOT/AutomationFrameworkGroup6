package clint.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.ProtectionDomain;
import java.util.InputMismatchException;
import java.util.Properties;

public class BaseTwitterClient {

    Properties properties = new Properties();
    InputStream inputStream = null;

    protected String apiKey;
    protected String apiSecretKey;
    protected String accessToken;
    protected String accessTokenSecret;
    protected String baseUri;

    public BaseTwitterClient() {
        this.baseUri = "https://api.twitter.com/1.1";
        try {
// load the properties file
            String path = "src/main/config/auth.properties";
            this.inputStream = new FileInputStream(path);

            this.properties.load(this.inputStream);
// set the keys and tokens
            this.apiKey = properties.getProperty("apiKey");
            this.apiSecretKey = properties.getProperty("apiSecretKey");
            this.accessToken = properties.getProperty("accessToken");
            this.accessTokenSecret = properties.getProperty("accessTokenSecret");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String getBaseUri() {
        return this.getBaseUri();
    }

    public String getFullUrl(String endpoint) {
        return this.getBaseUri() + endpoint;
    }
}


