package BreakContinueEx;

import java.io.*;
import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try{
            int sum = 1;
            int total = 0;
            int g =0;
            while(sum != 0 && g++!=10){
                sum = Integer.parseInt(bufferedReader.readLine());
                total +=sum;
            }
            System.out.println("Total " + total);
        }catch (IOException e){
            e.printStackTrace();
        }
       

    }
}
