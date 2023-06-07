package BankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private int accountNumber;
    private int pin;
    private double balance;
    private String bvn;
    private  double checkBalance;
    List<Account> app = new ArrayList<>();



    public Bank(String bankName, int accountNumber, int pin, double balance, String bvn) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.bvn = bvn;

    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getBvn() {
        return bvn;
    }

    public void addBalance(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " added to the account.");
    }

    public void transfer(String sender, int pin,double amount, Bank recipient) {
        if (balance >= amount) {
            balance -= amount;
            recipient.addBalance(amount);
            System.out.println("Amount " + amount + " transferred to account " + recipient.getAccountNumber());

        } else {
            System.out.println("Insufficient balance to transfer " + amount);
        }
    }

    public void signup(int newAccountNumber, int newPin, String newBvn) {
        accountNumber = newAccountNumber;
        pin = newPin;
        bvn = newBvn;
        System.out.println("Account signed up successfully.");
    }


    public void checkBalance(double checkBalance) {
        this.checkBalance = checkBalance;{
        }
    }
    public double getCheckBalance(){
        return  checkBalance;
    }
}


