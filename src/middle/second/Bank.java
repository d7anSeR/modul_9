package middle.second;


class Bank {
    private BankAccount[] bankAccounts;

    public Bank(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void moveMoney(BankAccount income, BankAccount outcome, int money) {
        if (money <= 0) {
            System.out.println("Сумма перевода должна быть больше 0");
        } else {
            for (BankAccount bankFirst : bankAccounts) {
                if (bankFirst.equals(income)) {
                    for (BankAccount bankSecond : bankAccounts) {
                        if (bankSecond.equals(outcome)) {
                            if (bankFirst.pop(money)) {
                                bankSecond.push(money);
                                System.out.println("Успешно переведено " + money + " руб. со счета " + income + " на счет " + outcome);
                            } else {
                                System.out.println("Недостаточно средств для перевода со счета " + income);
                            }
                        }
                    }
                }
            }
        }
    }
}
