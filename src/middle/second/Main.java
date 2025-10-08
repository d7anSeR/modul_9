package middle.second;

public class Main {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = {
                new BankAccount(12),
                new BankAccount(46),
                new BankAccount(35),
                new BankAccount(14),
                new BankAccount(34)

        };
        Bank bank = new Bank(bankAccounts);
        bank.moveMoney(bankAccounts[0],bankAccounts[1],11);
        bank.moveMoney(bankAccounts[0],bankAccounts[1],2); //ошибка
    }
}
