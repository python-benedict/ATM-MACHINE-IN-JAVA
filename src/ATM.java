public class ATM {
    private double balance;
    private double depositeAmount;
    private double withdrawnAmount;


    // Default constructor
    public  ATM(){

    }

    // Getters and setters method for all the fields


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositeAmount() {
        return depositeAmount;
    }

    public void setDepositeAmount(double depositeAmount) {
        this.depositeAmount = depositeAmount;
    }

    public double getWithdrawnAmount() {
        return withdrawnAmount;
    }

    public void setWithdrawnAmount(double withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
    }
}
