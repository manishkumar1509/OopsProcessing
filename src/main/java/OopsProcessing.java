import processing.core.PApplet;

public class OopsProcessing extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480 / 5;
    private static final int DIAMETER = 10;
    private Ball ball1, ball2, ball3, ball4;

    public static void main(String[] args) {
        PApplet.main("OopsProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT * 5);
    }

    @Override
    public void setup() {
        ball1 = new Ball(0, HEIGHT, DIAMETER, DIAMETER, 1);
        ball2 = new Ball(0, 2 * HEIGHT, DIAMETER, DIAMETER, 2);
        ball3 = new Ball(0, 3 * HEIGHT, DIAMETER, DIAMETER, 3);
        ball4 = new Ball(0, 4 * HEIGHT, DIAMETER, DIAMETER, 4);
    }

    @Override
    public void draw() {
        displayBalls();
        moveBalls();
    }

    private void moveBalls() {
        ball1.move();
        ball2.move();
        ball3.move();
        ball4.move();
    }

    private void displayBalls() {
        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
    }

    public class Ball {
        int positionX;
        int positionY;
        int width;
        int height;
        int speed;

        public Ball(int positionX, int positionY, int width, int height, int speed) {
            this.positionX = positionX;
            this.positionY = positionY;
            this.width = width;
            this.height = height;
            this.speed = speed;
        }

        public void display() {
            ellipse(positionX, positionY, width, height);
        }

        public void move() {
            positionX += speed;
        }
    }
}
