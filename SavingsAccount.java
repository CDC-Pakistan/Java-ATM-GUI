public class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(double balance, User owner, double interestRate) {
        super(balance, owner);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String toString() {
        return "Account ID: " + accountID + " Balance: " + balance + " Owner: " + owner + " Interest Rate: " + interestRate;
    }
}