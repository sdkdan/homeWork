package practice8New;


public class Team {

    private String name;
    private int won;
    private int lose;
    private int ties;
    private int pointScored;
    private int pointAllowed;


    public String getName() {
        return name;
    }


    public void statistic() {

        System.out.println(name);
        System.out.println(won + " wons . " + lose + " lose. " + ties + " ties.");
        System.out.println(pointScored +" points scored."+ pointAllowed +" points allowed.");
        System.out.println(" ");

    }
    public void addPointsScored(int pointScored){
        this.pointScored = this.pointScored +pointScored;

    }

    public void addPointsAllowed(int pointAllowed){
        this.pointScored = this.pointScored + pointAllowed;

    }

    public Team(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getPointScored() {
        return pointScored;
    }

    public void setPointScored(int pointScored) {
        this.pointScored = pointScored;
    }

    public int getPointAllowed() {
        return pointAllowed;
    }

    public void setPointAllowed(int pointAllowed) {
        this.pointAllowed = pointAllowed;
    }

    public void addWon() {
        setWon(getWon() + 1);
    }
    public void addLose(){
        setLose(getLose()+1);
    }
    public void addTies(){
        setTies(getTies()+1);
    }

}