package practice8New;


import java.util.ArrayList;

public class Game {
    private ArrayList<Game> log = new ArrayList<>();
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private int temperature;
    private int gameNumber;


    public Game(Team homeTeam, Team awayTeam, int temperature) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.temperature = temperature;

        log.add(this);
        gameNumber = log.size();
    }
    public void play(){
        homeTeamScore = (int)(Math.random()*(3+temperature/16));
        awayTeamScore = (int)(Math.random()*(3+temperature/16));
        homeTeam.setPointScored(homeTeamScore);
        homeTeam.setPointAllowed(awayTeamScore);
        awayTeam.setPointScored(awayTeamScore);
        awayTeam.setPointAllowed(homeTeamScore);

        if (homeTeamScore>awayTeamScore){
            homeTeam.addWon();
            awayTeam.addLose();
        }
        if (homeTeamScore<awayTeamScore){
            homeTeam.addLose();
            awayTeam.addWon();
        }
        if (homeTeamScore == awayTeamScore){
            homeTeam.addTies();
            awayTeam.addTies();
        }

    }

    public void printHottestTemperature(){
        int hottesttemp = 0;
        for (Game game:log){
            hottesttemp =game.temperature;
        }
        System.out.println("Hottest temp " + hottesttemp);
    }

    public ArrayList<Game> getLog() {
        return log;
    }

    public void setLog(ArrayList<Game> log) {
        this.log = log;
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

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }
}