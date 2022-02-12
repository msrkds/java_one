package ru.geekbrains.Lesson_6;

import java.util.Random;

public class HomeWorkApp {
    public static Random random = new Random();

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Снежок");

        Dog dog1 = new Dog("Полкан");
        Dog dog2 = new Dog("Шарик");

        System.out.println();

        dog1.run(random.nextInt(700));
        dog1.swim(random.nextInt(13));
        dog2.run(random.nextInt(700));
        dog2.swim(random.nextInt(13));
        System.out.println();

        cat1.run(random.nextInt(300));
        cat1.swim(random.nextInt(13));
        cat2.run(random.nextInt(300));
        cat2.swim(random.nextInt(13));
        System.out.println();

        System.out.println("Cat: " + Cat.getCount());
        System.out.println("Dog: " + Dog.getCount());
        System.out.println("Animals: " + Animals.getCount());
    }










}
