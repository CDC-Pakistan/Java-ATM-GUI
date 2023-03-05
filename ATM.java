
public class ATM{

    String loggedInID;

    AuthScreen authScreen;
    AccountScreen accountScreen = null;

    DB db;
    Authenticator auth;

    public ATM() {

        db = new DB();
        auth = new Authenticator();

        // initialize screens

        // this screen handles authentication
        AuthScreen authScreen = new AuthScreen((accountID, authScreenObject) -> {
            
            loggedInID = accountID;

            // this screen handles account operations
            accountScreen = new AccountScreen(accountID, db, auth);
            
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
