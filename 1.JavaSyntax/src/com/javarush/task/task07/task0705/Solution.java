package com.javarush.task.task07.task0705;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем массив и цикл для ввода 20 чисел с клавиатуры
        int [] number = new int[20];
        for (int i = 0; i < number.length; i ++)
            number [i] = Integer.parseInt(reader.readLine());
        //создается первый маленький массив и в него вводится первая половина значений с большого массива
        int [] smal1 = new int[10];
        //int half1 = number.length / 2;
        for (int i = 0; i < number.length / 2; i ++) {
            smal1[i] = number[i];
        }
        //создается второй маленький массив и в него вводится второя половина значений с большого массива
        int [] smal2 = new int[10];
        //int half2 = 1 + half1;
        for (int i = smal1.length; i < number.length; i ++) {
            smal2[i - 10] = number[i];
            System.out.println(smal2[i - 10]);
        }
    }
}
