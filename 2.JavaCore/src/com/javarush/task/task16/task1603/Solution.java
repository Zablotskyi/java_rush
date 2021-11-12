package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread thread1 = new SpecialThread();
        Thread childThread1 = new Thread(thread1);
        SpecialThread thread2 = new SpecialThread();
        Thread childThread2 = new Thread(thread2);
        SpecialThread thread3 = new SpecialThread();
        Thread childThread3 = new Thread(thread3);
        SpecialThread thread4 = new SpecialThread();
        Thread childThread4 = new Thread(thread4);
        SpecialThread thread5 = new SpecialThread();
        Thread childThread5 = new Thread(thread5);

        list.add(childThread1);
        list.add(childThread2);
        list.add(childThread3);
        list.add(childThread4);
        list.add(childThread5);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
