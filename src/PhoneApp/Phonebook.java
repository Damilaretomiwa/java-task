package PhoneApp;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String model;
    private  String userName;
    private String userId;
    private  String password;
    private  String email;
    private List<Contact> contacts;

    public Phone() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added: " + contact.getName());
        }


    public void displayContacts() {

        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("-----------------------");
        }
    }


    public  Phone(String model,String userName,String userId,String password,String email){
        this.model = model;
        this.userName = userName;
        this.userId = userId;
        this.password = password;
        this.email = email;
    }
    public  void setModel (String model){
        this.model = model;

    }
    public  String getModel(){
        return  model;
    }


    public void setUserName(String userName) {
        this.userName = userName;

    }
    public String getUserName(){
        return  userName;
    }
    public  void setUserId(String userId){
        this.userId = userId;
    }
    public  String getUserId(){
        return userId;
    }
    public void  setPassword(String password){
        this.password = password;
    }
    public  String getPassword(){
        return  password;
    }
    public  void  setEmail(String email){
        this.email = email;
    }
    public  String getEmail (){
        return  email;
    }
}
