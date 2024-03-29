package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i ++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        //пишем цикл для поиска неприрывно повторяющихся чисел и выпода на экрат количества повторяемых вподряд чисел
        int count = 1;
        int tmpcount = 1;
        for (int i = 0; i < 10; i ++) {
            if (i > 0 && list.get(i).equals(list.get(i - 1)))
                tmpcount ++;
            else
                tmpcount = 1;
            if (tmpcount > count)
                count = tmpcount;
        }
        System.out.println(count);
    }
}
