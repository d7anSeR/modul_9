package middle.second;

import java.util.Objects;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void push(int money) {
        balance += money;
    }

    public boolean pop(int money) {
        if (money > balance) {
            return false;
        } else {
            balance -= money;
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return balance == that.balance;
    }

    @Override
    public String toString() {
        return "BankAccount c текущим балансом равным " + balance + " руб.";
    }
}