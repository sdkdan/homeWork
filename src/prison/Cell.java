package prison;

public class Cell {
    private String name;
    private boolean isOpened;
    private int code;

    public Cell(String s, boolean b, int c){
        this.name = s;
        this.isOpened = b;
        this.code = c;
    }

    public String getName() {
        return name;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void open(int c){
        if (c!=code){
            System.out.println("Код неверен");
        }
        else if (c == code){
            if(isOpened){
                isOpened = false;
                System.out.println("Дверь закрыта");
            }
            else{
                isOpened = true;
                System.out.println("Дверь открыта");
            }
        }

    }
}
