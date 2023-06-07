public class BrightAccount {
    private  double deposit;
    private int balance;
    private int withdraw;
    public void deposit(double deposit) {
        if (deposit>0)

        this.deposit = deposit;
    }

    public double getDeposit() {
        return balance;
    }


    public void balance(int balance) {
        this.balance = balance;
    }
    public  int getBalance(){
        return balance;
    }

    public void withdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getWithdraw() {
        return withdraw;
    }
}

