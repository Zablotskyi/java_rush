package com.javarush.task.task16.task1632;

class AnException implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("InterruptedException");
        }
    }
}
