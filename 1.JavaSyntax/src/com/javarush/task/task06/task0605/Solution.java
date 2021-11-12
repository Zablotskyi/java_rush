package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double bmi = weight / height * height;
            System.out.println ((bmi < 18.5) ? "Недовес: меньше чем 18.5" :
                    (bmi >= 18.5 && bmi < 25) ? "Нормальный: между 18.5 и 25" :
                    (bmi >= 25 && bmi < 30) ? "Избыточный вес: между 25 и 30" :
                    (bmi >= 30) ? "Ожирение: 30 или больше" : "Ожирение: 30 или больше");
        }
    }
}
