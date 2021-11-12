package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        // решение с помощью цикла for
//        int j = 0;
//        for (int i = 0; i < 40; i ++) {
//            System.out.println(text.substring(j));
//            j ++;
//        }
        // решение с помощью цикла while
        int i = 40;
        int j = 0;
        while (i > 0) {
            System.out.println(text.substring(j));
            i --;
            j ++;
        }
    }

}

