package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        ArrayList<Integer> myList = new ArrayList<Integer>(4);
        myList.add(a);
        myList.add(b);
        myList.add(c);
        myList.add(d);
        myList.add(e);

        Collections.sort(myList);

        int f = myList.get(0);
        int g = myList.get(1);
        int h = myList.get(2);
        int i = myList.get(3);
        int j = myList.get(4);

        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}
