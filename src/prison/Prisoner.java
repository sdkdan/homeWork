package prison;

public class Prisoner {
    private String name;
    private double height;
    private static int prisonerCounter = 0;
    private static int bookingCounter = prisonerCounter;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSentence() {
        return sentence;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public static int getPrisonerCounter() {
        return prisonerCounter;
    }

    public static int getBookingCounter() {
        return bookingCounter;
    }

    private int sentence;
    //Cell cell = new Cell("camera1", true);
    Cell cell = new Cell("camera", true, 3444);

    public Prisoner(String n, double d, int s){
        System.out.println("Это конструктор");
        this.name = n;
        this.height = d;
        this.sentence = s;
        prisonerCounter++;
    }

    public Prisoner(){
        this.name = null;
        this.height = 0.0;
        this.sentence = 0;
        prisonerCounter++;
    }
    public void think(){
        System.out.println("PHP rulit");
    }

    public void setFields(String n, double d, int s){
        this.name = n;
        this.height = d;
        this.sentence = s;
    }


    public  void display() {
        System.out.println( "Prisoner{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", sentence=" + sentence +
                ", name=" + cell.getName() +
                ", prisonerCounter=" + prisonerCounter +
                ", bookingCounter=" + bookingCounter +
                '}');
    }

    public void display(boolean b){
        if(b) {think();}
         else;
    }

//    public void openDoor(){
//        if (cell.isOpened = true) {
//            cell.isOpened = false;
//            System.out.println("Дверь закрыта");
//        }
//        else {
//            cell.isOpened = true;
//            System.out.println("Дверь открыта");
//        }
//
//    }
}
