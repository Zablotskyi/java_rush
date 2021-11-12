package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int positive=0;
        int negative=0;

        if (a>0 && a!=0) positive=positive+1;
        else if (a<0) negative=negative+1;
        if (b>0 && b!=0) positive=positive+1;
        else if (b<0) negative=negative+1;
        if (c>0 && c!=0) positive=positive+1;
        else if (c<0) negative=negative+1;
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

    }
}
