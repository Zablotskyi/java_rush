package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i ++) {
            array1[i] = i;
        }
        int[] array2 = new int[2];
        for (int i = 0; i < array2.length; i ++) {
            array2[i] = i;
        }
        int[] array3 = new int[4];
        for (int i = 0; i < array3.length; i ++) {
            array3[i] = i;
        }
        int[] array4 = new int[7];
        for (int i = 0; i < array4.length; i ++) {
            array4[i] = i;
        }
        int[] array5 = new int[0];
        for (int i = 0; i < array5.length; i ++) {
            array5[i] = i;
        }

        ArrayList <int []> list = new ArrayList<int[]>();
        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        list.add(array5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
