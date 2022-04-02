package ru.gb.homeworks;

public class Homework2 {

    public static void main(String[] args) {
        homeTask1();
        homeTask1WithReturn(17, 8);
        System.out.println(homeTask1WithReturn(17, 8));
        homeTask2(-1);
        homeTask3(2);
        System.out.println(homeTask3(-2));
        getStringAndNumber("string", 10);
        visokosnyYear();
    }

    public static void visokosnyYear() {
        for (int b = 1; b < 100; b++) {
            if (b == 400) {
                System.out.println("Високосный год");
            }
            for (int a = 1; a < 4; a++) {
                System.out.println("Невисокосный год");
            }
            System.out.println("Високосный год");
        }
    }

    public static void getStringAndNumber(String word, int count) {
//        int i;
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    public static boolean homeTask3(int i) {
        return i < 0;
    }

    public static void homeTask2(int i) {
        if (i < 0) {
            System.out.println("отрицательное");
        } else {
            System.out.println("положительное");
        }
    }


    public static boolean homeTask1WithReturn(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void homeTask1() {
        int a = 8;
        int b = 9;
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
