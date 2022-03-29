package ru.gb.homeworks;

import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {
//        replaceValue();
//        toFillArray();
//        multipleByTwo();
//        drawDiagonal();
//        returnInitialValue(4,77);
        minAndMax();
    }

/*
         6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 */
    public static void minAndMax () {
        int[] arr = new int[] {-2, -5, -3, -4, -1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) min = arr[i]; // почему код блока if работает и без фигурных скобок?
        }
        System.out.println("max value is " + max);
        System.out.println("min value is " + min);
    }


/*
         5. Написать метод, принимающий на вход два аргумента: len и initialValue,
            и возвращающий одномерный массив типа int длиной len,
            каждая ячейка которого равна initialValue;
 */
    public static int[] returnInitialValue(int len, int initialValue) {
        int[] intArr = new int[len];
         for (int i = 0;  i < intArr.length; i++) {
             intArr[i] = initialValue;
         }
        System.out.println(Arrays.toString(intArr));
         return intArr;
    }

    /*
        4. Создать квадратный двумерный целочисленный массив
           (количество строк и столбцов одинаковое),
           и с помощью цикла(-ов) заполнить его диагональные элементы единицами
           (можно только одну из диагоналей, если обе сложно).
           Определить элементы одной из диагоналей можно по следующему
           принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
           (второая диагональ j = N - 1 - i)
     */
    public static void drawDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
           пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void multipleByTwo() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    /*
        2. Задать пустой целочисленный массив длиной 100.
           С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void toFillArray() {
        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
           Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
           С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
    public static void replaceValue() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}