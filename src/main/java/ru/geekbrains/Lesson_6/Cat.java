package ru.geekbrains.Lesson_6;

public class Cat extends Animals {
    private static int count = 0;
    private final int LIMIT_RUN = 200;

    public Cat(String name) {
        super(name);
        this.type = "Кот";
        count++;
    }

    @Override
    public void run(int dist) {
        if (this.LIMIT_RUN >= dist) {
            System.out.println(this.type + "  " + this.name + " пробежал " + dist + " м.");
        }
        else {
            System.out.println(this.type + "  " + this.name + " не может пробежать " + dist + " м.");
        }
    }

    @Override
    public void swim(int dist) {
        System.out.println(this.type + "  " + this.name + " не любит плавать");
    }

    public static int getCount() {
        return count;
    }
}
