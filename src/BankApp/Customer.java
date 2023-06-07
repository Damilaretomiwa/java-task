package BankApp;

public class Customer {
    private String firstName;
    private  String secondName;
    private String  accountType;
    private  String phoneNumber;


    public Customer(String firstName, String secondName, String accountType, String phoneNumber){
        this.firstName = firstName;
        this.secondName = secondName;
        this.accountType = accountType;
        this.phoneNumber = phoneNumber;

    }
    public  void  setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return  firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public  String getSecondName(){
        return secondName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountType(){
        return accountType;
    }
    public  void  setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public  String getPhoneNumber(){
        return  phoneNumber;

    }

}


