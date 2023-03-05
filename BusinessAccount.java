public class BusinessAccount extends Account {
    String businessName;

    public BusinessAccount(double balance, User owner, String businessName) {
        super(balance, owner);
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String toString() {
        return "Account ID: " + accountID + " Balance: " + balance + " Owner: " + owner + " Business Name: " + businessName;
    }
}