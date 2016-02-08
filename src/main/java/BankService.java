/**
 * Created by KAdamczyk on 2016-02-08.
 */
public class BankService {

    public static void transfer(Integer amount, Account accountToWitdraw, Account accountToDeposit){
         accountToWitdraw.withdraw(amount);
        accountToDeposit.deposit(amount);
    }



}
