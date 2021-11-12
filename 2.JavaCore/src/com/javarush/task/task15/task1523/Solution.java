package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int a;
    String s;
    private Solution (int a) {
        this.a = a;
    }
    protected Solution (String s) {
        this.s = s;
    }
    Solution (int a, String s) {
        this.a = a;
        this.s = s;
    }
    public Solution (String s, int a) {
        this.s = s;
        this.a = a;
    }
    public static void main(String[] args) {

    }
}

