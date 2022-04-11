package ru.gb.homeworks.hw6;

public class Animal {
    protected String name;
    protected int distance;

    public Animal(){
        super();
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public void run(int distance) {
        System.out.printf("%s run %d meters\n", name, distance);
    }

    public void swim(int distance) {
        System.out.printf("%s swim %d meters\n", name, distance);
    }
}
