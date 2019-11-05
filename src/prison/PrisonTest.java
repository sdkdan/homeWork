package prison;

import static prison.Prisoner.getPrisonerCounter;

public class PrisonTest {
    public static void main(String[] args) {
        Prisoner prisoner1 = new Prisoner("Nikita",180,3);
//        prisoner1.height = 180;
//        prisoner1.name = "Nikita";
//        prisoner1.sentence = 100;
        Prisoner prisoner2 = new Prisoner("Ruslan",180,4);
//        prisoner1.height = 185;
//        prisoner1.name = "Ruslan";
//        prisoner1.sentence = 80;
        System.out.println(prisoner1 == prisoner2);
        prisoner1=prisoner2;
        System.out.println(prisoner1 == prisoner2);


//        String s1 = new String("Nikita");
//        String s2 = new String("Nikita");
//        Prisoner prisoner3 = new Prisoner();
////        prisoner3.height = 180;
////        prisoner3.name = s1;
////        prisoner3.sentence = 100;
//        Prisoner prisoner4 = new Prisoner();
////        prisoner4.height = 185;
////        prisoner4.name = s1;
////        prisoner4.sentence = 80;
//        System.out.println(prisoner3.name == prisoner4.name);
//
//
//        Prisoner p01 = new Prisoner();
//        System.out.println(p01.name + " "+ p01.height+" "+ p01.sentence);
//
//        Prisoner p02 = new Prisoner();
//        p02.setFields("dsf",10,3);
        Prisoner p01 = new Prisoner("abc",10,3);
        p01.display();
        p01.display(true);

//        Cell cell = new Cell("kamera",true);
//        p01.display();
//        p01.openDoor();
//        p01.openDoor();
        Cell cell = new Cell("camera", true, 3333);
        cell.open(3311);
        cell.open(3333);
        cell.open(3333);
        getPrisonerCounter();
    }
}
