package ru.geekbrains.lesson_7;

public class Cat {
    private String name;
    private int appetite;
    public boolean satiety;
    
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    
    public void setName(String name) {
    	this.name = name;
    	}
    
    public String getName() {
    	return name;
    	}
    
    public void setAppetite(int appetite) {
    	this.appetite = appetite;
    	}
    
    public int getAppetite() {
    	return appetite;
    	}


    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

