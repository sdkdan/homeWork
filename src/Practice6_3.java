import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6_3 {
    public static void main(String[] args) {
        try {
            int a,b,c;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
            if(a < 1 || b < 1 || c < 1){
                System.out.print("incorrect data");
            }
            createRectangle(a,b);
            createTriangle(c);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void createRectangle(int a,int b){
        for(int i=1;i <= a;i++){
            for(int n =1;n <= b; n++){
                if(i == 1 || i == a || n == 1 || n == b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void createTriangle(int c){
        for(int i=1;i <= c;i++){
            for(int n =1;n <= c; n++) {
            if(i == n || n == 1 || i == c){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
            System.out.print("\n");
            }
    }

}
