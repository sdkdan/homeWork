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
public class StringEquality {
    public static void main(String[] args) {


        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        try {
            String name = bufferedReader.readLine().intern();
           if(name == "Мое")System.out.println("Вы король рок-н-ролла");
           else System.out.println("Вы не король рок-н-ролла");
        } catch(IOException e){
            e.printStackTrace();
        }

    }

}