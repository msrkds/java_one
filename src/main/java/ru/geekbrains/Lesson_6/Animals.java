package ru.geekbrains.Lesson_6;

public abstract class Animals {//super class
    protected String type;
    protected String name;
    private static int count = 0;

    public Animals(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int dist);

    public abstract void swim(int dist);

    public static int getCount() {
        return count;
    }
}
