package com.javarush.task.task04.task0413;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int dey = Integer.parseInt(buf.readLine());

        if (dey == 1) System.out.println("понедельник");
        else if (dey == 2) System.out.println("вторник");
        else if (dey == 3) System.out.println("среда");
        else if (dey == 4) System.out.println("четверг");
        else if (dey == 5) System.out.println("пятница");
        else if (dey == 6) System.out.println("суббота");
        else if (dey == 7) System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");

    }
}