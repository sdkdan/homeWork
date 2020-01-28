/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice8.foot;

/**
 * @author aniso
 */

import java.util.Random;
import java.util.ArrayList;

public class Game {

    public static int getNumOfGame() {
        return numOfGame;
    }

    public static ArrayList<String> getStats() {
        return stats;
    }

    private static int numOfGame = 1;
    private int first_team = 0, second_team = 0, third_team = 0, fourth_team = 0;
    private int score1 = 0, score2 = 0;
    private static ArrayList<String> stats = new ArrayList();
    private ArrayList<Team> teams = new ArrayList();

    Team team_1 = new Team("Kazan");
    Team team_2 = new Team("Astana");
    Team team_3 = new Team("Arsenal");
    Team team_4 = new Team("Cska");

    Random rand = new Random();

    public void chooseTeams() {

        first_team = rand.nextInt(4) + 1;

        do {
            second_team = rand.nextInt(4) + 1;
        } while (second_team == first_team);

        do {
            third_team = rand.nextInt(4) + 1;
        } while ((third_team == first_team) || (third_team == second_team));

        fourth_team = 10 - first_team - second_team - third_team;

    }

    public void sort() {

        switch (first_team) {
            case 1: {
                teams.add(team_1);
                break;
            }
            case 2: {
                teams.add(team_2);
                break;
            }

            case 3: {
                teams.add(team_3);
                break;
            }
            case 4: {
                teams.add(team_4);
                break;
            }
        }

        switch (second_team) {
            case 1: {
                teams.add(team_1);
                break;
            }
            case 2: {
                teams.add(team_2);
                break;
            }

            case 3: {
                teams.add(team_3);
                break;
            }
            case 4: {
                teams.add(team_4);
                break;
            }
        }

        switch (third_team) {
            case 1: {
                teams.add(team_1);
                break;
            }
            case 2: {
                teams.add(team_2);
                break;
            }

            case 3: {
                teams.add(team_3);
                break;
            }
            case 4: {
                teams.add(team_4);
                break;
            }
        }

        switch (fourth_team) {
            case 1: {
                teams.add(team_1);
                break;
            }
            case 2: {
                teams.add(team_2);
                break;
            }

            case 3: {
                teams.add(team_3);
                break;
            }
            case 4: {
                teams.add(team_4);
                break;
            }
        }


    }

    public void game(int temp) {
        chooseTeams();
        sort();
        game1(temp, teams.get(0), teams.get(1));
        game2(temp, teams.get(2), teams.get(3));
        teams.remove(0);
        teams.remove(0);
        teams.remove(0);
        teams.remove(0);

    }

    public void game1(int temp, Team team_1, Team team_2) {
        score1 = (int) (rand.nextInt(2) + (Math.log(temp)));
        score2 = (int) (rand.nextInt(2) + (Math.log(temp)));


        team_1.setGoalScored(score1);
        team_1.setGoalMissed(score2);
        team_2.setGoalScored(score2);
        team_2.setGoalMissed(score1);


        if (score1 > score2) {
            team_1.setWins(1);
            team_2.setLoses(1);
        } else if (score2 > score1) {
            team_2.setWins(1);
            team_1.setLoses(1);
        } else {
            team_1.setDraws(1);
            team_2.setDraws(1);
        }

        getStats().add("Game №" + numOfGame + "\nДома " + team_1.getTeamName() + ", " + score1 + "\nГости " + team_2.getTeamName() + ", " + score2 + "\n\n");
        numOfGame++;
    }

    public void game2(int temp, Team team_3, Team team_4) {
        score1 = (int) (rand.nextInt(3) + (Math.log(temp)));
        score2 = (int) (rand.nextInt(3) + (Math.log(temp)));

        team_3.setGoalScored(score1);
        team_3.setGoalMissed(score2);
        team_4.setGoalScored(score2);
        team_4.setGoalMissed(score1);


        if (score1 > score2) {
            team_3.setWins(1);
            team_4.setLoses(1);
        } else if (score2 > score1) {
            team_3.setWins(1);
            team_4.setLoses(1);
        } else {
            team_3.setDraws(1);
            team_4.setDraws(1);
        }

        getStats().add("Game №" + numOfGame + "\nДома " + team_3.getTeamName() + ", " + score1 + "\nГости " + team_4.getTeamName() + ", " + score2 + "\n\n");
        numOfGame++;

    }


    public void displayTeamStats() {

        System.out.println(team_1.getTeamName() + "\n" + "Wins " + team_1.getWins() + "\tLosses " + team_1.getLoses() + "\tDraws " + team_1.getDraws() +
                "\nPoints scored " + team_1.getGoalScored() + "\tPoints Allowed " + team_1.getGoalMissed() + "\n");

        System.out.println(team_2.getTeamName() + "\n" + "Wins " + team_2.getWins() + "\tLosses " + team_2.getLoses() + "\tDraws " + team_2.getDraws() +
                "\nPoints scored " + team_2.getGoalScored() + "\tPoints Allowed " + team_2.getGoalMissed() + "\n");

        System.out.println(team_3.getTeamName() + "\n" + "Wins " + team_3.getWins() + "\tLosses " + team_3.getLoses() + "\tDraws " + team_3.getDraws() +
                "\nPoints scored " + team_3.getGoalScored() + "\tPoints Allowed " + team_3.getGoalMissed() + "\n");

        System.out.println(team_4.getTeamName() + "\n" + "Wins " + team_4.getWins() + "\tLosses " + team_4.getLoses() + "\tDraws " + team_4.getDraws() +
                "\nPoints scored " + team_4.getGoalScored() + "\tPoints Allowed " + team_4.getGoalMissed() + "\n");


    }


}