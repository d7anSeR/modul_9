package hard.first;

class Account {
    private int balance;

    Account(int initialBalance) {
        this.balance = initialBalance;
    }

    int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    boolean withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account: " + "balance=" + balance + "";
    }
}
