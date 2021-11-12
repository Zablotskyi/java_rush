package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем и заполняем массив
        int [] building = new int[15];
        for (int i = 0; i < building.length; i ++) {
            building[i] = Integer.parseInt(reader.readLine());
        }
        //создаем две переменный для суммирования жителей парных и не парных домов
        int sumPaired = 0;
        int sumUnpaired = 0;
        //цикл для суммирования жителей парных домов
        for( int i = 0; i < building.length; i += 2) {
            sumPaired += building[i];
        }

        //цикл для суммирования жителей не парных домов
        for (int j = 1; j < building.length; j += 2) {
            sumUnpaired += building[j];
        }
        //условие для проверки в каких домах проживает больше жителей
        if (sumPaired > sumUnpaired)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
