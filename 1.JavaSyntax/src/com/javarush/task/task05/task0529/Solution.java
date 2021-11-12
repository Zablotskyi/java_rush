package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));


        int coins = 0;
        while (true)
        {
            String s = buffer.readLine();// вызываем строку с клавиатуры
            if (s.equals("сумма"))// проверяем, что строка НЕ равно "сумма"
                break;// если строка = "сумма" - останавливаем цикл
            int coin = Integer.parseInt(s);//если строка не равна сумма, значит это число - переводим эту строку в число записываем значение в переменную "coin"
            coins += coin;//прибавляем число к sum (значение было 0, станет 0+число)
        }
        System.out.println(coins);
    }
}