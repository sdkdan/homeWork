import javax.swing.*;

public class SCart {

        public static void main(String[] args) {
//            String custName = "Alex";
//            String itemDesc = "Shirts";
//            String message = custName+" wants to purchase a "+itemDesc;
//            int quantity=p5;
//            double tax=0.1,price=10,totalprice;
//            // Declare and initialize numeric fields: price, tax, quantity.
////
//
//
            // Declare and assign a calculated totalPrice
          //  totalprice = quantity*price+tax;
//            String gibberish = "21";
//            int gib = Integer.parseInt(gibberish);
//           // tax = totalprice*0.12;
//
//            // Modify message to include quantity
//
//            System.out.println(message);
//            System.out.println("Общая стоимость с налогом: "+totalprice);
//
//            // Print another message with the total cost
//
//
//                //RUN THE PROGRAM BETWEEN EACH STEP AND OBSERVE THE OUTPUT
//                //Step 1) Change the print statements in lines 12 and 16 so that they print the value of x.
//                //Step 2) Change the value of x to "kitty".
//                String x = "kitty";
//                System.out.println(x);
//
//                //Step 3) Add a line of code that changes the value of x to "bunny".
//
//                System.out.println("bunny");
//            boolean bool = true;

            short s = 129;
            byte s1 = (byte)s; //сужение типа
           // System.out.println(s1);

            String input = (String) JOptionPane.showInputDialog(null,
                    "test",
                    "Заголовок диалогового окна",
                    2,
                    null,
                    null,
                    "Введите число.");

           // System.out.println(input);
            int i = (Integer.parseInt(input))+1;
            System.out.println(i);




            String shirtPrice="12", taxRate="12", gibberish="ewewrewr";
            int a,b,c;
            a = Integer.parseInt(shirtPrice);
            b = Integer.parseInt(taxRate);
            c = Integer.parseInt(gibberish);

            double totalTax = a*b;
//            System.out.println(c);
//            System.out.println(c);
            System.out.println(c);
           // int t1 = Integer.parseInt(totalTax);

            //System.out.println(Byte.parseByte(s));


//            int intVar1 = 1;
//            int intVar2 = 2;
//            int intVar3 = 3;
//
//            double doubleVar1, doubleVar2, doubleVar3, doubleVar4=0;
//            doubleVar1 = 1.1;
//            doubleVar2 = 2.1;
//            doubleVar3 = 3.1;
//
//
//            String stringVar1 = "1";
//            String stringVar2 = "2";
//
//            //Don't edit these print statements
//            System.out.println("bool = "        +bool);
//            System.out.println("intVar1 = "     +intVar1);
//            System.out.println("intVar2 = "     +intVar2);
//            System.out.println("intVar3 = "     +intVar3);
//            System.out.println("doubleVar1 = "  +doubleVar1);
//            System.out.println("doubleVar2 = "  +doubleVar2);
//            System.out.println("doubleVar3 = "  +doubleVar3);
//            System.out.println("doubleVar4 = "  +doubleVar4);
//            System.out.println("stringVar1 = "  +(stringVar1 +1));
//            System.out.println("stringVar2 = "  +(stringVar2 +2));
        }
    }


