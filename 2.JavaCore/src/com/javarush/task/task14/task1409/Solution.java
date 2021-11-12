package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge) {
        Bridge bridge1 = new WaterBridge();
        Bridge bridge2 = new SuspensionBridge();
        System.out.println(bridge.getCarsCount());
    }
}

