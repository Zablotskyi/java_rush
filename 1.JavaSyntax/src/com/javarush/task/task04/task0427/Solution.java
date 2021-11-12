package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n>0 && n<10) System.out.println((n%2!=0) ? "нечетное однозначное число" : "четное однозначное число");
        if (n>=10 && n<100) System.out.println((n%2!=0) ? "нечетное двуходнозначное число" : "четное двуходнозначное число");
        if (n>=100 && n<1000 && n%2!=0) System.out.println("нечетное трехзначное число");
        else if (n>=100 && n<1000 && n%2==0) System.out.println("четное трехзначное число");

    }
}
