package lesson_7;

public class Main {
    public static void main(String[] args) {

        Cy_27 cy_27 = new Cy_27("Cy-27", 50, 10000, 10);

        cy_27.Start();
        cy_27.Takeoff();
        cy_27.setHeight(AirplaneControl.moveUP());
        cy_27.setHeight(AirplaneControl.moveDown());
        cy_27.setHeight(AirplaneControl.moveX());
        cy_27.setHeight(AirplaneControl.moveY());
        cy_27.Stels();
        cy_27.NuclearStrike();
        cy_27.Landing(cy_27.TurboBoost(cy_27.getSpeed()));
    }
}
