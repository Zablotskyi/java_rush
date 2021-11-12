package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String name = buf.readLine();
        BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(buf1.readLine());
        if (age < 18) System.out.println("Подрасти еще");


    }
}
