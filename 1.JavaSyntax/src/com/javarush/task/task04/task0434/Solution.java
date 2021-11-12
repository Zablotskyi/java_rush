package com.javarush.task.task04.task0434;

/*
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a=1;
        int b=1;

        while (a<=10){
            while (b<=9){
                System.out.printf("%3d ", a * b);
                b++;
            }
            System.out.println(a * b);
            b=1;
            a++;
        }

    }
}
