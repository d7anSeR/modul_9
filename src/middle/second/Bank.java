package middle.second;


class Bank {
    private BankAccount[] bankAccounts;

    Bank(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    void moveMoney(int i, int j, int money){
        if(i > bankAccounts.length || j > bankAccounts.length || (i - 1) < 0 || (j - 1) < 0){
            System.out.println("Невалидный номера какого-то из счетов");
        }
        else if(money <= 0){
            System.out.println("Сумма перевода должна быть больше 0");
        }
        else{
            if(bankAccounts[i-1].pop(money)){
                System.out.println("Успешно переведено " + money + " рублей со счета " + i + " на счет " + j);
                bankAccounts[j-1].push(money);
            }
            else{
                System.out.println("Недостаточно средств для перевода со счета " + i);
            }
        }
    }


}
