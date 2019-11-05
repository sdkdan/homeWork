/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import javax.imageio.metadata.IIOMetadataNode;
import java.io.*;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(2);
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            int k;
            while (true) {
                k = Integer.parseInt(bufferedReader.readLine());
                if (k>=0 && k <3){
                    break;
                }
            }
            if(i == 0){
                System.out.println("Камень");
            }
            if(i == 1){
                System.out.println("Бумага");
            }
            if(i == 3){
                System.out.println("Ножницы");
            }
                if ((i == 0 && k == 1) || (i == 1 && k == 2) || (i == 2 && k == 0)) {
                    System.out.println("Вы победили");
                } else {
                    if (i == k){
                        System.out.println("Ничья");
                    }else {
                        System.out.println("Вы проиграли");
                    }
                }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
