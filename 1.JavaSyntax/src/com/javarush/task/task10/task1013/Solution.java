package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private int weight;
        private int height;
        private String city;
        private String animals;
        private String hobby;

        public Human () {
        }
        public Human (int age, int weight, int height, String city, String animals, String hobby) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.city = city;
            this.animals = animals;
            this.hobby = hobby;
        }
        public Human (int weight, int height, String city, String animals, String hobby) {
            this.weight = weight;
            this.height = height;
            this.city = city;
            this.animals = animals;
            this.hobby = hobby;
        }
        public Human (int height, String city, String animals, String hobby) {
            this.height = height;
            this.city = city;
            this.animals = animals;
            this.hobby = hobby;
        }
        public Human (String city, String animals, String hobby) {
            this.city = city;
            this.animals = animals;
            this.hobby = hobby;
        }
        public Human (String animals, String hobby) {
            this.animals = animals;
            this.hobby = hobby;
        }
        public Human (String hobby) {
            this.hobby = hobby;
        }
        public Human (int age, String hobby) {
            this.age = age;
            this.hobby = hobby;
        }
        public Human (int age, String city, String hobby) {
            this.age = age;
            this.city = city;
            this.hobby = hobby;
        }
        public Human (int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

    }
}
