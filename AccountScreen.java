import java.awt.*;
import javax.swing.*;

public class AccountScreen extends JFrame {
    public AccountScreen(String loggedInID, DB db, Authenticator auth) {

        // find the account object for the logged in user
        Account account = db.getAccounts().stream().filter(a -> a.getAccountID().equals(loggedInID)).findFirst().get();

        System.out.println("AccountScreen: " + account.getOwner().getFirstName() + " " + account.getOwner().getLastName());

        setTitle("Account Operations");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        // create ui elements
        JLabel welcomeLabel = new JLabel("Welcome, " + account.getOwner().getFirstName() + " " + account.getOwner().getLastName());
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        
        // add ui elements to layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        add(welcomeLabel, gbc);

    }
}
