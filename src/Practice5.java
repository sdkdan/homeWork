import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
        System.out.println("Enter a color code");
        double i = Double.parseDouble(reader.readLine());
        if(i >= 380 && i <= 450){
            System.out.println("Violet");
        }
        else if(i >= 450 && i <= 495){
            System.out.println("Blue");
        }
        else if(i > 495 && i <= 570){
            System.out.println("Green");
        }
        else if(i > 570 && i <= 590){
            System.out.println("Yellow");
        }
        else if(i > 590 && i <= 620){
            System.out.println("Orange");
        }
        else if(i > 620 && i <= 750){
            System.out.println("Red");
        }
        else System.out.println("The entered wavelength is not a part of the visible spectrum");
        reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
