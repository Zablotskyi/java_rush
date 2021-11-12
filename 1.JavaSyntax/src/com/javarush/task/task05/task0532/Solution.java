package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        //System.out.println("Введите количество чисел которые должны быть переданы на поиск самого большого числа");

        int step = 0; //Считываем количество чисел для сравнения;
        step = Integer.parseInt(reader.readLine());
        //System.out.println("Введите такое количество " + step + " чисел");
        if (step > 0) { //Проверяем, если количество чисел больше 0, то выполняем дальнейший код, если нет - ничего;
            int a = Integer.parseInt(reader.readLine()); //считываем с консоли первое число для сравнения;
            int max = a; //Присваеваем переменной max первое считанное число;
            int b;

            for (int i = 1; i < step; i++) {//Создаем цикл;
                b = Integer.parseInt(reader.readLine());//Внутри цикла присваеваем переменной b считанные с консили значения оставшихся n чисел;
                max = max >= b ? max : b;//С помощью тернарного оператора сравниваем переменную max (в первый раз -
                                         //считанное вне цикла значение) с последующим;
            }
            //System.out.println("Максимальное из введенных чисел " + max);
            System.out.println(max);
        }
    }
}
