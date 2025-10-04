package hard.first;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private int maxBalance;
    private List<Account> accounts;

    Bank(int maxBalance) {
        this.maxBalance = maxBalance;
        this.accounts = new ArrayList<>();
    }

    Account createAccount(int initialBalance) {
        if (getTotalBalance() + initialBalance <= maxBalance) {
            Account account = new Account(initialBalance);
            accounts.add(account);
            System.out.println("Счёт создан: " + account);
            return account;
        } else {
            System.out.println("Нельзя создать счёт на " + initialBalance + "р. Превышен лимит банка.");
            return null;
        }
    }

    boolean transfer(Account from, Account to, int amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Перевод " + amount + "р: " + from + " → " + to);
            return true;
        } else {
            System.out.println("Перевод невозможен. Недостаточно средств на счёте " + from);
            return false;
        }
    }

    int getTotalBalance() {
        int sum = 0;
        for (Account acc : accounts) {
            sum += acc.getBalance();
        }
        return sum;
    }

    void showAccounts() {
        System.out.println("Все счета: " + accounts + " | Общий баланс: " + getTotalBalance() + "/" + maxBalance);
    }
}
