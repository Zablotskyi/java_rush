package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(reader.readLine());
        int n=Integer.parseInt(reader.readLine());

        for(int x=1; x<=m; x++){
           for (int y=2; y<=n; y++){
               System.out.print("8");
           }
            System.out.println("8");
        }

    }
}
