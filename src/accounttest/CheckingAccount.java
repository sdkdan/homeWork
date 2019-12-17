package accounttest;

import static accounttest.AccountTest.checkingAccount;

public class CheckingAccount {
    public double balance;
    public String name;
    public CheckingAccount(double b, String n){
        this.balance = b;
        this.name =  n;
    }


    public static void withdraw(double d) {
        if (d < 0) {
            System.out.println("Сумма отрицательная");
        } else if (d > checkingAccount.balance) {
            System.out.println("Недостаточно средств");
        } else checkingAccount.balance = checkingAccount.balance - d;
        System.out.println(checkingAccount.balance);
    }


}

