package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //создаем массив и обращаемся к методу getInts, он передает нам заполненный массив
        int [] list = getInts();
        System.out.print(Arrays.toString(list));
    }
    //Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
    public static int [] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем массив на 20 элементов и заполняем его с клавиатуры
        int [] array = new int[3];
        for(int i = 0; i < array.length; i ++) {
            array [i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}
