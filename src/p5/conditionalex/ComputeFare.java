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
public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        try{
            int fare;
            int age = Integer.parseInt(bufferedReader.readLine());
            if(age < 11)System.out.println("fare 3$");
            else if(age < 65)System.out.println("fare p5$");
            else System.out.println("fare 3$");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
