import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {
    public static void main(String[] args) {
        final int pin = 4513;
        int t;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Enter a PIN");
            try {
                t = Integer.parseInt(reader.readLine());
                if(t == pin){
                    System.out.println("the correct PIN has been entered you now has access to account");
                    break;
                }
                System.out.println("The PIN is not correct");

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
