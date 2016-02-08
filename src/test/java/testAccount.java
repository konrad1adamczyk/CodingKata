import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.beans.Statement;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by KAdamczyk on 2016-02-08.
 */
public class testAccount {
    Account account;

    @Before
    public void initAccount() {
        account = new Account();
    }

    @Test
    public void testDepositPositiveAmount() {
        Integer depositAmount = 500;
        account.deposit(depositAmount);
        assertTrue(depositAmount.equals(account.checkBalance()));
    }

    @Test
    public void testDepositPositiveAmountTwice() {
        //given
        Integer depositAmount = 500;
        Integer checkDeposit = 1000;
        //when
        account.deposit(depositAmount);
        account.deposit(depositAmount);
        //then
        Assert.assertEquals(checkDeposit, (account.checkBalance()));
    }

    @Test
    public void testDepositNegativeAmount() {
        Integer depositNegativeAmount = -500;
        Integer expectedBalance = 0;
        account.deposit(depositNegativeAmount);
        Assert.assertEquals(expectedBalance, account.checkBalance());
    }

    @Test
    public void testWithdrawNotBigerThenActualAmmount() {
        account.deposit(500);
        Integer checkWitdraw = 0;
        Integer withdrawAmount = 500;
        account.withdraw(withdrawAmount);
        Assert.assertEquals(checkWitdraw, (account.checkBalance()));
    }


    @Test

    public void testWithdrawNotBigerThenActualAmmountTwice() {
        account.deposit(1000);
        Integer withdrawAmount = 500;
        Integer checkWitdraw = 0;
        account.withdraw(withdrawAmount);
        account.withdraw(withdrawAmount);
        Assert.assertEquals(checkWitdraw, (account.checkBalance()));
    }

    @Test
    public void testStatementAfterDeposit() {
        account.deposit(500);
        List<Statement> statement = account.checkStatement();
        Assert.assertEquals(statement.size(), 1);
        Statement depositStatement = statement.get(0);
        Assert.assertEquals(depositStatement.checkDate, )

    }




}

