import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by KAdamczyk on 2016-02-08.
 */
public class testBankService {
    Account account;

    @Before
    public void initAccount() {
        account = new Account();
    }

    @Test
    public void testTransferPositiveAmount() {
        Integer transferAmount = 500;
        Integer checkTransfer = 0;
        Account transferAccount = new Account();
        account.deposit(transferAmount);
        BankService.transfer(transferAmount,account, transferAccount);

        Assert.assertEquals(checkTransfer, (account.checkBalance()));
        Assert.assertEquals(transferAmount, (transferAccount.checkBalance()));
    }
}
