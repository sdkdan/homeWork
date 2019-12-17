package Casino;

public class Prize {
    private String prize;
    private int price;
    public Prize(String prise, int price) {
        this.prize = prise;
        this.price = price;
    }

    public String getPrize() {
        return prize;
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
