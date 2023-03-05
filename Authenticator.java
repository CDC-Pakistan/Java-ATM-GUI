import java.util.ArrayList;

public class Authenticator {
    public int authenticateUser(ArrayList<Account> accounts, String accountID, String accountPassword) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountID().equals(accountID) && accounts.get(i).getPassword().equals(accountPassword)) {
                return i;
            }
        }
        return -1;
    }
}