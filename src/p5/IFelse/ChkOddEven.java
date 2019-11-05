/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IFelse;

/**
 *
 * @author anshenoy
 */
import java.io.*;
import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        try{
            int number = Integer.parseInt(bufferedReader.readLine());
            if(number % 2 == 1)System.out.println("Number not Even");
            else System.out.println("Number Even");
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
