package com.javarush.task.task04.task0415;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int ab = Integer.parseInt(buf.readLine());
        BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
        int bc = Integer.parseInt(buf.readLine());
        BufferedReader buf2 = new BufferedReader(new InputStreamReader(System.in));
        int ca = Integer.parseInt(buf.readLine());

        if (ab < bc + ca && bc < ab + ca && ca < ab + bc) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
}