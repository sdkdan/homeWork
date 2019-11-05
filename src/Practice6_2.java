import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6_2 {

    public static void main(String[] args) {
        int vvod;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("enter a number");
            vvod = Integer.parseInt(reader.readLine());
            for(int i=1; i<=12; i++){
                if(vvod%i==0) System.out.println(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}

