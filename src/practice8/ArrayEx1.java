package practice8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ArrayEx1 {

    public static void main(String args[]) {


        int score[] = new int[9];
        byte values[] = {1,1,1,1,1,1,1,1,1,1};

        int[][] intD = new int[2][3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    intD[i][j] = Integer.parseInt(bufferedReader.readLine());
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(intD[j][i] + " ");
                }
                System.out.println();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        //Изменили примитив int на long
        long[] primeNum = new long[20];
        //Добавили квадратные скобки
        int[] even=new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        // System.out.println(primes2[0]);
        primes2[0] = 5;
        //System.out.println(primes[0]);

    }

}
