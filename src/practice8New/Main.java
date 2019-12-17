package practice8New;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Team team1 = new Team("zenit");
        Team team2 = new Team("spartak");
        Team team3 = new Team("rostov");
        Team team4 = new Team("cska");
        Team[] allTeams = {team1, team2, team3, team4};

        Scheduler sheduler = new Scheduler(allTeams);

        boolean continueLoop = true;
        while (continueLoop != false) {
            try {
                System.out.println("Enter temperature: ");
                int temp = sc.nextInt();
                sheduler.scheduleGame(temp);
                continueLoop =  sheduler.test3lastTemperature();
            } catch (NumberFormatException e) {
                System.out.println("bad temperature");
            }
        }
        System.out.println("Season is over");
        System.out.println("Results");
        sheduler.printStatistic();

    }
}