package practice8.p8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {
    private int id = 0;
    private int temperature;
    private Team homeTeam;
    private Team awayTeam;
    private int hTeamScore;
    private int aTeamScore;
    private String test;
    //private ArrayList<String> tempList;
    private static ArrayList<Game> games;

    public Game(String s) {
        id++;
        this.test = s;
        games.add(this);
    }


    public int getId() {
        return id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int gethTeamScore() {
        return hTeamScore;
    }

    public void sethTeamScore(int hTeamScore) {
        this.hTeamScore = hTeamScore;
    }

    public int getaTeamScore() {
        return aTeamScore;
    }

    public void setaTeamScore(int aTeamScore) {
        this.aTeamScore = aTeamScore;
    }

//    public ArrayList<String> getTempList() {
//        return tempList;
//    }
//
//    public void setTempList(ArrayList<String> tempList) {
//        this.tempList = tempList;
//    }


    public static ArrayList<Game> getGames() {
        return games;
    }

    public static void setGames(ArrayList<Game> games) {
        Game.games = games;
    }

    public static int goal(int temperature){
        if(temperature>=0 && temperature<=10){
            return (int) (Math.random() * 2);
        }
        else if(temperature>10 && temperature<=20){
            return (int) (Math.random() * 3);
        }
        else if(temperature>20 && temperature<=30){
            return (int) (Math.random() * 4);
        }
        else if(temperature>30 && temperature<=40){
            return (int) (Math.random() * 5);
        }
        return 0;
    }

    public ArrayList<Team> tossTeam(Team team) {
        Collections.shuffle(team.getTeamList());
        return team.getTeamList();
    }



    public String printGame(int id) {
        return "Game # " + getId() + '\n' +
                "Temperature: " + temperature + '\n' +
                "Away team: " + awayTeam + ", " + aTeamScore + '\n' +
                "Home team: " + homeTeam + ", " + hTeamScore;
    }

}
