import BankApp.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBank {
    Bank app = new Bank("gtb", 318478898, 2345, 5000.0, "1171342223");

    @Test
    public void TestThatBankNameCanBeCreated() {
        app.setBankName("gtb");
        System.out.print("""
                **BankName** -->
                """);
        System.out.println(app.getBankName());
        Assertions.assertEquals("gtb", app.getBankName());
    }

    @Test
    public void TestThatAccountNumberCanBeCreated() {
        app.setAccountNumber(234567899);
        System.out.println("""
                **AccountNumber** -->""");
        System.out.println(app.getAccountNumber());
        Assertions.assertEquals(234567899, app.getAccountNumber());
    }

    @Test
    public void TestThatPinCanBeCreated() {
        app.setPin(2345);
        System.out.println("""
                **Pin** -->""");
        System.out.println(app.getPin());
        Assertions.assertEquals(2345, app.getPin());
    }

    @Test
    public void TestThatBvnCanBeCreated() {
        app.setBvn("23456789978");
        System.out.println("""
                **Bvn** -->""");
        System.out.println(app.getBvn());
        Assertions.assertEquals("23456789978", app.getBvn());
    }

    @Test
    public void TestThatTheUserCanSignIn() {
        app.signup(34567890, 2345, "23456789978");
        assertEquals(2345, app.getPin());
    }

    @Test
    public void TestThatMoneyCanBeAddedInMyAccount() {
        app.addBalance(5000.0);
        assertEquals(10000.0, app.getBalance());
    }

    @Test
    public void testMoneyTransferFromAccount() {
        Bank app = new Bank("gtb", 123456789, 1234, 10000.0, "1234567890");
        Bank recipient = new Bank("firstBank Bank", 345689087, 4567, 5000.0, "0987654321");

        app.transfer("1234567890", 1234, 5000.0, recipient);
        Assertions.assertEquals(5000.0, app.getBalance(), 0.0);
        Assertions.assertEquals(5000.0, app.getBalance() + 5000.0, recipient.getBalance(), String.valueOf(0.0));
    }
    @Test
    public  void TestCheckAccountBalance(){
        app.checkBalance(app.getCheckBalance());
        Assertions.assertEquals(5000.0, app.getCheckBalance());
    }
}




