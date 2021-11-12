package com.javarush.task.task09.task0922;

/*
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strDate = reader.readLine(); //вводим дату строкой в формате текста

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); //создаем новый объект SimpleDateFormat с шаблоном, который совпадает с тем, что у нас в строке которую мы вводим.
        Date date = formatter.parse(strDate);

        SimpleDateFormat dateOutpu = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH); //создаем новый объект SimpleDateFormat с шаблоном, который нужен для вывода на экра.
        System.out.println(dateOutpu.format(date).toUpperCase());
    }
}

