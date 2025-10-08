package middle.first;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void push(int money) {
        if (money <= 0) {
            System.out.println("Внесенная сумма денег должна быть больше 0");
        } else {
            System.out.println("Внесли " + money + " рублей на счет");
            balance += money;
        }
    }

    public void pop(int money) {
        if (money > balance) {
            System.out.println("Недостаточно средств на банковском счете");
        } else if (money <= 0) {
            System.out.println("Списываемая сумма денег должна быть больше 0");
        } else {
            System.out.println("Было снято " + money + " рублей со счета");
            balance -= money;
        }
    }
}
