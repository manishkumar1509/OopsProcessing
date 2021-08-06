import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class OopsProcessing extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480 / 5;
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
        Ball ball1 = new Ball(0, HEIGHT, 1);
        Box box1 = new Box(0, 2 * HEIGHT, 2);
        Ball ball3 = new Ball(0, 3 * HEIGHT, 3);
        Ball ball4 = new Ball(0, 4 * HEIGHT, 4);
        balls = Arrays.asList(ball1, box1, ball3, ball4);
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.display(this));
        balls.forEach(Shape::move);
    }
}
