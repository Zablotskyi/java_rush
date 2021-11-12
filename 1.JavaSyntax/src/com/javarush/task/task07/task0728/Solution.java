package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем массив и вводим данные с клавиатуры
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код

        //умножаем все ячейки массива на -1
        for (int i = 0; i < array.length; i ++) {
            array[i] *= -1;
        }
        //сортируем массив по возрастанию и умножаем все значения снова на -1 чтоб обратить список по убыванию
        Arrays.sort(array);
        for (int i = 0; i < array.length; i ++) {
            array[i] *= -1;
        }
    }
}
