package com.javarush.task.task04.task0420;

/*
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());

             if (a>=b && a>=c && b<c) System.out.println(a+" "+c+" "+b);
        else if (a>=b && a>=c && b>c) System.out.println(a+" "+b+" "+c);
        else if (b>=a && b>=c && a>c) System.out.println(b+" "+a+" "+c);
        else if (b>=a && b>=c && a>c) System.out.println(b+" "+c+" "+a);
        else if (c>=a && c>=b && a>b) System.out.println(c+" "+a+" "+b);
        else System.out.println(c+" "+b+" "+a);

    }
}
