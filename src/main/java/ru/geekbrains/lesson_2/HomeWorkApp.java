package ru.geekbrains.lesson_2;

public class HomeWorkApp {

    public static boolean within10and20(int a, int b) {
        return (a+b >= 10)&&(a+b <= 20);
    }

    public static void isPositiveOrNegative(int digit) {
        if (digit >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int digit) {
        return digit < 0;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i=0; i<times; i++) {
            System.out.println(word);
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0)&&(year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {

    }
}

