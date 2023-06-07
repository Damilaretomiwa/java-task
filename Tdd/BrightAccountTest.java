import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BrightAccountTest {
    BrightAccount brightAccount;
    @BeforeEach
    public void startWith(){
        brightAccount = new BrightAccount();

    }
    @Test
    public void TestAccountDeposit(){
        brightAccount.deposit(5000);
        assertEquals(0,brightAccount.getDeposit());
    }
    @Test
    public  void TestAccountBalance(){
        brightAccount.balance(5000);
        assertEquals(0,brightAccount.getBalance());
    }
    @Test
    public  void  TestAccountWithdraw(){
        brightAccount.withdraw(9000);
        assertEquals(9000,brightAccount.getWithdraw());
    }

}
