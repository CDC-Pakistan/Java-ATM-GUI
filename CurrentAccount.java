public class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(double balance, User owner, double overdraftLimit) {
        super(balance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public String toString() {
        return "Account ID: " + accountID + " Balance: " + balance + " Owner: " + owner + " Overdraft Limit: " + overdraftLimit;
    }
}