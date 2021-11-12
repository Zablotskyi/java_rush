package com.javarush.task.task04.task0418;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
Минимум двух чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());

        if (a < b) System.out.println(a);
        else if (a == b) System.out.println(a | b);
        else System.out.println(b);

    }
}