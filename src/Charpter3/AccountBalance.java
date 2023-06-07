package Charpter3;

public class AccountBalance {
    private String name;
    private double balance;

    public AccountBalance(String name) {
        this.name = name;
    }

    public AccountBalance(double balance) {
        this.balance = balance;
        if (balance > 0.0) {
            this .balance = balance;


        }
    }
}
