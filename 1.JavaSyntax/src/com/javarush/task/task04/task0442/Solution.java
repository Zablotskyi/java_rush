package com.javarush.task.task04.task0442;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int number = Integer.parseInt(reader.readLine());
        int sumNumber = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            sumNumber += number;
            if (number == -1)
                break;
        }
        System.out.println(sumNumber);
    }
}