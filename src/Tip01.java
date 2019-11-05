

public class Tip01 {

    public static void main(String[] args) {

        //Find everyone's indivudlal total after tax(p5%) and tip(15%)

        double all = 0;

        all +=total(10,all);
        all +=total(12,all);
        all +=total(9,all);
        all +=total(8,all);
        all +=total(7,all);
        all +=total(11,all);
        all +=total(15,all);
        all +=total(30,all);
        System.out.println(all);



    }

    private static double total(int a,double all){
        double total1 = Math.round(a*1.2 * 10.0) / 10.0;;
        System.out.println(total1);
        return total1;

    }
}
