package p5.Switch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Svetotfor {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true) {
                System.out.println("введите код цвета");
                int currentColor = Integer.parseInt(reader.readLine());
                if(currentColor == 1) {
                    System.out.println("Следующий цвет зеленый");
                }
                else if(currentColor ==3){
                    System.out.println("Следующий цвет красный");
                }
                else System.out.println("недопустимый цвет");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
