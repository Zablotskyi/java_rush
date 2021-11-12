package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a=1;
        int b=1;

        while (a<=10){
            while (b<=9){
                System.out.print("S");
                b++;
            }
            System.out.println("S");
            b=1;
            a++;
        }

    }
}
