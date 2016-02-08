public class Account {

    private Integer balance = 0;


    public Integer checkBalance() {
        return balance;
    }

    public void deposit(Integer amount) {
        if (amount >= 0) {
            balance += amount;
        }
    }

    public void withdraw(Integer amount) {
        balance -= amount;
    }

//    public static void statement {
//
//    }



}
