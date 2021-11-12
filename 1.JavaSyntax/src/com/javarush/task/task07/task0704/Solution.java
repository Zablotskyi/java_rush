package com.javarush.task.task07.task0704;

/*
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[10];
        //заполняем массив с клавиатуры
        for (int i = 0; i < number.length; i++)
            number[i] = Integer.parseInt(reader.readLine());
        //выводим массив на экран в обратном порядке
        for (int i = number.length - 1; i >= 0; i--)
            System.out.println(number[i]);
    }
}

