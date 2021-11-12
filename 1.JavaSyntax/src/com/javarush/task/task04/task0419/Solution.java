package com.javarush.task.task04.task0419;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());
        int d = Integer.parseInt(buf.readLine());

        int max=a;
        if (max<b) max=b;
        if (max<c) max=c;
        if (max<d) max=d;
        System.out.println(max);
    }
}