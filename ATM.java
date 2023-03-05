
public class ATM{

    DB db;
    Authenticator auth;
    AuthScreen authScreen;
    AccountScreen accountScreen;


    public ATM() {

        db = new DB();                      // initialize database
        auth = new Authenticator();         // initialize authenticator


        // log all accounts and their passwords
        System.out.println("Dummy Accounts:");
        db.getAccounts().forEach(account -> {
            System.out.println("Username: " + account.getAccountID() + " Password: " + account.getPassword());
        });

        // initialize screens

        // this screen handles authentication
        AuthScreen authScreen = new AuthScreen((accountID, authScreenObject) -> {

            // this screen handles account operations
            accountScreen = new AccountScreen(accountID, db, auth, () -> {
                // handles when user logs out.
                authScreenObject.setVisible(true);
            });
            
            authScreenObject.setVisible(false);
            accountScreen.setVisible(true);

        }, db, auth);

        // show the auth screen
        authScreen.setVisible(true);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
    }
}
