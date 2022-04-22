package java2.homeworks.hw1.task1;

public class InterfacesExecution {

    /*
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
консоль).
 */

    public static void main(String[] args) {

        Human human = new Human();
        human.run();
        human.jump();

        Cat cat = new Cat();
        cat.run();
        cat.jump();

        Robot robot = new Robot();
        robot.run();
        robot.jump();
    }
}
