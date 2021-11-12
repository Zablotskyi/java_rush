package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country {
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 50;
        //return (int) (Math.random() * 50);
    }
}
