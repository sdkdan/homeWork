/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IFelse;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity {

    public static void main(String[] args) {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try{
            int age = Integer.parseInt(bufferedReader.readLine());
            boolean drivingUnderAge = false;
            if(age >= 18) drivingUnderAge = true;
            System.out.println(drivingUnderAge);
        }catch(IOException e){
            e.printStackTrace();
        }

       
    }
}
