package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        for (; number>0; number/=10) {  //цикл делит ВСЁ число на 2 и смотрит  остаток, потом делит это число на 10
            int i = number % 10;        // (отбрасывая последний разряд) и смотрит уже на получившееся число деля его
            if (i % 2 == 0) even ++;    //на %2 и смотря остаток вводим число 1234 программа делает так если (1234 % 2 == 0)
            else odd ++;                // то ЧЕТНОЕ++ иначе НЕЧЕТНОЕ++ ЧИСЛО = 1234  /  10
                                        // тут у нас будет число 123 если (123 % 2 == 0) то ЧЕТНОЕ++ иначе НЕЧЕТНОЕ++
                                        // ЧИСЛО = 123  /  10 если (12 % 2 == 0) то ЧЕТНОЕ++ иначе НЕЧЕТНОЕ++
                                        // ЧИСЛО = 12  /  10 если (1 % 2 == 0) то ЧЕТНОЕ++ иначе НЕЧЕТНОЕ++ ЧИСЛО = 1  /  10
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
