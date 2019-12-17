package practice8.p8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static practice8.p8.Team.tossTeam;

public class League {
    public static void main(String[] args) throws Exception {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");
        Team team3 = new Team("Team 3");
        Team team4 = new Team("Team 4");
        Game game = new Game("sd");
//        team1.setName("Team 1");
//        team2.setName("Team 2");
//        team3.setName("Team 3");
//        team4.setName("Team 4");


        ArrayList<Integer> temperatureList = new ArrayList<>();

        int counter=0;
        while (true) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите температуру ");
            Game game1 = new Game("d");
            int temp = Integer.parseInt(reader.readLine());
            if(temp<0){
                System.out.println("can't play");
                counter++;
            }
            else if(counter==3) {
                break;
            }
            //game.setTemperature(temp);
            temperatureList.add(temp);
            game1.setTemperature(temp);
            tossTeam(team1);
            game1.setAwayTeam(team1.getTeamList().get(0));
            game1.setHomeTeam(team1.getTeamList().get(1));
            game1.setaTeamScore(Game.goal(temp));
            game1.sethTeamScore(Game.goal(temp));

        }



    }

//    public ArrayList<Team> tossTeam(Team team) {
//        Collections.shuffle(team.getTeamList());
//        return team.getTeamList();
//    }

}
