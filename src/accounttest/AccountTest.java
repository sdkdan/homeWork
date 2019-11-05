package accounttest;

public class AccountTest {
    public static void main(String[] args) {
//        Bond bond = new Bond();
//        bond.balance = 100;
//        //int i= 60;
//
//        bond.setTermAndRate(60);
//        bond.earnInterest();

        double sum = 10;
        for (int i=0; i<12000; i++){
            sum += sum*0.01;
        }
        System.out.println(sum);
    }
}
