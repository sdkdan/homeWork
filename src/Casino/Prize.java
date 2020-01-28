package Casino;

import java.util.Random;

public class Prize {
    private String prize;
    private int price;
    private String prize1;
    public Prize(String prise, int price) {
        this.prize = prise;
        this.price = price;
    }

    public String getPrize() {
        return prize;
    }

    public static int play(){
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println("Выиграно: "+i);
        return i;
    }

    public void setPrize(String prise) {
        this.prize = prize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
