package java2.homeworks.hw1.task1;

public class Human implements Running, Jumping {

    @Override
    public void run() {
        System.out.println("Human run 5t.km");
    }

    @Override
    public void jump() {
        System.out.println("Human jumped 2meters");
    }
}