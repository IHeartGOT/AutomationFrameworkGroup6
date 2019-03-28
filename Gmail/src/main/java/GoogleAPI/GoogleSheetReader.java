package GoogleAPI;

import base.CommonAPI;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import org.seleniumhq.jetty9.util.security.Credential;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

   public class GoogleSheetReader extends CommonAPI {

    private static final String APPLICATION_NAME = "My Project 3864";
    // Directory to store user credentials for this application.
    private static final java.io.File DATA_STORE_DIR = new java.io.File(System.getProperty("user.dir"), ".credentials/sheets-googleapis/");
    // Global instance of the {@link FileDataStoreFactory}.
    public static FileDataStoreFactory DATA_STORE_FACTORY;
    // Global instance of the JSON factory.
    public static final JsonFactory JSON_FACTORY = JsonFactory.getDefaultInstance();
    // Global instance of the HTTP transport.
    private static NetHttpTransport HTTP_TRANSPORT;
    // Global instance of the scopes
    private static final List<String> SCOPES = Arrays.asList(SheetsScopes.SPREADSHEETS_READONLY);

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }
    public static <credential> Credential authorize() throws IOException {
        // Load client secrets.
        InputStream in = GoogleSheetReader.class.getResourceAsStream("/credentials.json");
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES) {
                .

            setDataStoreFactory(DATA_STORE_FACTORY).

            setAccessType("offline").

            build() {

            }

            com.google.api.client.auth.oauth2.Credential credential = new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
        System.out.println("Credentials saved to "+DATA_STORE_DIR.getAbsolutePath());
        return credential;

            public Sheets getSheetsService() throws IOException {
                Credential credential = authorize();
                Sheets sheets = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, (HttpRequestInitializer) credential)
                        .setApplicationName(APPLICATION_NAME).build();
                return sheets;
            }
        }
    }
}
