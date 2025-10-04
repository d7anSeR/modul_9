package hard.first;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(1000);

        Account acc1 = bank.createAccount(400);
        Account acc2 = bank.createAccount(500);
        bank.showAccounts();
        if (acc1 != null && acc2 != null) {
            bank.transfer(acc1, acc2, 200);
        }
        bank.showAccounts();
        if (acc1 != null && acc2 != null) {
            bank.transfer(acc1, acc2, 500);
        }
        bank.showAccounts();
    }
}
