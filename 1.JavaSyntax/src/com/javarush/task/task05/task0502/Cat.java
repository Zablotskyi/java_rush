package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.weight = 6;
        cat1.strength = 4;
        Cat cat2 = new Cat();
        cat2.age = 6;
        cat2.weight = 4;
        cat2.strength = 5;
        Cat cat3 = new Cat();
        cat3.age = 4;
        cat3.weight = 6;
        cat3.strength = 5;
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score>0; // return score > 0 ? true : false;
    }

    public static void main(String[] args) {

    }
}
