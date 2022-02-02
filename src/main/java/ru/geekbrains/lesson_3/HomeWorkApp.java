package ru.geekbrains.lesson_3;


import java.util.Arrays;
import java.util.Scanner;



public class HomeWorkApp {

    /*  1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     *  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     *  С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==0) {
                arr[i]=1;
            } else if (arr[i]==1) {
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*  2. Задать пустой целочисленный массив длиной 100.
     *  С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }


    /*  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     *   пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<6) {
                arr[i]*=2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну
     * из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
     * принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void fillDiagonal() {
        System.out.print("Введите размер массива:  ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if ((i==j)||(i==n-1-j)) {
                    arr[i][j]=1;
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
     * равна initialValue;
     */
    public static int[] make1Arr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }


    /* 6. * Задать одномерный массив и найти в нем
     *  минимальный и максимальный элементы ;
     */
    public static void minMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }


    /* 7. ** Написать метод, в который передается не пустой одномерный
     * целочисленный массив, метод должен вернуть true, если в массиве
     * есть место, в котором сумма левой и правой части массива равны.
     */
    public static boolean checkBalance(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = 0;
            for(int j=0; j<=i; j++) {
                left += arr[j];
            }
            for(int l=i+1; l<arr.length; l++) {
                right += arr[l];

            }
            if (left == right) {
                return true;
            }

        }
        return false;
    }


    /* 8. Написать метод, которому на вход подается одномерный массив и число n
     * (может быть положительным, или отрицательным), при этом метод должен
     * сместить все элементы массива на n позиций. Элементы смещаются циклично.
     * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
     * [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     */
    public static int[] shiftArr(int[] in, int step) {
        if (step < 0) {
            for (int i=step; i<0; i++) {
                int temp = in[0];
                for (int j=0; j<in.length; j++) {
                    if ((j+1)<in.length) {
                        in[j] = in[j+1];
                    } else {
                        in[j] = temp;
                    }
                }
            }
        } else if (step>0) {
            for (int i=0; i<step; i++) {
                int temp = in[in.length-1];
                for (int j=in.length-1; j>0; j--) {
                    in[j] = in[j-1];
                }
                in[0] = temp;
            }
        }
        return in;
    }

    public static void main(String[] args) {
        invertArray();
        System.out.println();

        fillArray();
        System.out.println();

        changeArray();
        System.out.println();

        fillDiagonal();
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива:  ");
        int len = scan.nextInt();
        System.out.print("Введите значение ячейки:  ");
        int initialValue = scan.nextInt();
        System.out.println(Arrays.toString(make1Arr(len, initialValue)));
        System.out.println();


        System.out.print("Введите размер массива:  ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        minMax(arr);
        System.out.println();


        int[] arr1 = {2, 2, 5, 1, 2, 2, 10, 1 };
        System.out.println(checkBalance(arr1));
        int[] arr2 = {1, 1, 1, 2, 1 };
        System.out.println(checkBalance(arr2));
        System.out.println();


        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(shiftArr(arr3, 3)));
        System.out.println(Arrays.toString(shiftArr(arr3, -3)));
        System.out.println(Arrays.toString(shiftArr(arr3, -3)));
    }
}
