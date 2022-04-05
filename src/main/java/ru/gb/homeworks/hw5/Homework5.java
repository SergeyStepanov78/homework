package ru.gb.homeworks.hw5;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {

//        Employee employee1 = new Employee("User1", "junior", "user1@m.m", "921",1000,22);
//        employee1.printEmployee();
        Employee[] userArr = new Employee[5];
//        int age = 40;
        userArr[0] = new Employee("User1", "Junior", "user1@e.mail", "911", 1000, 23);
        userArr[1] = new Employee("User2", "Middle", "user2@e.mail", "921", 2000, 39);
        userArr[2] = new Employee("User3", "Senior", "user3@e.mail", "931", 3000, 41);
        userArr[3] = new Employee("User4", "PM", "user4@e.mail", "941", 4000, 40);
        userArr[4] = new Employee("User5", "PO", "user5@e.mail", "951", 5000, 42);
        for (Employee i : userArr) {
            if(i.getAge() > 40)
            System.out.print(">40 " +i);
        }

        System.out.println();
        System.out.println(Arrays.toString(userArr));
    }

//    Employee[] userArr = new Employee[5];
//    userArr[0] = new Employee("User1", "javaJunior", "user1@e.mail", "921", 1000, 23) {

//    }
}
