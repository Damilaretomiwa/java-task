import BankApp.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testAccountDeposit(){
        Account account = new Account();
        account.deposit(0);
        Assertions.assertEquals(0,account.checkBalance());
    }

    @Test
    public void testAccountWithdrawal() {
        Account bright = new Account();
        bright.deposit(0);
        bright.withdraw(0);
        Assertions.assertEquals(0, bright.checkBalance());
    }
    @Test
    public void testAccountCheckBalance(){
        Account bright=new Account();
        bright.checkBalance();

    }

}
