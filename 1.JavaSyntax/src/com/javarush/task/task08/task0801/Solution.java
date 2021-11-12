package com.javarush.task.task08.task0801;
import java.util.Set;
import java.util.HashSet;/*
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //создаем коллекцию Set и сразу инициализируем ее
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        //пишем цикл forEach для вывода строк коллекции, каждую с новой строки
        for (String text : set) {
            System.out.println(text);
        }
    }
}
