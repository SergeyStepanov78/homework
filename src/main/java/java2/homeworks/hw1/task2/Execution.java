package java2.homeworks.hw1.task2;

public class Execution {

/*
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
 */

    public static void main(String[] args) {

        Climber climber1 = new Climber();
        climber1.climb(100, 100, "Альпинист1");
        climber1.run(5000, 3000, "Альпинист1");

        System.out.println();

        Runner runner1 = new Runner();
        runner1.run(5000, 5000, "Бегун1");
        runner1.climb(100, 10, "Бегун1");
    }
}
