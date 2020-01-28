package Casino;

import java.util.ArrayList;

public class Terminal {
    public int getCardCreditBalance(Card card){
        return card.getCreditsBalance();
    }

    public int getCardTicketBalance(Card card){
        return card.getBalanceTickets();
    }

    private ArrayList<Prize> prizes = new ArrayList<>();

    public Terminal(ArrayList<Prize> prises) {
        this.prizes = prises;
    }

    public void getPrises(){
        for (int i = 0; i < prizes.size(); i++) {
            System.out.println("Prise: " + prizes.get(i).getPrize() + " price: " + prizes.get(i).getPrice() + " number " + i);
        }
    }

    public void buyPrise(int PriseNumber , Card card) {
        if (prizes.get(PriseNumber).getPrice() < card.getBalanceTickets()) {
            card.setBalanceTickets(card.getBalanceTickets() - prizes.get(PriseNumber).getPrice());
            System.out.println("Вы получили приз " + prizes.get(PriseNumber).getPrice());
        } else {
            System.out.println("Недостаточно денег");
        }
    }
    public void buyCredits(int money,Card card){
        card.setCreditsBalance(card.getCreditsBalance() + money*2);
        System.out.println("Вы внесли " + money*2 + " кредитов Ваш счет состовляет " + card.getCreditsBalance());
    }

    public void cardTransaction(Card card1, Card card2, int credits) {
        if ((card2.getCreditsBalance() - credits) > 0) {
            card1.setCreditsBalance(card1.getCreditsBalance() + credits);
            card2.setCreditsBalance(card2.getCreditsBalance() - credits);
        } else {
            System.out.println("Недостаточно денег на карте" + card2.getCardNumber());

        }
    }
}
