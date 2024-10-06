package Utilities;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigWriter {

    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            // Encrypt the username and password
            String encryptedUsername = EncryptionUtil.encrypt("r4cl1agent02@intel.com.isvcqa24");
            String encryptedPassword = EncryptionUtil.encrypt("Intel@369");

            // Set properties
            prop.setProperty("url", "https://isvc--isvcqa24.sandbox.my.salesforce.com");
            prop.setProperty("username", encryptedUsername);
            prop.setProperty("password", encryptedPassword);

            // Save to config.properties file
            prop.store(new FileOutputStream("config.properties"), null);
            System.out.println("Config file saved with encrypted username and password.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
