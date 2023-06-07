package BankApp;

public class Account {
    private int balance = 0;

    public void deposit(int amount) {
        balance = balance + amount;
    }
    public int checkBalance(){
        return  balance;
    }
    public  void  withdraw(int amount){
        balance = balance -amount;
    }
}



