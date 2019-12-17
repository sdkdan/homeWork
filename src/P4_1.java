public class P4_1 {
    public static void main(String[] args) {
        Double tip = 0.15, tax = 0.05;

        Double person1 = 10.0;
        Double person2 = 12.0;
        Double person3 = 9.0;
        Double total1 = person1*(1+tax+tip);
        Double total2 = person2*(1+tax+tip);
        Double total3 = person3*(1+tax+tip);
        System.out.println("guest1: "+ total1+ " guest2: "+total2+" guest3: " + total3);

        Calc4_1 calc = new Calc4_1();
        Double total0=0.0;
        Double[] persons = {10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0};
        for ( int i=0; i<7; i++) {

            System.out.print("guest "+i+": ");
            calc.findTotal(persons[i]);
            total0 = calc.findTotal(persons[i]) + total0;
//            calc.findTotal1(i, null);
        }
        System.out.println(total0 + "ff");
        //System.out.println( calc.findTotal1(10, null));

        Double[] persons1 = {10.0, 12.0, 9.0, 8.0, 7.0, 11.0};
        for ( int i=0; i<7; i++) {

            calc.findTotal1(i, null);
        }
//        System.out.println( calc.findTotal1(10, null));
        System.out.println(total0);




    }
}
