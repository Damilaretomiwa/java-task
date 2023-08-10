package BankApp;

import javax.swing.*;

public class main {
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        startApp();
    }

    public static void startApp(){

        String menu = """
                1. Sign Up
                2. Login
                
                """;


        String userInput = inputCollector(menu);
        switch (userInput){
            case "1" -> signUp();
            case "2" -> login();
            default -> startApp();
        }
    }




    public static void signUp() {
        String firstName = inputCollector("Enter your firstname");
        String lastName = inputCollector("Enter your lastname");
        String pin = inputCollector("Create a pin");

        while (!verifyPin(pin)){
            displayMessage("Invalid Pin Please Create a four digit pin");
            pin = inputCollector("Create a pin");
        }
        String phoneNumber = inputCollector("Enter a valid phoneNumber");
        while (!verifyPhoneNumber(phoneNumber)){
            displayMessage("Invalid PhoneNumber");
            phoneNumber = inputCollector("Enter your phoneNumber");
        }

        String password = inputCollector("Create Your password");
        try {
            bank.createAccount(phoneNumber, firstName, lastName, pin, password);
        }
        catch (IllegalArgumentException e){
            displayMessage("Account Already Exist");
            startApp();
        }
        displayMessage("Account Created Successfully");
        homePage();
    }

    private static void homePage() {
        String menu = """
                1. Deposit
                2. Transfer
                3. Withdraw
                4. Check Balance
                5. Logout""";
        String userInput = inputCollector(menu);

        switch (userInput){
            case "1" -> deposit();
            case "2" -> transfer();
            case "3" -> withdraw();
            case "4" -> checkBalance();
            case "5" -> startApp();
        }
    }

    private static void transfer(){
        String senderAccountNumbers = inputCollector("enter sender accountNumber");
        String recipientAccountNumber = inputCollector("enter recipient account number ");

//        try {
//            AccountBank senderAccount = bank.findAccountById(senderAccountNumbers);
//            AccountBank recipientAccount = bank.findAccountById(recipientAccountNumber);
//            homePage();
//        }
//        catch ();








    }

    private static void withdraw() {


    }

    private static void checkBalance() {
        String accountNumber = inputCollector("Enter Your Account Number");
        try {
            AccountBank account  = bank.findAccountById(accountNumber);
            displayMessage("Balance: "+account.getBalance());
            homePage();
        }
        catch (NullPointerException e){
            displayMessage("Account does not exist");
            homePage();
        }

    }

    private static void deposit() {
        String accountNumber = inputCollector("Enter your Account number");
        double amount = Double.parseDouble(inputCollector("Enter amount to be deposited"));
        try {
            AccountBank account = bank.findAccountById(accountNumber);
            account.deposit(amount);
            displayMessage("Successfully deposited "+ amount + "  to " +account.getFirstName() + " Account");
            homePage();
        }
        catch (NullPointerException e){
            displayMessage("Account Does not exist");
        }
    }

    private static boolean verifyPhoneNumber(String phoneNumber){
        return phoneNumber.length() == 11;
    }

    private static boolean verifyPin(String pin){
        return pin.length() == 4;
    }

    public static void login(){
        String accountNumber = inputCollector("Enter Account Number");
        String password = inputCollector("Enter Password");
        try {
            AccountBank account =  bank.findAccountByIdAndPassword(accountNumber, password);
            displayMessage("Welcome "+ account.getFirstName());
            homePage();

        }
        catch (NullPointerException e){
            displayMessage("Invalid Credentials");
            startApp();
        }

    }

    public static String inputCollector(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static void displayMessage(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }
}
