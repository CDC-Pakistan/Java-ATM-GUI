public class Transaction {
    String tID;
    String tType;
    double tAmount;
    String accountID;

    public Transaction(String accountID, String tType, double tAmount) {
        this.tID = IDManager.generateID();
        this.accountID = accountID;
        this.tType = tType;
        this.tAmount = tAmount;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String gettID() {
        return tID;
    }

    public void settID(String tID) {
        this.tID = tID;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }

    public double gettAmount() {
        return tAmount;
    }

    public void settAmount(double tAmount) {
        this.tAmount = tAmount;
    }

    public String toString() {
        return "Transaction ID: " + tID + " Transaction Type: " + tType + " Transaction Amount: " + tAmount;
    }

    public static void main(String[] args) {
        Transaction transaction = new Transaction("123", "Deposit", 1000);
        System.out.println(transaction);
    }

}