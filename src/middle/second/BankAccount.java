package middle.second;

class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void push(int money) {
        balance += money;
    }

    boolean pop(int money) {
        if (money > balance) {
            return false;
        } else {
            balance -= money;
            return true;
        }
    }
}