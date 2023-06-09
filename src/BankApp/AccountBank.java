package BankApp;

public class Account {
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private  String accountNumber;
    private String firstName;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private String lastName;
    private String pin;
    private String phoneNumber;

    private double balance = 0;

    public void deposit(double amount) {
        balance = balance + amount;
    }
    public double checkBalance(){
        return  balance;
    }
    public void  withdraw(double amount){
        balance = balance -amount;
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}



