import java.util.ArrayList;

public class AudioPlayer extends Product implements MultimediaControl {
    String audioSpecification;
    ItemType mediaType;
    ArrayList<AudioPlayer> audioPlayers = new ArrayList<>();

    public AudioPlayer(String name, String audioSpecification){
        super(name);
        mediaType = ItemType.AudioMobile;
        // add if else ?

    }
    public void add(){

    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stoping");
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
        return super.toString()+"AudioPlayer{" +
                "audioSpecification='" + audioSpecification + '\'' +
                ", mediaType=" + mediaType +
                '}';
    }

    public void Sort(){

    }
}
