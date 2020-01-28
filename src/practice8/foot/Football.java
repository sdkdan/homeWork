/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice8.foot;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Football {


    public static void main(String[] args) {

        ArrayList<Integer> temperatures = new ArrayList();

        int stopper = 0;
        int i = 0;
        Game game = new Game();

        do {
            System.out.println("Введите температуру воздуха");
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();

            i++;
            if (temp >= 0) {
                //вызываем метод класса Game, моделирующий игру
                game.game(temp);
                temperatures.add(temp);
                stopper = 0;
                //game.chooseTeams();

            } else {
                stopper++;
                System.out.println("Слишком холодно, чтобы играть");
            }


        }
        while (stopper < 3);

        System.out.println("**********КОНЕЦ СЕЗОНА**********\n");


        int temp_counter = 0;
        for (int j = 0; j < game.getStats().size(); j++) {


            if (j % 2 == 0 && j != 0) {
                temp_counter++;
            }
            System.out.println("Temperature " + temperatures.get(temp_counter));
            System.out.println(game.getStats().get(j));


        }

        game.displayTeamStats();
        int avg = 0;
        int max = 0;
        for (int j = 0; j < temperatures.size(); j++) {

            avg += temperatures.get(j);

            if (temperatures.get(j) >= max) {

                max = temperatures.get(j);
            }
        }

        System.out.println("Средняя температура " + avg / temperatures.size());
        System.out.println("Самая высокая температура " + max);
    }

}
