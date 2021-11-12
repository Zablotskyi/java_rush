package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buf.readLine());
        if (number > 0) System.out.println(number = number * 2);
        else if (number < 0) System.out.println(number = number + 1);
        else if (number == 0) System.out.println(number);

    }

}