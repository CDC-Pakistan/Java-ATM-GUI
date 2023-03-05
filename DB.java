import java.util.ArrayList;

public class DB {
    
    ArrayList<User> users;
    ArrayList<Account> accounts;
    ArrayList<Transaction> transactions;

    public DB() {
        // creating some dummy data
        users = new ArrayList<User>();
        accounts = new ArrayList<Account>();

        // adding some dummy users
        users.add(new User("John", "Smith"));
        users.add(new User("Jane", "Doe"));
        users.add(new User("Bob", "Smith"));

        // adding some dummy accounts of different types for
        // different users

        // user 1, business and current accounts
        accounts.add(new BusinessAccount(1000, users.get(0), "John's Business"));
        accounts.add(new CurrentAccount(2000, users.get(0), 1000));

        // user 2, saving and current accounts
        accounts.add(new SavingsAccount(3000, users.get(1), 0.5));
        accounts.add(new CurrentAccount(4000, users.get(1), 2000));

        // user 3, business and saving accounts
        accounts.add(new BusinessAccount(5000, users.get(2), "Bob's Business"));
        accounts.add(new SavingsAccount(6000, users.get(2), 0.5));

        // adding some dummy transactions
        transactions = new ArrayList<Transaction>();
        
        // user 1, withdraw from business account, format: (accountID, tType, tAmount)
        accounts.get(0).setBalance(accounts.get(0).getBalance() - 100);
        transactions.add(new Transaction(accounts.get(0).getAccountID(), "Withdraw", 100));

        // user 1, deposit to current account
        accounts.get(1).setBalance(accounts.get(1).getBalance() + 100);
        transactions.add(new Transaction(accounts.get(1).getAccountID(), "Deposit", 100));

        // user 2, withdraw from saving account
        accounts.get(2).setBalance(accounts.get(2).getBalance() - 100);
        transactions.add(new Transaction(accounts.get(2).getAccountID(), "Withdraw", 100));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}