package ru.geekbrains.Lesson_6;

public class Dog extends Animals {
    private static int count = 0;
    private final int LIMIT_RUN = 500;
    private final int LIMIT_SWIM = 10;

    public Dog(String name) {
        super(name);
        this.type = "Собака";
        count++;
    }

    @Override
    public void run(int dist) {
        if (this.LIMIT_RUN >= dist) {
            System.out.println(this.type + "  " + this.name + " пробежала " + dist + " м.");
        }
        else {
            System.out.println(this.type + "  " + this.name + " не может пробежать " + dist + " м.");
        }

    }

    @Override
    public void swim(int dist) {
        if (this.LIMIT_SWIM >= dist) {
            System.out.println(this.type + "  " + this.name + " проплыла " + dist + " м.");
        }
        else {
            System.out.println(this.type + "  " + this.name + " не может проплыть " + dist + " м.");
        }

    }

    public static int getCount() {
        return count;
    }
}