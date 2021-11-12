package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                for (int i = 0, j = numSeconds; i < j; i ++) {
                    System.out.print(numSeconds + " ");
                    sleep(1000);
                    numSeconds --;
                }
                System.out.println("Марш!");
            }
            catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
        }
    }
}
