package ru.gb.homeworks.hw5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee () {
         System.out.printf("Employee: name-%s, position-%s, email-%s, phone-%s, salary-%d, age-%d\n", name, position, email, phone, salary, age);
    }

    public int getAge() {
        return this.age;
    }

//    @Override
//    public String toString() {
//        return String.format("Employee: name-%s, position-%s, email-%s, phone-%s, salary-%d, age-%d\n", name, position, email, phone, salary, age);
//    }
}
