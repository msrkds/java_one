package ru.geekbrains.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    public static char[][] map;
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int row = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    row++;
                    if (row == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    row = 0;
                }
            }
        }
        for (int j = 0; j < SIZE; j++) {
            int column=0;
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] == symbol) {
                    column++;
                    if (column == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    column = 0;
                }
            }
        }
        for (int diagonal = 0; diagonal < SIZE; diagonal++) {
            int mainDiag = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if ((i - j == diagonal) && (map[i][j] == symbol)) {
                        mainDiag++;
                        if (mainDiag == DOTS_TO_WIN) {
                            return true;
                        }
                    } else if ((i - j == diagonal) && (map[i][j] != symbol)) {
                        mainDiag = 0;
                    }
                }
            }
        }
        for (int diagonal = 0; diagonal < SIZE; diagonal++) {
            int mainDiag = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if ((j - i == diagonal) && (map[i][j] == symbol)) {
                        mainDiag++;
                        if (mainDiag == DOTS_TO_WIN) {
                            return true;
                        }
                    } else if ((j - i == diagonal) && (map[i][j] != symbol)) {
                        mainDiag = 0;
                    }
                }
            }
        }
        for (int diagonal = 0; diagonal < SIZE + SIZE - 1; diagonal++) {
            int subDiag = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if ((i + j == diagonal) && (map[i][j] == symbol)) {
                        subDiag++;
                        if (subDiag == DOTS_TO_WIN) {
                            return true;
                        }
                    } else if ((i + j == diagonal) && (map[i][j] != symbol)) {
                        subDiag = 0;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}
