package Casino;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Casino {
    public static void main(String[] args) {
        Card card1 = new Card(100,50,1215);
        Card card2 = new Card(200,0,1666);
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

        System.out.println("Выберите карту \n Нажмите 1 что бы выбрать карту с номером 1215 \n Нажмите 2 что бы выбрать карту с номером 1666");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int i=0;
            while(i != 1 && i != 2){
                i = Integer.parseInt(bufferedReader.readLine());
            }
            Card card;
            if(i == 1){
                card = card1;
            }
            else {
                card = card2;
            }
            System.out.println("Выберите карту \n Нажмите 1 что бы выбрать терминал 1 \n Нажмите 2 что бы выбрать терминал 2");
            i=0;
            while(i != 1 && i != 2){
                i = Integer.parseInt(bufferedReader.readLine());
            }
            Terminal terminal;
            if(i == 1){
               terminal = terminal1;
            }
            else {
                terminal = terminal2;
            }

            terminal.getPrises();
            System.out.println("Выберите приз который хотите купить");
            i=-1;
            while(i != 1 && i != 2 && i != 0){
                i = Integer.parseInt(bufferedReader.readLine());
            }
            terminal.buyPrise(i, card);
            System.out.println("Введите сумму на которую хотите купить кредиты");

              int  mony = Integer.parseInt(bufferedReader.readLine());

            terminal.buyCredits(mony,card);


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
