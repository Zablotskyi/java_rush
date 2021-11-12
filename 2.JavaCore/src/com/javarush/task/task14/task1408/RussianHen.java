package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 1;
        //return (int) (Math.random() * 50);
    }
}
