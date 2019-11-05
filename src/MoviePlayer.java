public class MoviePlayer extends Product implements MultimediaControl {
    MonitorType monitor = MonitorType.LCD; //utochnit
    //Screen screen = new Screen();
    String screen;
    public MoviePlayer(String name, String screen){
       super(name);
       super.addColection(MoviePlayer.this);
        //super(screen,monitorType);
    }
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void next() {
        System.out.println("Next");
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nmonitor \t\t:" + monitor +
                "\nscreen \t\t\t:" + screen;
    }
}
