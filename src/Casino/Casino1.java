package Casino;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Casino1 {
    public static void main(String[] args) {
        Card card1 = new Card(100, 50, 1215);
        Card card2 = new Card(200, 0, 1666);
        Card card3 = new Card();
        Card card4 = new Card();
        card3.setBalanceTickets(50);
        card4.setBalanceTickets(50);

        ArrayList<Prize> prizes = new ArrayList<>();
        prizes.add(new Prize("Car", 20));
        prizes.add(new Prize("Cholocalte", 3));
        prizes.add(new Prize("Konfeta", 1));
        Terminal terminal1 = new Terminal(prizes);
        ArrayList<Prize> prizes1 = new ArrayList<>();
        prizes1.add(new Prize("Zayac", 40));
        prizes1.add(new Prize("Wolf", 10));
        prizes1.add(new Prize("Dog", 15));
        Terminal terminal2 = new Terminal(prizes1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            Card card;
            System.out.println("выберите карту 1-1, 2-2");
            int i = Integer.parseInt(reader.readLine());
            if(i==1) card = card2;
            else   card = card3;


            System.out.println("Баланс-1, Игра-2, Перевод-3, приз-4");
            int i1 = Integer.parseInt(reader.readLine());
            if(i==1) card.getCreditsBalance();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
