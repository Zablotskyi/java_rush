package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String admin1 = buf.readLine();
        BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
        String admin2 = buf1.readLine();
        if (admin1.equals(admin2)) System.out.println("Имена идентичны");
        else if (admin1.length() == admin2.length()) System.out.println("Длины имен равны");

    }
}
