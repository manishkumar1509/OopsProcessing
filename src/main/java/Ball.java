import processing.core.PApplet;

public class Ball implements  Shape{
    private int positionX;
    private final int positionY;
    private final int speed;
    private static final int DIAMETER = 10;

    public Ball(int positionX, int positionY, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    public void move() {
        positionX += speed;
    }

    public void display(PApplet pApplet) {
        pApplet.ellipse(positionX, positionY, DIAMETER, DIAMETER);
    }
}