
import BankApp.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 public class TestCustomer {
    Customer customer = new Customer("bright","joy","Saving","08071372723");

    @Test
    public  void TestCustomerFirstName(){
        customer.setFirstName("bright");
        System.out.println(customer.getFirstName());
        assertEquals("bright",customer.getFirstName());
    }
    @Test
    public  void TestCustomerSecondName(){
        customer.setSecondName("joy");
        System.out.println(customer.getSecondName());
        assertEquals("joy",customer.getSecondName());

    }

    @Test
    public  void TestAccountType(){
        customer.setAccountType("current");
        System.out.println(customer.getAccountType());
        assertEquals("current",customer.getAccountType());
    }
    @Test
     public void TestPhoneNumberCanBeCreated(){
        customer.setPhoneNumber("08071372723");
        assertEquals("08071372723",customer.getPhoneNumber());
    }
}
