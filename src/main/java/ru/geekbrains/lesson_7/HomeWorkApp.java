package ru.geekbrains.lesson_7;

import java.util.Scanner;

public class HomeWorkApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filling;
		Cat[] cats = new Cat[5];
		cats[0] = new Cat("Барсик", 5, false);
		cats[1] = new Cat("Стёпа", 30, false);
		cats[2] = new Cat("Рыжик", 10, false);
		cats[3] = new Cat("Боня", 15, false);
		cats[4] = new Cat("Мурзик", 25, false);

		Plate plate = new Plate(40);
		plate.info();
		
		int countOfWellFedCats = 0;
		
		while (countOfWellFedCats < cats.length) {
			for (Cat cat : cats) {
				if (cat.satiety == false && cat.getAppetite() < plate.getFood()) {
					cat.eat(plate);
					cat.satiety = true;
					countOfWellFedCats++;
					System.out.println("Кот " + cat.getName() + " сыт");
				} else if (cat.satiety == false && cat.getAppetite() > plate.getFood()){
					System.out.println("Кот " + cat.getName() + " голоден");
				}
			}
			plate.info();
			System.out.println("Добавьте еды в миску!");
			filling = sc.nextInt();
			plate.increaseFood(filling);
			plate.info();
		}

		

		
	}
}
