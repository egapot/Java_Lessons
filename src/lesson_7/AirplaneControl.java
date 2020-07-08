package lesson_7;

public class AirplaneControl {
    static int move() {
        int moveDistance = (int) (Math.random() * 500);
        return moveDistance;
    }
    static int moveUP() {
        int distance = AirplaneControl.move();
        System.out.println("Airplane move up by " + distance + " m" );
        return distance;
    }
    static int moveDown() {
        int distance = AirplaneControl.move();
        System.out.println("Airplane move down by " + distance + " m" );
        return -distance;
    }
    static int moveX() {
        int distance = AirplaneControl.move();
        System.out.println("Airplane move X by " + distance + " m" );
        return distance;
    }
    static int moveY() {
        int distance = AirplaneControl.move();
        System.out.println("Airplane move Y by " + distance + " m" );
        return distance;
    }

}
