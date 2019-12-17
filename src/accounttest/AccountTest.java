package accounttest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AccountTest {
    static CheckingAccount checkingAccount = new CheckingAccount(200, "fd");



    public static void main(String[] args) {
        Bond bond = new Bond();
        bond.balance = 1000;
        //int i= 60;
        //bond.earnInterest();
        CheckingAccount.withdraw(20);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
          //  int a = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            bond.setTermAndRate(n);
            bond.earnInterest();
        } catch (Exception e) {
            e.printStackTrace();
        }


//        checkingAccount.name  = "df";
//        checkingAccount.balance = 22;
        //withdraw(2);


    }

}
