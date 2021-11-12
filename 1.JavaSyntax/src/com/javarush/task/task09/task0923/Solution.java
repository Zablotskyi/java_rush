package com.javarush.task.task09.task0923;

/*
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char [] array = string.toCharArray();
        for (int i = 0; i < array.length; i ++) {
            if (isVowel(array[i]) == true)
                System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i ++) {
            if (!isVowel(array[i]) && (array[i] != ' '))
                System.out.print(array[i] + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}