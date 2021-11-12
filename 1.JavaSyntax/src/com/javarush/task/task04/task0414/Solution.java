package com.javarush.task.task04.task0414;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(buf.readLine());

        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");

    }
}