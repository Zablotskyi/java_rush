package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        Infinity infinity = new Infinity();
        AnException exception = new AnException();
        Hooray hooray = new Hooray();
        Messages messages = new Messages();
        Keyboard keyboard = new Keyboard();

        Thread infinityThread = new Thread(infinity);
        Thread exceptionThread = new Thread(exception);
        Thread hoorayThread = new Thread(hooray );
        Thread messagesThread = new Thread(messages);
        Thread keyboardThread = new Thread(keyboard);

        threads.add(infinityThread);
        threads.add(exceptionThread);
        threads.add(hoorayThread);
        threads.add(new Messages());
        threads.add(keyboardThread);

    }

    public static void main(String[] args) throws InterruptedException {

    }
}