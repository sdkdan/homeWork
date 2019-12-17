package practice8New;


import java.util.ArrayList;

public class Scheduler {
    private Team[] TeamArray;

    private int tempIndex = 0;
    private int minTemp = 5;
    private int[] previous3Temps = new int[3];

    public Scheduler(Team[] teamArray) {
        TeamArray = teamArray;
    }

    public void scheduleGame(int temperature) {
        if (temperature > minTemp) {
            ArrayList<Integer> teamsRemaining = new ArrayList<>();
            for (int i = 0; i < TeamArray.length; i++) {
                teamsRemaining.add(i);
            }
            while (teamsRemaining.size() > 1) {

                int randNum = (int) (Math.random() * teamsRemaining.size());
                Team team1 = TeamArray[teamsRemaining.get(randNum)];

                teamsRemaining.remove(randNum);
                randNum = (int) (Math.random() * teamsRemaining.size());
                Team team2 = TeamArray[teamsRemaining.get(randNum)];

                teamsRemaining.remove(randNum);

                Game nextGame = new Game(team1, team2, temperature);
                nextGame.play();
            }
        } else {
            System.out.println("Too cold to play");
        }
        previous3Temps[tempIndex] = temperature;
        tempIndex = (tempIndex + 1) % 3;
    }

    public boolean test3lastTemperature() {
        for (int i : previous3Temps) {
            if (i > minTemp) {
                return true;
            }
        }
        return false;
    }
    public void printStatistic(){
        for(Team team: TeamArray){
            team.statistic();
        }
    }
    public Team[] getTeamArray() {
        return TeamArray;
    }

    public void setTeamArray(Team[] teamArray) {
        TeamArray = teamArray;
    }
}