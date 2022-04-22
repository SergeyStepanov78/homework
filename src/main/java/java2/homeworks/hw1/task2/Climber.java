package java2.homeworks.hw1.task2;

public class Climber implements Wall, RunningTrack {

    @Override
    public void climb(int heightWall, int heightClimbed, String name) {
        if (heightClimbed >= heightWall) {
            System.out.printf("%s успешно залез\n", name);
        }
        else {
            System.out.printf("%s не залез\n", name);
        }
    }

    public void run(int distanceTrack, int distanceRan, String name) {
        if (distanceRan >= distanceTrack) {
            System.out.printf("%s успешно пробежал\n", name);
        }
        else {System.out.printf("%s не пробежал\n", name);
        }
    }
}
