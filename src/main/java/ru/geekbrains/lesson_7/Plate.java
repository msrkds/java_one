package ru.geekbrains.lesson_7;

public class Plate {
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public void setFood(int food) {
    	this.food = food;
    	}
    
    public int getFood() {
    	return food;
    	}

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food += x;
    }
    
    public void info() {
        System.out.println("Всего еды в миске: " + food);
    }
}
