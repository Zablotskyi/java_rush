package com.javarush.task.task16.task1632;

class Messages extends Thread implements Message {
    boolean isClose = true;
    @Override
    public void showWarning() {
        isClose = false;
    }

    @Override
    public void run() {
        while (isClose) {
        }
    }
}

