package java2.homeworks.hw1.task1;

public class Cat implements Running, Jumping {

    @Override
    public void run() {
        System.out.println("Cat don't want run at all");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumped to the tree");
    }
}