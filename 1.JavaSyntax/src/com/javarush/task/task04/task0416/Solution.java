package com.javarush.task.task04.task0416;
import java.io.BufferedReader;
import  java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        double minute = Double.parseDouble(buf.readLine());
        double t = 0.0;
        t = minute % 5;

        if (t >=0 && t < 3) System.out.println("зелёный");
        else if (t >= 3 && t < 4) System.out.println("жёлтый");
        else if (t >= 4 && t < 5) System.out.println("красный");

    }
}