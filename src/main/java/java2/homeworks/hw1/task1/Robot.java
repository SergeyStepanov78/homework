package java2.homeworks.hw1.task1;

public class Robot implements Running, Jumping {

    @Override
    public void run() {
        System.out.println("Robot walked");
    }

    @Override
    public void jump() {
        System.out.println("Robot cannot jump");
    }
}