package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
	public static void main(String[] args) {
        Properties prop = new Properties();
        
        try (FileInputStream input = new FileInputStream("config.properties")) {
            
            // Load properties file
            prop.load(input);

            // Get encrypted values
            String url = prop.getProperty("url");
            String encryptedUsername = prop.getProperty("username");
            String encryptedPassword = prop.getProperty("password");

            // Decrypt sensitive data
            String username = EncryptionUtil.decrypt(encryptedUsername);
            String password = EncryptionUtil.decrypt(encryptedPassword);

            // Use the decrypted data
            System.out.println("URL: " + url);
            System.out.println("Decrypted Username: " + username);
            System.out.println("Decrypted Password: " + password);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
