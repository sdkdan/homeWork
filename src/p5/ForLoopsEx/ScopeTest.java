
package p5.ForLoopsEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ScopeTest {

    public static void main(String[] args) {
        int i = 0;

        for (i = 64; i > 0; i = i / 2) {
            System.out.print(i + " ");
        }

        System.out.println("");
        for (int j = 0; j <= 5; j++) {
            System.out.print(j + " ");
        }

        System.out.println("");
        for (int j = 5; j >= 0; j--) {
            System.out.print(j + " ");
        }

        System.out.println("");
        for (int k = 2; k <= 64; k = k * 2) {
            System.out.print(k + " ");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int factorial = 1;
            System.out.println("Введите число от 1 до 10");
            int in = Integer.parseInt(reader.readLine());
            if (in <= 10 && in >= 0) {
                for (int j = 1; j <= in; j++) {
                    factorial = j*factorial;
                }
                System.out.println(factorial);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}
