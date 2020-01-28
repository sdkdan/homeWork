package Casino;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static Casino.Prize.play;

public class Casino {
    public static void main(String[] args) {
        Card card1 = new Card(100,50,1215);
        Card card2 = new Card(200,0,1666);
        Card card3 = new Card();
        Card card4 = new Card();
        card3.setBalanceTickets(50);
        card4.setBalanceTickets(50);

        ArrayList<Prize> prizes = new ArrayList<>();
        prizes.add(new Prize("Car", 20));
        prizes.add(new Prize("Cholocalte" , 3));
        prizes.add(new Prize("Konfeta", 1));
        Terminal terminal1 = new Terminal(prizes);
        ArrayList<Prize> prizes1 = new ArrayList<>();
        prizes1.add(new Prize("Zayac" ,40));
        prizes1.add(new Prize("Wolf" ,10));
        prizes1.add(new Prize("Dog" ,15));
        Terminal terminal2 = new Terminal(prizes1);

        System.out.println("Выберите карту \n Нажмите 1 что бы выбрать карту 1 \n Нажмите 2 что бы выбрать карту 2");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true) {
                int b = 0;
                while (b != 1 && b != 2) {
                    b = Integer.parseInt(bufferedReader.readLine());
                }
                Card card;
                if (b == 1) {
                    card = card3;
                    System.out.println("Пополните баланс карты на сумму: ");
                    int moneyToAdd = Integer.parseInt(bufferedReader.readLine());
                    card3.setCreditsBalance(moneyToAdd);
                } else {
                    card = card4;
                    System.out.println("Пополните баланс карты на сумму: ");
                    int moneyToAdd = Integer.parseInt(bufferedReader.readLine());
                    card4.setCreditsBalance(moneyToAdd);
                }


                System.out.println("Нажмите 1 что бы терминал 1 \n Нажмите 2 что бы выбрать терминал 2");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = Integer.parseInt(bufferedReader.readLine());
                }
                Terminal terminal;
                if (i == 1) {
                    terminal = terminal1;
                } else {
                    terminal = terminal2;
                }
                i = 0;
                while (i != 1 && i != 2) {
                    card.setCreditsBalance(card.getCreditsBalance()+play());
                    System.out.println("Если вы хотите перевести на карту, нажмите 2, если получить приз, нажмите 1");
                    i = Integer.parseInt(bufferedReader.readLine());
                }
                if (i == 1) {
                    terminal.getPrises();
                    System.out.println("Выберите приз который хотите купить или продолжите играть, цифра 3");
                    i = -1;
                    while (i != 1 && i != 2 && i != 0 && i!=3) {
                        i = Integer.parseInt(bufferedReader.readLine());
                    }
                    if(i==1 && i==2 && i==0){
                    terminal.buyPrise(i, card);}
                    if(i==3) card.setCreditsBalance(card.getCreditsBalance()+play());

                    System.out.println("Введите сумму на которую хотите купить кредиты");

                    int money = Integer.parseInt(bufferedReader.readLine());

                    terminal.buyCredits(money, card);

                } else {
                    System.out.println("Введите сумму которую хотите перевести");
                    int mony = Integer.parseInt(bufferedReader.readLine());
                    if (b == 1) {
                        terminal.cardTransaction(card, card2, mony);
                    } else {
                        terminal.cardTransaction(card, card1, mony);
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
//    public void sendMoney(Card c1, Card c2, int money){
//        int i = c1.getCreditsBalance();
//        int j = c2.getCreditsBalance();
//        c1.setCreditsBalance(i-money);
//        c2.setCreditsBalance(j+money);
//    }
}
