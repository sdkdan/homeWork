/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Enter the movie ticket price \n");
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        try{
            int price = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter film rating");
            int rating = Integer.parseInt(bufferedReader.readLine());
            if(rating == 5 && price >= 12) System.out.println("I'am interested watch to film");
            else System.out.println("I'am  not interested watch to film");

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
