/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice8.foot;


public class Team {

    public String getTeamName() {
        return teamName;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public int getGoalMissed() {
        return goalMissed;
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    public void setLoses(int loses) {
        this.loses += loses;
    }

    public void setDraws(int draws) {
        this.draws += draws;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored += goalScored;
    }

    public void setGoalMissed(int goalMissed) {
        this.goalMissed += goalMissed;
    }

    private String teamName;

    private int wins = 0;
    private int loses = 0;
    private int draws = 0;
    private int goalScored = 0;
    private int goalMissed = 0;

    public Team(String name) {

        this.teamName = name;

    }


}
