package practice8;

public class BoundaryTesting {
    public static void main(String args[]) {
        int CALENDAR_START = 1583;
//        1582 2
//        1583 0
//        1583 13
//        1583 1
//        1583 12
        //1582 1
        int year = 1600;
        int month = 13;
        // validate input 
        if ((year <= CALENDAR_START) && (month >= 1) && (month <=12)) {
            System.out.println("Bad request: " + year + " " + month);
        }



    }

}
