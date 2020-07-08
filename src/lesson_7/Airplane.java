package lesson_7;

import java.util.Random;

abstract class Airplane {
    Random random = new Random();
    private int height;
    private int offsetByX;
    private int offsetByY;
    final  String Model;
    private int speed;
    final int MAX_HEIGHT;

    public Airplane(String model, int speed, int max_height) {
        Model = model;
        this.speed = speed;
        MAX_HEIGHT = max_height;
    }


    abstract void Start();

    public void Takeoff(){
    height = random.nextInt(500)+500;
    offsetByX = random.nextInt(50);
    offsetByY = random.nextInt(50);
        System.out.println("TAKEOFF successful");
    }

    public void Landing(int speed){
        int distance = (int) Math.sqrt((offsetByX*offsetByX)+(offsetByY*offsetByY))+height;
        int time = distance/speed;
        System.out.println("Landing successful. landing continued " + time);
        height = 0;
        offsetByX = 0;
        offsetByY = 0;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (this.height<MAX_HEIGHT & (height+this.height)<MAX_HEIGHT)
        this.height = height;
        else {
            System.out.println("This plane cannot fly above "+ MAX_HEIGHT);
        }

    }

    public int getOffsetByX() {
        return offsetByX;
    }

    public void setOffsetByX(int offsetByX) {
        this.offsetByX = offsetByX;
    }

    public int getOffsetByY() {
        return offsetByY;
    }

    public void setOffsetByY(int offsetByY) {
        this.offsetByY = offsetByY;
    }

    public int getSpeed() {
        return speed;
    }
}
