package com.javarush.task.task16.task1632;

class Hooray implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
