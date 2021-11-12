package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.UKRAINE);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals(Country.UKRAINE)) {
                Hen ukrainianHen = new UkrainianHen();
                return ukrainianHen;
            }
            else if (country.equals(Country.MOLDOVA)) {
                Hen moldovanHen = new MoldovanHen();
                return moldovanHen;
            }
            else if (country.equals(Country.BELARUS)) {
                Hen belarusianHen = new BelarusianHen();
                return belarusianHen;
            }
            else if (country.equals(Country.RUSSIA)) {
                Hen russianHen = new RussianHen();
                return russianHen;
            }
            else
                return null;

        }
    }


}
