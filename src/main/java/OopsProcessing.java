import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class OopsProcessing extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480 / 5;
    private static final int SPEED = 1;
    public static final int POSITION_X = 0;
    List<Shape> balls;

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
        Ball ball1 = new Ball(POSITION_X, HEIGHT, SPEED);
        Box box1 = new Box(POSITION_X, 2 * HEIGHT, SPEED * 2);
        Ball ball3 = new Ball(POSITION_X, 3 * HEIGHT, SPEED * 3);
        Ball ball4 = new Ball(POSITION_X, 4 * HEIGHT, SPEED * 4);
        balls = Arrays.asList(ball1, box1, ball3, ball4);
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.display(this));
        balls.forEach(Shape::move);
    }
}
