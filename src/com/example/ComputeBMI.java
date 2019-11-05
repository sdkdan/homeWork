/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.io.*;
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.println("Введите свой вес в фунтах");
            int weight = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Введите свой рост");
            int height = Integer.parseInt(bufferedReader.readLine());
            double bmi = Math.round(weight / Math.pow(height, 2)*703*10)*0.1;
            System.out.println("Индекс вашего тела " + bmi);
        }catch (IOException e){
            e.printStackTrace();
        }
        
        }
}
