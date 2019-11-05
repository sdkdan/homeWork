import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Practice4 {
    double faren, cels, a, b, hypot;


    public void roll() {
        Random rand = new Random();
        int i = rand.nextInt(6) + 1;
        int j = rand.nextInt(6) + 1;
        System.out.println(i + j);
    }

    public double fToC(double degreesF) {
        return 0.55556 * (degreesF - 32);
    }

    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

//    public int roll() {
//
//        return (int) (Math.random() * 6 + 1 + Math.random() * 6 + 1);
//    }


    public static void main(String[] args) {
        int a = 0, b = 0;
        double c = 0;
        Practice4 p = new Practice4();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
//             System.out.println("Введите температуру в фаренгейтах");
//             c = Double.parseDouble(reader.readLine());
//             System.out.println("Введите два целых числа для вычисления гипотенузы");
//             a = Integer.parseInt(reader.readLine());
//             b = Integer.parseInt(reader.readLine());
//             System.out.println("Temp in celsius is "+ p.fToC(c));
//             System.out.println("Hypotenuse is "+ p.hypotenuse(a,b));
//             System.out.println("The sum of the dice values is "+ p.roll());
//            System.out.println(p.roll());

            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
