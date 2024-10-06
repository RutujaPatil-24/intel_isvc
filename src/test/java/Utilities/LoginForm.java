package Utilities;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginForm {

    public static void main(String[] args) {
        // Load properties
        Properties prop = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Get the URL, encrypted username, and encrypted password from the properties file
        String url = prop.getProperty("url");
        String encryptedUsername = prop.getProperty("username");
        String encryptedPassword = prop.getProperty("password");

        // Decrypt the username and password
        String decryptedUsername = "";
        String decryptedPassword = "";
        try {
            decryptedUsername = EncryptionUtil.decrypt(encryptedUsername);
            decryptedPassword = EncryptionUtil.decrypt(encryptedPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create the GUI
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Username field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 10, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        frame.add(userText);

        // Password field (masked)
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(10, 50, 80, 25);
        frame.add(passLabel);

        JPasswordField passText = new JPasswordField(20);
        passText.setBounds(100, 50, 160, 25);
        frame.add(passText);

        // Button for login action
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 90, 80, 25);
        frame.add(loginButton);

        // On clicking the login button, retrieve and check the username and password
        String finalDecryptedUsername = decryptedUsername;
        String finalDecryptedPassword = decryptedPassword;
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputUsername = userText.getText();
                String inputPassword = new String(passText.getPassword());

                // Compare entered username and password with decrypted values
                if (inputUsername.equals(finalDecryptedUsername) && inputPassword.equals(finalDecryptedPassword)) {
                    System.out.println("Login Successful!");
                } else {
                    System.out.println("Invalid Username or Password!");
                }
            }
        });

        frame.setVisible(true);
    }

}
