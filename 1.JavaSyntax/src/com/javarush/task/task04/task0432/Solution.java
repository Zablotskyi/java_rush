package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(buf.readLine());

        while (q>0){
            System.out.println(s);
            q=q-1;
        }

    }
}
