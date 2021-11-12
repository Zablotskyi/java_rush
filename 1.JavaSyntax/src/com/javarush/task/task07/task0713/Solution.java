package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем главный список на 20 чисел
        ArrayList<Integer> mylist = new ArrayList<>();
        //создаем список для чисел нацело деленных на 3
        ArrayList<Integer> division3 = new ArrayList<>();
        //создаем список для чисел нацело деленных на 2
        ArrayList<Integer> division2 = new ArrayList<>();
        //создаем список для чисел нацело не деленных на 3 и на 2
        ArrayList<Integer> notdivision = new ArrayList<>();
        //заполняем главный список
        for (int i = 0; i < 20; i ++) {
            int x = Integer.parseInt(reader.readLine());
            mylist.add(x);
        }

        //пишем проверку для чисел и заполняем списки
        for (int i = 0; i < mylist.size(); i ++) {
            if (mylist.get(i) % 3 == 0) {
                division3.add(mylist.get(i));
            }
            if (mylist.get(i) % 2 == 0) {
                division2.add(mylist.get(i));
            }
            if (mylist.get(i) % 3 != 0 && mylist.get(i) % 2 != 0) {
                notdivision.add(mylist.get(i));
            }
        }
        //выводим переданные списки через созданный метод printList
        printList(division3);
        printList(division2);
        printList(notdivision);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }
}
