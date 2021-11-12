package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int  top, left, width, height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int height) {
        this.left = left;
        this.height = height;
    }
    public void initialize(int top, int width, int height) {
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(int width) {
        this.width = width;
    }

    public static void main(String[] args) {

    }
}
