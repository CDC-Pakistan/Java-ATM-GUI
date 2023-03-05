public class Account {
    String accountID;
    String password;
    double balance;
    User owner;

    public Account(double balance, User owner) {
        this.accountID = IDManager.generateID();
        this.password = IDManager.generatePassword();
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Account ID: " + accountID + " Balance: " + balance + " Owner: " + owner;
    }

    public static void main(String[] args) {

        User user = new User("John", "Doe");
        Account account = new Account(1000, user);
        System.out.println(account);

    }

}