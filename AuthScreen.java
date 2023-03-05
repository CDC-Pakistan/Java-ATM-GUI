import java.awt.*;
import javax.swing.*;
import java.util.function.BiConsumer;

public class AuthScreen extends JFrame {

    public AuthScreen(BiConsumer<String, AuthScreen> authHandler, DB db, Authenticator auth) {


        // specify the ui properties
        setTitle("ATM");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        // create ui elements
        JLabel topHeading = new JLabel("ATM Machine");
        topHeading.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel userLabel = new JLabel("USERNAME (Dummy: " + db.getAccounts().get(0).getAccountID() + ")");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField userField = new JTextField(19);

        JLabel passLabel = new JLabel("PASSWORD (Dummy: " + db.getAccounts().get(0).getPassword() + ")");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        JPasswordField passField = new JPasswordField(19);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setPreferredSize(new Dimension(100, 50));

        // add action listener to the login button
        loginButton.addActionListener(e -> {


            // get the username and password from the text fields
            String username = userField.getText();
            String password = new String(passField.getPassword());
            
            
            // authenticate the user
            int accountIndex = auth.authenticateUser(db.getAccounts(), username, password);
            
            
            if (accountIndex == -1) {
                // login failed
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            }
            else {
                // login successful
                authHandler.accept(username, this);
            }

        });

        // add these ui elements to the layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.NORTH;
        add(topHeading, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(userLabel, gbc);

        gbc.gridy = 2;
        add(userField, gbc);

        gbc.gridy = 3;
        add(passLabel, gbc);

        gbc.gridy = 4;
        add(passField, gbc);

        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(loginButton, gbc);

    }

}