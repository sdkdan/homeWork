package practice8.p8;

import java.util.ArrayList;
import java.util.Collections;

public class Team {
    private int id;
    private String name;
    private int wins;
    private int loses;
    private int ties;
    private int pScored;
    private int pAllowed;

    private Team[] teams;
    private static ArrayList<Team> teamList = new ArrayList<>();

    public Team(String n){
        this.name = n;
        teamList.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getpScored() {
        return pScored;
    }

    public void setpScored(int pScored) {
        this.pScored = pScored;
    }

    public int getpAllowed() {
        return pAllowed;
    }

    public void setpAllowed(int pAllowed) {
        this.pAllowed = pAllowed;
    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(ArrayList<Team> teamList) {
        this.teamList = teamList;
    }

    public static ArrayList<Team> tossTeam(Team team) {
        Collections.shuffle(team.getTeamList());
        return team.getTeamList();
    }

    public String printTeam() {
        return name + '\n' +
                "Wins: " + wins + "Loses: " + loses + "Ties: " + ties + '\n' +
                "Points scored: " + pScored + "Points allowed: " + pAllowed;
    }
}
