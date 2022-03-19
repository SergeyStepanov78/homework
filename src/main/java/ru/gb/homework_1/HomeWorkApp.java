package ru.gb.homework_1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -9;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int intValue = 101;
        if (intValue <= 0) {
            System.out.println("Красный");
        }

        if (intValue > 0 && intValue <= 100) {
            System.out.println("Жёлтый");
        }

        if (intValue > 100) {
            System.out.println("Зелёный");
        }
    }

    private static void compareNumbers() {
        int a = 22;
        int b = 22;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
