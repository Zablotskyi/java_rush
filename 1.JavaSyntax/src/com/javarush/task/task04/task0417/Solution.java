package com.javarush.task.task04.task0417;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(buf.readLine());
        BufferedReader buf2 = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(buf.readLine());

        if (a == (b+c)/2 && b == (a+c)/2 && c == (a+b)/2) System.out.println (a + " " + b + " " + c);
        else if (a == b && a !=c) System.out.println(a + " " + b);
        else if (b == c && b !=a) System.out.println(b + " " + c);
        else if (c == a && c !=b) System.out.println(c + " " + a);

    }
}