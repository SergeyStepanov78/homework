package ru.gb.homeworks.hw6;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public void swim(int distance) {
        System.out.printf("%s cannot swim\n", name);
    }
}
